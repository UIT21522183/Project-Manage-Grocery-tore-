/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OrderProduct;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class OrderProduct extends javax.swing.JFrame {

    private int invoice_id = 1;
    private float grandTotal = 0;
    private float productPrice = 0;
    private float productTotal = 0;
    DefaultTableModel modelName;
    private productManagement pm;
    private InvoiceManagement im;
    ArrayList<product> products;
    ArrayList<invoiceDetail> details;
    private invoiceDetailManagement idm;
    public int customer_id;

    /**
     * Creates new form OrderProduct
     */
    public OrderProduct() {
        initComponents();
        setLocationRelativeTo(null);
        pm = new productManagement();
        init();
        SpinnerNumberModel spinnerModel = (SpinnerNumberModel) spinnerQuantity.getModel();
        spinnerModel.setMinimum(0);
        modelName = new DefaultTableModel();
        im = new InvoiceManagement();
        products = new ArrayList<>();
        details = new ArrayList<>();
        idm = new invoiceDetailManagement();
       
    }
    public OrderProduct(int id){
        initComponents();
        setLocationRelativeTo(null);
        pm = new productManagement();
        init();
        SpinnerNumberModel spinnerModel = (SpinnerNumberModel) spinnerQuantity.getModel();
        spinnerModel.setMinimum(0);
        modelName = new DefaultTableModel();
        im = new InvoiceManagement();
        products = new ArrayList<>();
        details = new ArrayList<>();
        idm = new invoiceDetailManagement();
         customer_id= id;

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbbCategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableName = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        btnCleaer = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFull = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnGeneratebill = new javax.swing.JButton();
        labelImage = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        labelTotalProduct = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/place order.png"))); // NOI18N
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 24, -1, -1));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 237, -1));

        cbbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cbbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 237, -1));

        tableName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        tableName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableName);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 200, 350));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 180, -1));

        txtProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 230, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 180, -1));

        spinnerQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQuantityStateChanged(evt);
            }
        });
        getContentPane().add(spinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 210, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 230, -1));

        btnCleaer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCleaer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnCleaer.setText("Clear");
        btnCleaer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleaerActionPerformed(evt);
            }
        });
        getContentPane().add(btnCleaer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add to cart.png"))); // NOI18N
        btnAdd.setText("Add to cart");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, -1, -1));

        tableFull.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        tableFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFullMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableFull);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 520, 300));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Grant total:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, -1, -1));

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("000");
        getContentPane().add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 70, -1));

        btnGeneratebill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGeneratebill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/generate bill & print.png"))); // NOI18N
        btnGeneratebill.setText("Generate Bill and Print");
        btnGeneratebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratebillActionPerformed(evt);
            }
        });
        getContentPane().add(btnGeneratebill, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, -1, -1));

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ALDI_Shopping_Cart.jpg"))); // NOI18N
        getContentPane().add(labelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, 410));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 200, -1));

        labelTotalProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotalProduct.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalProduct.setText("0.00");
        getContentPane().add(labelTotalProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 50, -1));

        labelPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(255, 255, 255));
        labelPrice.setText("0.00");
        getContentPane().add(labelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/full-page-background.PNG"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCleaerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleaerActionPerformed
        // TODO add your handling code here:
        clearProductFields();
    }//GEN-LAST:event_btnCleaerActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String name = txtProductName.getText();
        String category = cbbCategory.getSelectedItem().toString();
        pm.filterProductNameUsingPrepareStatement(name, category);

    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNameMouseClicked
        // TODO add your handling code here:
        int index = tableName.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableName.getModel();
        String product_name = model.getValueAt(index, 0).toString();
        product x = pm.getProductName(product_name);
        txtProductName.setText(product_name);
        labelPrice.setText("" + x.getPrice());
        labelTotalProduct.setText("" + x.getPrice());
        productPrice = x.getPrice();
        spinnerQuantity.setValue(1);
        btnAdd.setEnabled(true);
        BufferedImage temp = pm.getImageProductName(product_name);
        ImageIcon icon = new ImageIcon(temp);
        labelImage.setIcon(icon);

    }//GEN-LAST:event_tableNameMouseClicked

    private void spinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQuantityStateChanged
        // TODO add your handling code here:
        int quantity = (Integer) spinnerQuantity.getValue();
        productTotal = quantity * productPrice;
        labelTotalProduct.setText("" + productTotal);
    }//GEN-LAST:event_spinnerQuantityStateChanged

    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) tableName.getModel();
        dtm.setRowCount(0);
        ArrayList<String> products = pm.getProductFromCategoryUsingPrepareStatement(category);
        Iterator<String> itr = products.iterator();
        while (itr.hasNext()) {
            String productObj = itr.next();
            dtm.addRow(new Object[]{productObj});
        }
    }

    private void cbbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCategoryActionPerformed
        // TODO add your handling code here:
        String category = cbbCategory.getSelectedItem().toString();
        productNameByCategory(category);
    }//GEN-LAST:event_cbbCategoryActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        grandTotal += productTotal;
        String name = txtProductName.getText();
        String price = labelPrice.getText();
        String quantity = String.valueOf(spinnerQuantity.getValue());

