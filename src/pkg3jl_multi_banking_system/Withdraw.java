/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg3jl_multi_banking_system;

import BankingClasses.myConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Student.Admin
 */
public class Withdraw extends javax.swing.JFrame {

    PreparedStatement st;
    ResultSet rs;
    public Withdraw() {
        initComponents();
        DisplayData();
    }

    public void DisplayData() {
        try {
            int log = Integer.parseInt(Login.acclog.getText());
            String query1 = "SELECT HolderName, AccNumber, Balance FROM users WHERE AccNumber = '" + log + "' ";
            st = myConnection.getConnection().prepareStatement(query1);
            rs = st.executeQuery(query1);
            
            while (rs.next()) {
                String hname = rs.getString("HolderName");
                String accnumber = rs.getString("AccNumber");
                String bal = rs.getString("Balance");
                
                jLabel15.setText(hname);
                jLabel2.setText(accnumber);
                jLabel16.setText(accnumber);
                jLabel17.setText(bal);
            
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        charge = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1020, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minimal Professional Economics Bank Logo 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCOUNT NUMBER");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 220, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 9.png"))); // NOI18N
        jLabel3.setText("Account Detail");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 171, 52));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 13 (1).png"))); // NOI18N
        jLabel4.setText("Check Balance");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 171, 52));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 8.png"))); // NOI18N
        jLabel5.setText("Deposit Cash");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 171, 52));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 10.png"))); // NOI18N
        jLabel6.setText("Withdraw Cash");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 171, 52));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 11.png"))); // NOI18N
        jLabel7.setText("Transfer Money");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 171, 52));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 240, 350));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 4.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 1 (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 2.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 3.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 280, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 280, 60));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Withdraw Amount", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 280, 70));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Balance", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 280, 60));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("WITHDRAW");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 140, 30));

        charge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        charge.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(charge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 340, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 510, 470));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 5.png"))); // NOI18N
        jLabel13.setText("LOG OUT");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Additional fee is added for other bank user!");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 510, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double draw = Float.parseFloat(jTextField1.getText());

        try {
            int log = Integer.parseInt(Login.acclog.getText());
            String query1 = "SELECT BankName, HolderName, AccNumber, Balance FROM users WHERE AccNumber = '" + log + "' ";
            st = myConnection.getConnection().prepareStatement(query1);
            rs = st.executeQuery(query1);

            while (rs.next()) {
                String Bname = rs.getString("BankName");
                String hname = rs.getString("HolderName");
                String accnumber = rs.getString("AccNumber");
                String bal = rs.getString("Balance");

                jLabel15.setText(hname);
                jLabel2.setText(accnumber);
                jLabel16.setText(accnumber);
                jLabel17.setText(bal);

                double oldbal = Float.parseFloat(bal);
                double nonMember = draw + 15.00;
                double addbal = oldbal - nonMember;
                double charges = 15.0;
                double noCharge = oldbal-draw;
                

                if (Bname.equals("3JL")) {
                    int magadd = JOptionPane.showConfirmDialog(null, "Are you sure you want to deposit now? ");
                    if (magadd == 0) {
                        try {
                            String query = "UPDATE users SET Balance = '" + noCharge + "' WHERE accNumber = '" + log + "'";
                            st = myConnection.getConnection().prepareStatement(query);

                            if (st.executeUpdate() != 0) {
                                JOptionPane.showMessageDialog(null, "Successfully Withdrawn Money");
                                DisplayData();
                                jTextField1.setText("");
                                message me = new message();
                                me.setVisible(true);
                                this.dispose();

                            } else {
                                JOptionPane.showMessageDialog(null, "ERROR");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }else{
                    int magadd = JOptionPane.showConfirmDialog(null, "Are you sure you want to deposit now? ");
                    if (magadd == 0) {
                        try {
                            String query = "UPDATE users SET Balance ='" + addbal + "' WHERE accNumber = '" + log + "'";
                            st = myConnection.getConnection().prepareStatement(query);

                            if (st.executeUpdate() != 0) {
                                JOptionPane.showMessageDialog(null, "Successfully Withdrawn Money with charges");
                                DisplayData();
                                jTextField1.setText("");
                                message me = new message();
                                me.setVisible(true);
                                this.dispose();

                            } else {
                                JOptionPane.showMessageDialog(null, "ERROR");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.println("Withrawn Money: " + draw );
                    System.out.println("Additional Charges: " + charges );
                    System.out.println("------------------------" );
                    System.out.println("Total Deducted: " + nonMember);
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String pin = JOptionPane.showInputDialog(null, "Input your PIN:");
        String curpin = String.valueOf(Login.pinlog.getPassword());
        if (pin.equals(curpin)){
            Deposit log = new Deposit();
            log.setVisible(true);
            this.dispose();
        } else {
            System.out.println("Ay Okie");
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String pin = JOptionPane.showInputDialog(null, "Input your PIN:");
        String curpin = String.valueOf(Login.pinlog.getPassword());
        if (pin.equals(curpin)){
            Withdraw log = new Withdraw();
            log.setVisible(true);
            this.dispose();
        } else {
            System.out.println("Ay Okie");
        }
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String pin = JOptionPane.showInputDialog(null, "Input your PIN:");
        String curpin = String.valueOf(Login.pinlog.getPassword());
        if (pin.equals(curpin)){
            Transfer log = new Transfer();
            log.setVisible(true);
            this.dispose();
        } else {
            System.out.println("Ay Okie");
        }
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        View_Balance log = new View_Balance();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        try {
            int log = Integer.parseInt(Login.acclog.getText());
            String query1 = "SELECT BankName FROM users WHERE AccNumber = '" + log + "' ";
            st = myConnection.getConnection().prepareStatement(query1);
            rs = st.executeQuery(query1);
            
            while (rs.next()) {
                String bname = rs.getString("BankName");
                
                if (bname.equals("3JL")){
                    System.out.println("Bank Member");
                }else{
                    charge.setText("P 15.00 is charged for this transaction!");
                }  
            
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel charge;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
