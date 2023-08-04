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
    
    public CustomerModel getCustomer(String custID)throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "Select * From Customer WHERE CustID= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, custID);
        
        ResultSet rst = statement.executeQuery();
        
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
            return cm;
        }
        return null;
    }
    
    public String updateCustomer(CustomerModel customerModel) throws SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "Update Customer SET custTitle = ?,CustName=?, DOB=?, salary=?, CustAddress=?, City=?, Province=?, PostalCode=? Where CustID=?";
        
        PreparedStatement preparedStatement = connection.prepareCall(query);
        preparedStatement.setString(9,customerModel.getCustID());
        preparedStatement.setString(1,customerModel.getTitle());
        preparedStatement.setString(5,customerModel.getAddress());
        preparedStatement.setString(6,customerModel.getCity());
        preparedStatement.setString(3,customerModel.getDob());
        preparedStatement.setString(2,customerModel.getName());
        preparedStatement.setString(7,customerModel.getProvince());
        
        preparedStatement.setString(8,customerModel.getZip());
        preparedStatement.setDouble(4,customerModel.getSalary());
        
        if(preparedStatement.executeUpdate()>0){
            return "Success";
        }else{
            return "Fail";
        }
    }
}
