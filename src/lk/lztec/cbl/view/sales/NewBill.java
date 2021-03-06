/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.view.sales;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.lztec.cbl.control.sales.ControlSales;
import lk.lztec.cbl.control.shopdetails.ControlShopD;
import lk.lztec.cbl.module.shopdetails.MShop;
import lk.lztec.cbl.view.security.LogScreen;
import lk.lztec.cbl.view.menu.Sales;

/**
 *
 * @author Ishan
 */
public class NewBill extends javax.swing.JFrame {

    /**
     * Creates new form NewBill
     */
    public NewBill() {
        initComponents();
        try {
            loadshop();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PaymentMethodTextField = new javax.swing.JTextField();
        DoneButton1 = new javax.swing.JButton();
        LockButton1 = new javax.swing.JButton();
        SaveNewProductButton = new javax.swing.JButton();
        ShopIdComboBox1 = new javax.swing.JComboBox();
        PaidComboBox = new javax.swing.JComboBox();
        SaveLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Bill");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(24, 23, 54));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(36, 31, 60));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, 70));

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Shop_Id");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 40));

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Payment_Method");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Paid");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 30));

        PaymentMethodTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        PaymentMethodTextField.setForeground(new java.awt.Color(204, 204, 204));
        PaymentMethodTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        PaymentMethodTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PaymentMethodTextField.setOpaque(false);
        jPanel5.add(PaymentMethodTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 310, -1));

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
        jPanel5.add(DoneButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 220, 50));

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
        jPanel5.add(LockButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 210, 50));

        SaveNewProductButton.setBackground(new java.awt.Color(127, 90, 240));
        SaveNewProductButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SaveNewProductButton.setForeground(new java.awt.Color(204, 204, 204));
        SaveNewProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/input_20px.png"))); // NOI18N
        SaveNewProductButton.setText("Enter");
        SaveNewProductButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 31, 60)));
        SaveNewProductButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveNewProductButton.setOpaque(false);
        SaveNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewProductButtonActionPerformed(evt);
            }
        });
        jPanel5.add(SaveNewProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 120, 30));

        ShopIdComboBox1.setBackground(new java.awt.Color(0, 153, 153));
        ShopIdComboBox1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        ShopIdComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(ShopIdComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 310, 30));

        PaidComboBox.setBackground(new java.awt.Color(0, 153, 153));
        PaidComboBox.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        PaidComboBox.setForeground(new java.awt.Color(204, 204, 204));
        PaidComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yes", "no" }));
        jPanel5.add(PaidComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 310, 30));

        SaveLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        SaveLabel.setForeground(new java.awt.Color(0, 153, 153));
        jPanel5.add(SaveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 180, 50));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 620));

        setSize(new java.awt.Dimension(446, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButton1ActionPerformed
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoneButton1ActionPerformed

    private void LockButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockButton1ActionPerformed
        new LogScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LockButton1ActionPerformed

    private void SaveNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewProductButtonActionPerformed
        String sid = ShopIdComboBox1.getSelectedItem().toString();
        String Pme = PaymentMethodTextField.getText();
        String paid = PaidComboBox.getSelectedItem().toString();
        double i=0.0;
        try {
            boolean isAdd = ControlSales.addBill(sid, Pme, paid, i);

        if (isAdd) {
            PaymentMethodTextField.setText("");
            SaveLabel.setText("Saved");
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewBill.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SaveNewProductButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneButton1;
    private javax.swing.JButton LockButton1;
    private javax.swing.JComboBox PaidComboBox;
    private javax.swing.JTextField PaymentMethodTextField;
    private javax.swing.JLabel SaveLabel;
    private javax.swing.JButton SaveNewProductButton;
    private javax.swing.JComboBox ShopIdComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    private void loadshop() throws ClassNotFoundException, SQLException {
         for (MShop temp : new ControlShopD().getAllshop()) {
            ShopIdComboBox1.addItem(temp.getId());
        }
    }
}
