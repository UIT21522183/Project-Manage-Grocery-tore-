package User.com.mycompany.bhx;

import com.mycompany.bhx.ValidateData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class PrivateAccount extends javax.swing.JFrame {
    CustomerFuction cf = new CustomerFuction();
    public int customer_id;
    public PrivateAccount(String username) {
        initComponents();
        setLocationRelativeTo(null);
        cf.setUser(cf.idCustomer(username), fullNameText, jComboBox1, addressText, emailText, phoneNumberText,userText, passwordText);
        customer_id =cf.idCustomer(username);
    }

//    public void LoadInfomation() {
//        cf.setUser(cf.idCustomer(username), fullNameText, jComboBox1, addressText, emailText, phoneNumberText,userText, passwordText);
//    }
    public void showDialog(String title, String info) {
        userDialog.setTitle(title);
        dialogText.setText(info);
        userDialog.setLocationRelativeTo(null);
        userDialog.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        closeDialogBtn = new javax.swing.JButton();
        dialogText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        phoneNumberText = new javax.swing.JTextField();
        userText = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        fullNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        endBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();

        userDialog.setTitle("Error message");
        userDialog.setMinimumSize(new java.awt.Dimension(300, 200));
        userDialog.setModal(true);

        closeDialogBtn.setText("Cancel");
        closeDialogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDialogBtnActionPerformed(evt);
            }
        });

        dialogText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dialogText.setText("Attribute is not allowed to update");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dialogText, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeDialogBtn)
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dialogText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeDialogBtn)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userDialogLayout = new javax.swing.GroupLayout(userDialog.getContentPane());
        userDialog.getContentPane().setLayout(userDialogLayout);
        userDialogLayout.setHorizontalGroup(
            userDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDialogLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        userDialogLayout.setVerticalGroup(
            userDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDialogLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNumberText.setText("0366032155");

        userText.setText("abc123");
        userText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTextFocusGained(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "District 1", "District 2", "District 3", "District 4", "District 5", "District 6", "District 7", "District 8", "District 9", " " }));

        fullNameLabel.setText("Fullname");

        emailLabel.setText("Email");

        addressLabel.setText("Address");

        emailText.setText("abc@gmail.com");

        phoneNumberLabel.setText("Phone-Number");

        addressText.setText("jTextField1");

        usernameLabel.setText("Username");

        passwordText.setText("jTextField1");

        passwordLabel.setText("Password");

        fullNameText.setText("Nguyen van a");

        endBtn.setText("End");
        endBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberLabel)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fullNameText)
                            .addComponent(phoneNumberText)
                            .addComponent(userText)
                            .addComponent(emailText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressText))
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(updateBtn)
                        .addGap(49, 49, 49)
                        .addComponent(endBtn)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameLabel)
                    .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(endBtn))
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 241, 0));
        titleLabel.setText("Edit Profile");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        ValidateData valid = new ValidateData();
        if(valid.validateEmail(emailText.getText()) & valid.validatePhone(phoneNumberText.getText()) & valid.validatePassword(passwordText.getText())){
            cf.updateCustomer(customer_id, fullNameText.getText(), jComboBox1.getSelectedItem().toString(), addressText.getText(),
                    emailText.getText(), phoneNumberText.getText(), passwordText.getText());
            showDialog("Successful", "Update successfully");
        }else {
            showDialog("Error", "Data incorrect");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void userTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextFocusGained
//        hủy focus
        fullNameText.requestFocus();
//        show dialog
        showDialog("Error", "Attributes are not allowed to update");
    }//GEN-LAST:event_userTextFocusGained

    private void closeDialogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDialogBtnActionPerformed
        userDialog.setVisible(false);
    }//GEN-LAST:event_closeDialogBtnActionPerformed

    private void endBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endBtnActionPerformed
        dispose();
    }//GEN-LAST:event_endBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton closeDialogBtn;
    private javax.swing.JLabel dialogText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton endBtn;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JDialog userDialog;
    private javax.swing.JTextField userText;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
