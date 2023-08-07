/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import java.util.ArrayList;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pos.mvc.db.DBConnection;

/**
 *
 * @author Himasha Lokusuriya
 */
public class OrderController {

    public String placeOrder(OrderModel orderModel, ArrayList<OrderDetailModel> orderDetailModels) throws SQLException {
        
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            String orderQuery = "Insert Into Orders Values(?,?,?)";
            
            PreparedStatement statementForOrder = connection.prepareStatement(orderQuery);
            statementForOrder.setString(1, orderModel.getOrderId());
            statementForOrder.setString(2, orderModel.getOrderdate());
            statementForOrder.setString(3, orderModel.getCustomerID());
            
            if(statementForOrder.executeUpdate()>0){
                String orderDetailQuery = "Insert Into orderdetail Values (?,?,?,?)";
                
                boolean isOrderDetailSaved = true;
                
                for(OrderDetailModel orderDetailModel: orderDetailModels){
                    PreparedStatement statementForOrderDetail = connection.prepareStatement(orderDetailQuery);
                    statementForOrderDetail.setString(1, orderModel.getOrderId());
                    statementForOrderDetail.setString(2, orderDetailModel.getItemCode());
                    statementForOrderDetail.setInt(3, orderDetailModel.getQty());
                    statementForOrderDetail.setDouble(4, orderDetailModel.getDiscount());
                    
                    if(!(statementForOrderDetail.executeUpdate()>0)){
                        isOrderDetailSaved = false;
                    }
                     
                }
                
               if(isOrderDetailSaved){
                   
                   boolean isItemUpdated = true;
                     String itemQuery = "Update item SET QtyOnHand=QtyOnHand-? WHERE ItemCode=?";   
                     for (OrderDetailModel orderDetailModel : orderDetailModels) {
                       PreparedStatement statementForItem = connection.prepareStatement(itemQuery); 
                       statementForItem.setInt(1, orderDetailModel.getQty());
                       statementForItem.setString(2, orderDetailModel.getItemCode());
                       
                       if(!(statementForItem.executeUpdate()>=0)){
                        isItemUpdated = false;
                    }
                   }
                     
                     if(isItemUpdated){
                         connection.commit();
                         return "Success";
                     }else{
                        connection.rollback();
                        return "Item Update error"; 
                     }
                }else{
                   connection.rollback();
                   return "Order Detail Save error";
               }
                
            }else{
                connection.rollback();
                return "Order Save Error";
            }
            
        } catch (Exception e) {
            connection.rollback();
             e.printStackTrace();
                return e.getMessage();
               
        }finally{
            connection.setAutoCommit(true);
        }
        
    }
    
}
