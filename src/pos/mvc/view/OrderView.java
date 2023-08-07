/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.controller.OrderController;
import pos.mvc.model.CustomerModel;
import pos.mvc.model.ItemModel;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;

/**
 *
 * @author Himasha Lokusuriya
 */
public class OrderView extends javax.swing.JFrame {
            private CustomerController customerController;
            private ItemController itemController;
            private OrderController orderController;
            
            ArrayList<OrderDetailModel>orderDetailModels = new ArrayList();
    /**
     * Creates new form OrderView
     */
    public OrderView() {
        customerController = new CustomerController();
        itemController = new ItemController();
        orderController = new OrderController();
        initComponents();
        loadTable();
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
        orderIDLabel = new javax.swing.JLabel();
        orderIDText = new javax.swing.JTextField();
        customerlabel = new javax.swing.JLabel();
        customerIDText = new javax.swing.JTextField();
        searchCustomerButton = new javax.swing.JButton();
        customerDataLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        itemlabel1 = new javax.swing.JLabel();
        itemIDText1 = new javax.swing.JTextField();
        searchIDButton = new javax.swing.JButton();
        itemDataLabel1 = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        discountLabel = new javax.swing.JLabel();
        discountText = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        placeOrderButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Order");

        orderIDLabel.setText("Order ID");

        orderIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDTextActionPerformed(evt);
            }
        });

        customerlabel.setText("Customer ");

        customerIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTextActionPerformed(evt);
            }
        });

        searchCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchCustomerButton.setText("Search");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        itemlabel1.setText("Item ID");

        itemIDText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIDText1ActionPerformed(evt);
            }
        });

        searchIDButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchIDButton.setText("Search");
        searchIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDButtonActionPerformed(evt);
            }
        });

        qtyLabel.setText("Qty");

        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });

        discountLabel.setText("Discount");

        discountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTextActionPerformed(evt);
            }
        });

        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(itemTable);

        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formpanelLayout = new javax.swing.GroupLayout(formpanel);
        formpanel.setLayout(formpanelLayout);
        formpanelLayout.setHorizontalGroup(
            formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpanelLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(formpanelLayout.createSequentialGroup()
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formpanelLayout.createSequentialGroup()
                                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formpanelLayout.createSequentialGroup()
                                        .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchCustomerButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(customerDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(formpanelLayout.createSequentialGroup()
                                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(formpanelLayout.createSequentialGroup()
                                        .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formpanelLayout.createSequentialGroup()
                                        .addComponent(itemlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(itemIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formpanelLayout.createSequentialGroup()
                                        .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formpanelLayout.createSequentialGroup()
                                        .addComponent(searchIDButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(itemDataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addItemButton)))))
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        formpanelLayout.setVerticalGroup(
            formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIDLabel)
                    .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerlabel)
                    .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCustomerButton)
                    .addComponent(customerDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemlabel1)
                    .addComponent(itemIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchIDButton)
                    .addComponent(itemDataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLabel)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountLabel)
                    .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemButton))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
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
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
          searchCustomer();
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void customerIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTextActionPerformed

    private void orderIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIDTextActionPerformed

    private void itemIDText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIDText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIDText1ActionPerformed

    private void searchIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDButtonActionPerformed
        searchItem();
    }//GEN-LAST:event_searchIDButtonActionPerformed

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTextActionPerformed

    private void discountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTextActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        addToTable();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
                try {
                    placeOrder();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel customerDataLabel;
    private javax.swing.JTextField customerIDText;
    private javax.swing.JLabel customerlabel;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JTextField discountText;
    private javax.swing.JPanel formpanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel itemDataLabel1;
    private javax.swing.JTextField itemIDText1;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel itemlabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JTextField orderIDText;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton searchIDButton;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables

       private void searchCustomer(){
           
                try {
                    String custID = customerIDText.getText();
                    CustomerModel cust = customerController.getCustomer(custID);
                    if(cust != null){
                        customerDataLabel.setText(cust.getName()+","+cust.getAddress());
                    }else{
                        JOptionPane.showMessageDialog(this, "Customer not found");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
       }
       
       private void searchItem(){
                try {
                    String itemID = itemIDText1.getText();
                    ItemModel item = itemController.searchItem(itemID);
                    if(item != null){
                        itemDataLabel1.setText(item.getDescription()+","+ item.getUnitPrize() + ","+ item.getQoh());
                    }else{
                      JOptionPane.showMessageDialog(this, "Item not found");  
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
       }
       private void loadTable(){
           String [] columns = {"Item Code", "Qty", "Discount"};
           DefaultTableModel dtm = new DefaultTableModel(columns, 0){
               @Override
               public boolean isCellEditable(int row, int column) {
                   return false;
               }
           
           }; 
           itemTable.setModel(dtm);
    }
       
        private void addToTable(){
           OrderDetailModel od = new OrderDetailModel("", itemIDText1.getText(), Integer.parseInt(qtyText.getText()), Double.parseDouble(discountText.getText()));
           orderDetailModels.add(od);
           
           Object [] rowData = {od.getItemCode(), od.getQty(),od.getDiscount() };
           
           DefaultTableModel dtm = (DefaultTableModel)itemTable.getModel();
           dtm.addRow(rowData);
           
           cleanItemData();
        }
        
        private void cleanItemData(){
            itemIDText1.setText("");
            discountText.setText("");
            qtyText.setText("");
            itemDataLabel1.setText("");
        }

    private void placeOrder() throws SQLException {
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         
         OrderModel orderModel= new OrderModel(orderIDText.getText(), sdf.format(new Date()), customerIDText.getText());
         
         String result = orderController.placeOrder(orderModel,orderDetailModels);
         JOptionPane.showMessageDialog(this, result);
         
         clearForm();
    }

    private void clearForm() {
        loadTable();
        customerIDText.setText("");
        orderIDText.setText("");
        
    }
 }
       
      
                  
       