//        if (name.isEmpty() || price.isEmpty() || Integer.parseInt(quantity) == 0) {
//            JOptionPane.showMessageDialog(this, "Please check information", "Error", JOptionPane.ERROR_MESSAGE);
//            return; 
//        }
        DefaultTableModel dtm = (DefaultTableModel) tableFull.getModel();
        dtm.addRow(new Object[]{name, price, quantity, productTotal});
        labelTotal.setText(grandTotal + "$");

        product temp = pm.getProductName(txtProductName.getText());
        temp.setQuantity((Integer) spinnerQuantity.getValue());
        products.add(temp);

        invoiceDetail detail = new invoiceDetail(temp.getProduct_id(), temp.getQuantity(),
                 productTotal);
        details.add(detail);
        clearProductFieldsOfAdd();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnGeneratebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratebillActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tableFull.getModel();
        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No products to generate invoice", "Notification", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Invoice invoice = new Invoice();
        invoice.setTotal_amount(grandTotal);
        invoice.setPayment_method("Bank transfer");
        invoice.setPayment_status(false);
        Date now = new Date();
        Timestamp timestamp = new Timestamp(now.getTime());
        invoice.setCreated_at(timestamp);
        invoice.setCustomer_id(customer_id);
        // wait to find customer?
        int x = im.writeInvoiceUsingPrepareStatement(invoice);
        for (invoiceDetail detail : details) {
            detail.setInvoice_id(x);
        }
        idm.writeInvoicesDetailUsingPrepareStatement(details);
        JOptionPane.showMessageDialog(this, "Generatebill ", "Invoice created successfully", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGeneratebillActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSearchKeyPressed

    private void tableFullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFullMouseClicked
        // TODO add your handling code here:
        int index = tableFull.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to remove this product?",
                 "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            DefaultTableModel model = (DefaultTableModel) tableFull.getModel();
            String total = model.getValueAt(index, 3).toString();
            grandTotal -= Float.parseFloat(total);
            labelTotal.setText("" + grandTotal);
            ((DefaultTableModel) tableFull.getModel()).removeRow(index);
            details.remove(index);
            products.remove(index);
        }
    }//GEN-LAST:event_tableFullMouseClicked

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
            java.util.logging.Logger.getLogger(OrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderProduct().setVisible(true);
            }
        });
    }

    public void clearProductFields() {
        txtProductName.setText("");

        spinnerQuantity.setValue(0);
        //txtTotal.setText("");
        btnAdd.setEnabled(false);
    }

    public void clearProductFieldsOfAdd() {
        txtProductName.setText("");
        spinnerQuantity.setValue(0);
        labelPrice.setText("0.00");
        labelTotalProduct.setText("0.00");
        productPrice = 0;
        productTotal = 0;
    }

    public void productNameByCategory(String category, String name) {
        DefaultTableModel dtm = (DefaultTableModel) tableName.getModel();
        dtm.setRowCount(0);
        ArrayList<String> products = pm.filterProductNameUsingPrepareStatement(name, category);
        Iterator<String> itr = products.iterator();
        while (itr.hasNext()) {
            String productObj = itr.next();
            dtm.addRow(new Object[]{productObj});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCleaer;
    private javax.swing.JButton btnGeneratebill;
    private javax.swing.JComboBox<String> cbbCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalProduct;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTable tableFull;
    private javax.swing.JTable tableName;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void init() {
        ArrayList<String> categories = pm.getCategoryProductUsingPrepareStatement();
        String[] categoryArray = categories.toArray(new String[0]);
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(categoryArray);
        cbbCategory.setModel(comboBoxModel);
    }
}
