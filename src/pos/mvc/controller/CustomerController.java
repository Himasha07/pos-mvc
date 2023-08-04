/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import pos.mvc.model.CustomerModel;
import java.sql.Connection;
import java .sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import pos.mvc.db.DBConnection;


/**
 *
 * @author Himasha Lokusuriya
 */
public class CustomerController {
    public String saveCustomer(CustomerModel customer)throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
    
        String query= "Insert INTO CUSTOMER VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareCall(query);
        preparedStatement.setString(1,customer.getCustID());
        preparedStatement.setString(2,customer.getTitle());
        preparedStatement.setString(6,customer.getAddress());
        preparedStatement.setString(7,customer.getCity());
        preparedStatement.setString(4,customer.getDob());
        preparedStatement.setString(3,customer.getName());
        preparedStatement.setString(8,customer.getProvince());
        
        preparedStatement.setString(9,customer.getZip());
        preparedStatement.setDouble(5,customer.getSalary());
        
        if(preparedStatement.executeUpdate()>0){
            return "Success";
        }else{
            return "Fail";
        }
        
    }
    
    public ArrayList<CustomerModel> getAllCustomers()throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "Select * From Customer";
        PreparedStatement statement = connection.prepareStatement(query);
        
        ResultSet rst = statement.executeQuery();
        
        ArrayList<CustomerModel> customerModels = new ArrayList<>();
        
        while(rst.next()){
            CustomerModel cm;
            cm = new CustomerModel(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getDouble(5));
            
            customerModels.add(cm);
                    
                    
        }
        return customerModels;
    }
}
