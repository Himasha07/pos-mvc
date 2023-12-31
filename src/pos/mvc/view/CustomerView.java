/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.model.CustomerModel;

/**
 *
 * @author Himasha Lokusuriya
 */
public class CustomerView extends javax.swing.JFrame {

    private CustomerController customerController;
    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
       customerController = new CustomerController(); 
        initComponents();
         loadAllCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        headerpanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        formpanel = new javax.swing.JPanel();
        custidlabel = new javax.swing.JLabel();
        custidtext = new javax.swing.JTextField();
        custtitlelabel = new javax.swing.JLabel();
        custtitletext = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custDOBLabel = new javax.swing.JLabel();
        custAdderssText = new javax.swing.JTextField();
        custAdderssLabel = new javax.swing.JLabel();
        custDOBText = new javax.swing.JTextField();
        custCityLabel = new javax.swing.JLabel();
        custCityText = new javax.swing.JTextField();
        custProvinceLabel = new javax.swing.JLabel();
        custProvinceText = new javax.swing.JTextField();
        custPClabel = new javax.swing.JLabel();
        custPCText = new javax.swing.JTextField();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        addbutton2 = new javax.swing.JButton();
        custSalarLabel1 = new javax.swing.JLabel();
        custSalaryText1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        tablePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Customer");

        custidlabel.setText("Customer ID");

        custidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custidtextActionPerformed(evt);
            }
        });

        custtitlelabel.setText("Customer Title");

        custtitletext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custtitletextActionPerformed(evt);
            }
        });

        custNameLabel.setText("Customer Name");

        custNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTextActionPerformed(evt);
            }
        });

        custDOBLabel.setText("Customer DOB");

        custAdderssText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custAdderssTextActionPerformed(evt);
            }
        });

        custAdderssLabel.setText(" Address");

        custDOBText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDOBTextActionPerformed(evt);
            }
        });

        custCityLabel.setText(" City");

        custCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custCityTextActionPerformed(evt);
            }
        });

        custProvinceLabel.setText(" Province");

        custProvinceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProvinceTextActionPerformed(evt);
            }
        });

        custPClabel.setText(" Postal code");

        custPCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPCTextActionPerformed(evt);
            }
        });

        updatebutton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        updatebutton.setText("Update Customer");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        deletebutton.setText("Delete Customer");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        addbutton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        addbutton2.setText("Save Customer");
        addbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton2ActionPerformed(evt);
            }
        });

        custSalarLabel1.setText(" Salary");

        custSalaryText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSalaryText1ActionPerformed(evt);
            }
        });

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout formpanelLayout = new javax.swing.GroupLayout(formpanel);
        formpanel.setLayout(formpanelLayout);
        formpanelLayout.setHorizontalGroup(
            formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletebutton)
                .addGap(26, 26, 26)
                .addComponent(updatebutton)
                .addGap(18, 18, 18)
                .addComponent(addbutton2)
                .addGap(765, 765, 765))
            .addGroup(formpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custCityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custPClabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formpanelLayout.createSequentialGroup()
                                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custtitlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custAdderssText, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custPCText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(formpanelLayout.createSequentialGroup()
                                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(formpanelLayout.createSequentialGroup()
                                                .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(custProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(formpanelLayout.createSequentialGroup()
                                                .addComponent(custtitletext, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(custidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(formpanelLayout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(custSalarLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(custSalaryText1)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(812, 812, 812))
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addComponent(custAdderssLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(668, 668, 668))
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        formpanelLayout.setVerticalGroup(
            formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custidlabel)
                    .addComponent(custidtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custNameLabel)
                        .addComponent(custNameText))
                    .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custtitlelabel)
                        .addComponent(custtitletext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(custSalarLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(custSalaryText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(custDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custAdderssText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custPCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addComponent(custDOBLabel)
                        .addGap(18, 18, 18)
                        .addComponent(custAdderssLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custProvinceLabel)
                            .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(custCityLabel)
                                .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custPClabel)))
                .addGap(18, 18, 18)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebutton)
                    .addComponent(deletebutton)
                    .addComponent(addbutton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addGroup(headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custidtextActionPerformed

    private void custtitletextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custtitletextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custtitletextActionPerformed

    private void custNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTextActionPerformed

    private void custAdderssTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custAdderssTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custAdderssTextActionPerformed

    private void custDOBTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custDOBTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custDOBTextActionPerformed

    private void custCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custCityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custCityTextActionPerformed

    private void custProvinceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProvinceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custProvinceTextActionPerformed

    private void custPCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custPCTextActionPerformed

    private void addbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton2ActionPerformed
            saveCustomer();
    }//GEN-LAST:event_addbutton2ActionPerformed

    private void custSalaryText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSalaryText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custSalaryText1ActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
            searchCustomer();
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTableMouseClicked

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_deletebuttonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton2;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel custAdderssLabel;
    private javax.swing.JTextField custAdderssText;
    private javax.swing.JLabel custCityLabel;
    private javax.swing.JTextField custCityText;
    private javax.swing.JLabel custDOBLabel;
    private javax.swing.JTextField custDOBText;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextField custNameText;
    private javax.swing.JTextField custPCText;
    private javax.swing.JLabel custPClabel;
    private javax.swing.JLabel custProvinceLabel;
    private javax.swing.JTextField custProvinceText;
    private javax.swing.JLabel custSalarLabel1;
    private javax.swing.JTextField custSalaryText1;
    private javax.swing.JLabel custidlabel;
    private javax.swing.JTextField custidtext;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel custtitlelabel;
    private javax.swing.JTextField custtitletext;
    private javax.swing.JButton deletebutton;
    private javax.swing.JPanel formpanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
    private void saveCustomer(){
        CustomerModel customer;
        customer = new CustomerModel( 
                custidtext.getText(),
                custtitletext.getText(),
                custNameText.getText(),
                custDOBText.getText(), 
                custAdderssText.getText(),
                custCityText.getText(),
                custProvinceText.getText(),
                custPCText.getText(), 
                Double.parseDouble(custSalaryText1.getText()));
        
        try {
            String resp = customerController.saveCustomer(customer);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    private void clear(){
        custidtext.setText("");
        custtitletext.setText("");
        custNameText.setText("");
        custDOBText.setText("");
        custAdderssText.setText("");
        custCityText.setText("");
        custProvinceText.setText("");
        custPCText.setText("");
        custSalaryText1.setText("");
        
    }
    
    private void loadAllCustomers(){
        try {
            String [] columns = {"ID","Name", "Address", "Salary", "Postal Code"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
            };
            customerTable.setModel(dtm);
            
            ArrayList<CustomerModel> customers = customerController.getAllCustomers();
            
            for(CustomerModel customer: customers){
                Object[] rowData = {customer.getCustID(), customer.getTitle()+" "+ customer.getName(),customer.getAddress()+ ","+ customer.getCity(),customer.getSalary(), customer.getZip()};
                dtm.addRow(rowData);
                
            }
        }
            catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void searchCustomer(){
        try {
            String custID= (String) customerTable.getValueAt(customerTable.getSelectedRow(), 0);
            CustomerModel customerModel = customerController.getCustomer(custID);
            
            if(customerModel != null){
                custidtext.setText(customerModel.getCustID());
                custtitletext.setText(customerModel.getTitle());
                custNameText.setText(customerModel.getName());
                custDOBText.setText(customerModel.getDob());
                custAdderssText.setText(customerModel.getAddress());
                custCityText.setText(customerModel.getCity());
                custProvinceText.setText(customerModel.getProvince());
                custPCText.setText(customerModel.getZip());
                custSalaryText1.setText(Double.toString(customerModel.getSalary()));
            }else{
                JOptionPane.showMessageDialog(this, "Customer not found");

            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }
    
    public void updateCustomer(){
        try {
            CustomerModel customer;
            customer = new CustomerModel(
                    custidtext.getText(),
                    custtitletext.getText(),
                    custNameText.getText(),
                    custDOBText.getText(),
                    custAdderssText.getText(),
                    custCityText.getText(),
                    custProvinceText.getText(),
                    custPCText.getText(),
                    Double.parseDouble(custSalaryText1.getText()));
            
            String resp = customerController.updateCustomer(customer);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void deleteCustomer( ){
        try {
            String custID = custidtext.getText();
            String resp = customerController.deleteCustomer(custID);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
}    
                
