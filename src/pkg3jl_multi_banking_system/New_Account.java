/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg3jl_multi_banking_system;

import BankingClasses.UserDATA;
import BankingClasses.Users;
import BankingClasses.myConnection;
import static java.lang.String.valueOf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class New_Account extends javax.swing.JFrame {

    PreparedStatement st;
    ResultSet rs;
    public New_Account() {
        initComponents();
//        createNewAccount();
        
    }
    public void createNewAccount(){
        int random = (int) Math.floor(100000 + Math.random() * 90000000);
        String t = valueOf(random);
        accountxt.setText(t);
    }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bankCombo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        accountxt = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 720));
        setMinimumSize(new java.awt.Dimension(1020, 720));
        setPreferredSize(new java.awt.Dimension(1020, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1020, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minimal Professional Economics Bank Logo 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 4.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 1 (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        bankCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bankCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BDO", "UNION BANK", "lANDBANK", "CHINABANK", "3JL" }));
        bankCombo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Bank", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        bankCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankComboActionPerformed(evt);
            }
        });
        jPanel1.add(bankCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 250, 70));

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Birth Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 250, 70));

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Holder Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 250, 70));

        accountxt.setEditable(false);
        accountxt.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        accountxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        accountxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountxtActionPerformed(evt);
            }
        });
        jPanel1.add(accountxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 250, 70));

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 250, 70));

        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Birth Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 250, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Users user = new Users();
        user.setBankname(bankCombo.getSelectedItem().toString());
        user.setHoldername(jTextField2.getText());
        user.setAccNumber(Integer.parseInt(accountxt.getText()));
        user.setPin(Integer.parseInt(jTextField4.getText()));
        user.setBdate(jTextField5.getText());
        user.setBplace(jTextField1.getText());
        
        String accn = accountxt.getText();
        
        if (verifyFields()) {
            if (!checkUser(accn)) {
                UserDATA.save(user);
                Login log = new Login();
                log.setVisible(true);
                this.dispose();
            } else {
                New_Account na = new New_Account();
                na.setVisible(true);
                this.dispose();
            }
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bankComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankComboActionPerformed
        if (bankCombo.getSelectedItem().equals("BDO")){
            createNewAccount();
        }else if (bankCombo.getSelectedItem().equals("UNION BANK")){
            createNewAccount();
        }else if (bankCombo.getSelectedItem().equals("LANDBANK")){
            createNewAccount();
        }else if (bankCombo.getSelectedItem().equals("CHINABANK")){
            createNewAccount();
        }else
            createNewAccount();
    }//GEN-LAST:event_bankComboActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void accountxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountxtActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    public boolean verifyFields()
    {
        String bname = bankCombo.getSelectedItem().toString();
        String Hname = jTextField2.getText();
        String accnum = accountxt.getText();
        String pinNo = jTextField4.getText();
        String bd = jTextField5.getText();
        String bp = jTextField1.getText();
        
         // check empty fields
        if(bname.trim().equals("") || Hname.trim().equals("") || accnum.trim().equals("")
           || pinNo.trim().equals("") || bd.trim().equals("") || bp.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    public boolean checkUser(String acc){

        boolean accEx = false;
        
        String query = "SELECT * FROM `users` WHERE `AccNumber` = ?";
        
        try {
            
            st = myConnection.getConnection().prepareStatement(query);
            st.setString(1, acc);
            rs = st.executeQuery();
        
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return accEx;
    }
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
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountxt;
    private javax.swing.JComboBox<String> bankCombo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
