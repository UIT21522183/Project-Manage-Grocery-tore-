/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignInUp;

import User.Customer;
import User.userController;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class SignUP extends javax.swing.JFrame {

    Color notEdit = new Color(204,204,204);
    userController user;
    /**
     * Creates new form SignUP
     */
    public SignUP() {
        initComponents();
        init();
        user = new userController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbbQuestion = new javax.swing.JComboBox<>();
        txtname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labelHide = new javax.swing.JLabel();
        labelShow = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        cbbAddress = new javax.swing.JComboBox<>();
        txtAnswer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(25, 118, 221));
        jPanel1.setForeground(new java.awt.Color(25, 118, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("#9Slide01 Tieu de ngan", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, -1));

        txtUsername.setFont(new java.awt.Font("#9Slide02 Noi dung dai", 0, 16)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 310, 30));

        txtEmail.setFont(new java.awt.Font("#9Slide02 Noi dung dai", 0, 16)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 310, 30));

        cbbQuestion.setFont(new java.awt.Font("#9Slide02 Noi dung dai", 0, 16)); // NOI18N
        cbbQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What are your favorite hobbies?", "Do you enjoy outdoor activities or indoor activities more?", "What type of books do you like to read?", "Are you into sports? If so, which ones?", "Do you have any favorite movies or TV shows?", "Are you a fan of music? What genres do you enjoy listening to?", "What is your favorite type of cuisine or food?", "Do you have any particular travel destinations that you love?", "Are you interested in art? What forms of art do you appreciate?", "Do you have any favorite video games or board games?" }));
        cbbQuestion.setSelectedIndex(-1);
        jPanel1.add(cbbQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 310, 30));

        txtname.setFont(new java.awt.Font("#9Slide02 Noi dung dai", 0, 16)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 310, 30));

        txtAddress.setFont(new java.awt.Font("#9Slide02 Noi dung dai", 0, 16)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 310, 30));

        jLabel2.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Security question?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Your name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address Line 1 (District)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address Line 2 (Street Number & Name)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(25, 118, 221));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 150, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 37, -1));

        labelHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hide.png"))); // NOI18N
        labelHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHideMouseClicked(evt);
            }
        });
        jPanel1.add(labelHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, 30));

        labelShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/visible.png"))); // NOI18N
        labelShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelShowMouseClicked(evt);
            }
        });
        jPanel1.add(labelShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, 30));

        btnSave.setBackground(new java.awt.Color(204, 204, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(25, 118, 221));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 150, 40));

        cbbAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7", "Quận 8", "Quận 9", "Quận 10" }));
        cbbAddress.setSelectedIndex(-1);
        jPanel1.add(cbbAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 310, 30));

        txtAnswer.setFont(new java.awt.Font("#9Slide02 Noi dung dai", 0, 16)); // NOI18N
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 30));

        jLabel12.setFont(new java.awt.Font("#9Slide01 Noi dung ngan", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Answer");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 30));

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(isEmpty()) {
            Customer x = new Customer();
            x.setName(txtname.getText());
            x.setEmail(txtEmail.getText());
            x.setAnswer(txtAnswer.getText());
            x.setAddressLine1(cbbAddress.getSelectedItem().toString());
            x.setAddressLine2(txtAddress.getText());
            x.setPassword(String.valueOf(txtPassword.getPassword()));
            x.setUsername(txtUsername.getText());
            x.setQuestion(cbbQuestion.getSelectedItem().toString());
            x.setPhone(Long.parseLong(txtPhone.getText()));
            boolean check = user.insertCustomer(x);
            if(check== false){
                JOptionPane.showMessageDialog(this, "Numberphone, username, email have existed", "Warning", 2);
                return;
            }
             JOptionPane.showMessageDialog(null, "Create account success, you try login!", "Notice", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                for(double i=0.1;i<=1.0;i+=0.1) {
            String s=""+i;
                float f = Float.parseFloat(s);
                this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerActionPerformed

    private void labelHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHideMouseClicked
        // TODO add your handling code here:
        txtPassword.setEchoChar((char) 0);
        labelHide.setVisible(false);
        labelShow.setVisible(true);
    }//GEN-LAST:event_labelHideMouseClicked

    private void labelShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelShowMouseClicked
        // TODO add your handling code here:
         txtPassword.setEchoChar((char) '*');
        labelHide.setVisible(true);
        labelShow.setVisible(false);
    }//GEN-LAST:event_labelShowMouseClicked

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        // TODO add your handling code here:\
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

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
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbAddress;
    private javax.swing.JComboBox<String> cbbQuestion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHide;
    private javax.swing.JLabel labelShow;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    private void init() {
   
    }
    
    private boolean isEmpty() {
        if(txtUsername.getText().isEmpty()) {
             JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
            return false;
        }
        if(txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email is required", "Warning", 2);
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        String email = txtEmail.getText();
        Pattern patternEmail = Pattern.compile(emailRegex);
        Matcher matcherEmail = patternEmail.matcher(email);
        if(!matcherEmail.find()) {
           JOptionPane.showMessageDialog(this, "Email is not formal", "Warning", 2);
           return false;
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
             return false;
        }
        int lengthPassword = txtPassword.getPassword().length; 
        if(lengthPassword <= 6) {
            JOptionPane.showMessageDialog(this, "Password is not formal (at least 7 characters)", "Warning", 2);
             return false;
        }
        if(txtPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Numberphone is required", "Warning", 2);
        } 
        String phoneNumberRegex = "^(\\\\+?84|0)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-6|8-9]|9[0-9])([0-9]{7})$";
        String phoneNumber = txtPhone.getText();
        Pattern patternPhone = Pattern.compile(phoneNumberRegex);
        Matcher matcherPhone = patternPhone.matcher(phoneNumber);
        if(!matcherPhone.matches()) {
            JOptionPane.showMessageDialog(this, "Numberphone is not formal", "Warning", 2);
             return false;
        }
        if(txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address Line 2 is required", "Warning", 2);
             return false;
        }
        if(txtAnswer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Answer is required", "Warning", 2);
             return false;
        }
        if(cbbAddress.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(this, "Address Line 1 is required", "Warning", 2);
             return false;
        }
        if(cbbQuestion.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(this, "Question is required", "Warning", 2);
             return false;
        }
        return true;
    }
}
