/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pos.mvc.db.DBConnection;
import pos.mvc.model.ItemModel;
import java.sql.SQLException;

/**
 *
 * @author Himasha Lokusuriya
 */
public class ItemController {
    public ArrayList<ItemModel> getAllItems()throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "Select * From Item";
        PreparedStatement statement = connection.prepareStatement(query);
        
        ResultSet rst = statement.executeQuery();
        
        ArrayList<ItemModel> itemModels = new ArrayList<>();
        
        while(rst.next()){
            ItemModel item;
            item = new ItemModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
            
             itemModels.add(item);
        }
        return itemModels; 
    }
   
    public String saveitem(ItemModel item)throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
         String query= "Insert INTO Item VALUES(?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareCall(query);
        preparedStatement.setString(1,item.getItemcode());
        preparedStatement.setString(2,item.getDescription());
        preparedStatement.setString(3,item.getPackSize());
        preparedStatement.setDouble(4,item.getUnitPrize());
        preparedStatement.setInt(5,item.getQoh());
       
        
        if(preparedStatement.executeUpdate()>0){
            return "Success";
        }else{
            return "Fail";
        }
        
    }
    
    public ItemModel getItem(String itemCode)throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "Select * From Item WHERE itemCode= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, itemCode);
        
        ResultSet rst = statement.executeQuery();
        
        while(rst.next()){
            ItemModel item=new ItemModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
                    
                    return item;
        }
        return null;
    }
}
    

