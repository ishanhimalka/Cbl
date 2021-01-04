/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.view.menu;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import lk.lztec.cbl.view.security.LogScreen;

/**
 *
 * @author Ishan
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        StockControllingButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        FinanceManagementButton = new javax.swing.JButton();
        EmployeeManagementButton = new javax.swing.JButton();
        TransportButton = new javax.swing.JButton();
        SalesButton = new javax.swing.JButton();
        ShopDetailsButton = new javax.swing.JButton();
        LockButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abeyrathne Enterprises - LZ Technology & Researching");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Impact", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 23, 54));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 300, 110));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, 70));

        jLabel7.setFont(new java.awt.Font("Impact", 1, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 23, 54));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Abeyrathne Enterprises");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 520, 83));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 640, 620));

        jPanel5.setBackground(new java.awt.Color(24, 23, 54));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StockControllingButton.setBackground(new java.awt.Color(85, 91, 111));
        StockControllingButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StockControllingButton.setForeground(new java.awt.Color(255, 255, 255));
        StockControllingButton.setText("Stock Controlling");
        StockControllingButton.setBorder(null);
        StockControllingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StockControllingButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StockControllingButton.setOpaque(false);
        StockControllingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockControllingButtonActionPerformed(evt);
            }
        });
        jPanel5.add(StockControllingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 80));

        HomeButton.setBackground(new java.awt.Color(85, 91, 111));
        HomeButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.setBorder(null);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel5.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 80));

        FinanceManagementButton.setBackground(new java.awt.Color(85, 91, 111));
        FinanceManagementButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FinanceManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        FinanceManagementButton.setText("Finance Management");
        FinanceManagementButton.setBorder(null);
        FinanceManagementButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FinanceManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FinanceManagementButton.setOpaque(false);
        FinanceManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinanceManagementButtonActionPerformed(evt);
            }
        });
        jPanel5.add(FinanceManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 270, 80));

        EmployeeManagementButton.setBackground(new java.awt.Color(85, 91, 111));
        EmployeeManagementButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EmployeeManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeManagementButton.setText("Employee Management");
        EmployeeManagementButton.setBorder(null);
        EmployeeManagementButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmployeeManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeManagementButton.setOpaque(false);
        EmployeeManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeManagementButtonActionPerformed(evt);
            }
        });
        jPanel5.add(EmployeeManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 270, 80));

        TransportButton.setBackground(new java.awt.Color(85, 91, 111));
        TransportButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TransportButton.setForeground(new java.awt.Color(255, 255, 255));
        TransportButton.setText("Transport");
        TransportButton.setBorder(null);
        TransportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TransportButton.setOpaque(false);
        TransportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransportButtonActionPerformed(evt);
            }
        });
        jPanel5.add(TransportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 270, 80));

        SalesButton.setBackground(new java.awt.Color(85, 91, 111));
        SalesButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SalesButton.setForeground(new java.awt.Color(255, 255, 255));
        SalesButton.setText("Sales");
        SalesButton.setBorder(null);
        SalesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalesButton.setOpaque(false);
        SalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesButtonActionPerformed(evt);
            }
        });
        jPanel5.add(SalesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, 80));

        ShopDetailsButton.setBackground(new java.awt.Color(85, 91, 111));
        ShopDetailsButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ShopDetailsButton.setForeground(new java.awt.Color(255, 255, 255));
        ShopDetailsButton.setText("Shop Details");
        ShopDetailsButton.setBorder(null);
        ShopDetailsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShopDetailsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ShopDetailsButton.setOpaque(false);
        ShopDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopDetailsButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ShopDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 270, 80));

        LockButton.setBackground(new java.awt.Color(127, 90, 240));
        LockButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LockButton.setForeground(new java.awt.Color(255, 255, 255));
        LockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/lock_20px.png"))); // NOI18N
        LockButton.setBorder(null);
        LockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LockButton.setOpaque(false);
        LockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockButtonActionPerformed(evt);
            }
        });
        jPanel5.add(LockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 280, 60));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 620));

        setSize(new java.awt.Dimension(934, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockButtonActionPerformed
        new LogScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LockButtonActionPerformed

    private void ShopDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopDetailsButtonActionPerformed
        new ShopDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShopDetailsButtonActionPerformed

    private void SalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesButtonActionPerformed
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalesButtonActionPerformed

    private void TransportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransportButtonActionPerformed
        new Transport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TransportButtonActionPerformed

    private void EmployeeManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeManagementButtonActionPerformed
        new EmployeeManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeManagementButtonActionPerformed

    private void FinanceManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinanceManagementButtonActionPerformed
        new FinanceManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FinanceManagementButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void StockControllingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockControllingButtonActionPerformed
        new StockControlling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StockControllingButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeManagementButton;
    private javax.swing.JButton FinanceManagementButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LockButton;
    private javax.swing.JButton SalesButton;
    private javax.swing.JButton ShopDetailsButton;
    private javax.swing.JButton StockControllingButton;
    private javax.swing.JButton TransportButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
