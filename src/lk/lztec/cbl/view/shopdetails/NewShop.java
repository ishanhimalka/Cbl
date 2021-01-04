/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.view.shopdetails;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import lk.lztec.cbl.control.shopdetails.ControlShopD;
import lk.lztec.cbl.module.shopdetails.MShop;
import lk.lztec.cbl.view.security.LogScreen;
import lk.lztec.cbl.view.menu.ShopDetails;

/**
 *
 * @author Ishan
 */
public class NewShop extends javax.swing.JFrame {

    /**
     * Creates new form NewShop
     */
    public NewShop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        shopidTextField = new javax.swing.JTextField();
        ShopNameTextField = new javax.swing.JTextField();
        ShopAddressTextField = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        ShopPhoneTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OwnerNameTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        OwnerNicTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DoneButton1 = new javax.swing.JButton();
        LockButton1 = new javax.swing.JButton();
        SaveLabel = new javax.swing.JLabel();
        DeleteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Shop");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(24, 23, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(36, 31, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, 70));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Shop_Id");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 40));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Shop_Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Shop_Address");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 30));

        shopidTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        shopidTextField.setForeground(new java.awt.Color(204, 204, 204));
        shopidTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        shopidTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        shopidTextField.setOpaque(false);
        jPanel3.add(shopidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 310, -1));

        ShopNameTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ShopNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        ShopNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        ShopNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ShopNameTextField.setOpaque(false);
        jPanel3.add(ShopNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 310, -1));

        ShopAddressTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ShopAddressTextField.setForeground(new java.awt.Color(204, 204, 204));
        ShopAddressTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        ShopAddressTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ShopAddressTextField.setOpaque(false);
        jPanel3.add(ShopAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 310, -1));

        DeleteButton.setBackground(new java.awt.Color(127, 90, 240));
        DeleteButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(204, 204, 204));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/trash_20px.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.setOpaque(false);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 120, 30));

        SaveButton.setBackground(new java.awt.Color(127, 90, 240));
        SaveButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(204, 204, 204));
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/save_20px.png"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        SaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveButton.setOpaque(false);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 120, 30));

        ShopPhoneTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ShopPhoneTextField1.setForeground(new java.awt.Color(204, 204, 204));
        ShopPhoneTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        ShopPhoneTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ShopPhoneTextField1.setOpaque(false);
        jPanel3.add(ShopPhoneTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 310, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Shop_Phone");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 30));

        OwnerNameTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        OwnerNameTextField2.setForeground(new java.awt.Color(204, 204, 204));
        OwnerNameTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        OwnerNameTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        OwnerNameTextField2.setOpaque(false);
        jPanel3.add(OwnerNameTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 310, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Owner_Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 30));

        OwnerNicTextField3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        OwnerNicTextField3.setForeground(new java.awt.Color(204, 204, 204));
        OwnerNicTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        OwnerNicTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        OwnerNicTextField3.setOpaque(false);
        jPanel3.add(OwnerNicTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 310, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Owner_Nic");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, 30));

        DoneButton1.setBackground(new java.awt.Color(85, 91, 111));
        DoneButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DoneButton1.setForeground(new java.awt.Color(204, 204, 204));
        DoneButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/checked_20px.png"))); // NOI18N
        DoneButton1.setText("Done ");
        DoneButton1.setBorder(null);
        DoneButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoneButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(DoneButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 220, 50));

        LockButton1.setBackground(new java.awt.Color(85, 91, 111));
        LockButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LockButton1.setForeground(new java.awt.Color(204, 204, 204));
        LockButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/lock_20px.png"))); // NOI18N
        LockButton1.setText("LogScreen");
        LockButton1.setBorder(null);
        LockButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LockButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(LockButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 210, 50));

        SaveLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        SaveLabel.setForeground(new java.awt.Color(0, 153, 153));
        jPanel3.add(SaveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 180, 50));

        DeleteLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        DeleteLabel.setForeground(new java.awt.Color(250, 0, 89));
        jPanel3.add(DeleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 170, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 620));

        setSize(new java.awt.Dimension(445, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
         String id = shopidTextField.getText();
         try {
            boolean isDeleted = ControlShopD.DeleteShop(id);
            if (isDeleted) {
                DeleteLabel.setText("Deleted ");
                SaveLabel.setText("");
            } else {
                DeleteLabel.setText("Delete fail");
                SaveLabel.setText("");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        String id = shopidTextField.getText();
        String name = ShopNameTextField.getText();
        String address = ShopAddressTextField.getText();
        int phone = Integer.parseInt(ShopPhoneTextField1.getText());
        String omic = OwnerNicTextField3.getText();
        String oname = OwnerNameTextField2.getText();
        MShop mShop = new MShop(id, name, address, phone, oname, omic);
        try {
            boolean isAdd = ControlShopD.saveshop(mShop);
            if (isAdd) {
                shopidTextField.setText("");
                ShopNameTextField.setText("");
                ShopAddressTextField.setText("");
                ShopPhoneTextField1.setText("");
                OwnerNicTextField3.setText("");
                OwnerNameTextField2.setText("");
                SaveLabel.setText("Saved");
                DeleteLabel.setText("");

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void DoneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButton1ActionPerformed
        new ShopDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoneButton1ActionPerformed

    private void LockButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockButton1ActionPerformed
        new LogScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LockButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DeleteLabel;
    private javax.swing.JButton DoneButton1;
    private javax.swing.JButton LockButton1;
    private javax.swing.JTextField OwnerNameTextField2;
    private javax.swing.JTextField OwnerNicTextField3;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel SaveLabel;
    private javax.swing.JTextField ShopAddressTextField;
    private javax.swing.JTextField ShopNameTextField;
    private javax.swing.JTextField ShopPhoneTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField shopidTextField;
    // End of variables declaration//GEN-END:variables
}