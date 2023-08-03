/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import pos.mvc.model.CustomerModel;
import java.sql.Connection;
import java .sql.PreparedStatement;
import java.sql.SQLException;
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
        preparedStatement.setString(2,customer.getAddress());
        preparedStatement.setString(3,customer.getCity());
        preparedStatement.setString(4,customer.getDob());
        preparedStatement.setString(5,customer.getName());
        preparedStatement.setString(6,customer.getProvince());
        preparedStatement.setString(7,customer.getTitle());
        preparedStatement.setString(8,customer.getZip());
        preparedStatement.setDouble(9,customer.getSalary());
        
        if(preparedStatement.executeUpdate()>0){
            return "Success";
        }else{
            return "Fail";
        }
        
    }
}
