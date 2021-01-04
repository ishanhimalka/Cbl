/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.view.transport;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.lztec.cbl.control.transport.Controllorry;
import lk.lztec.cbl.module.transport.MNewlorry;
import lk.lztec.cbl.module.transport.MFuel;
import lk.lztec.cbl.view.security.LogScreen;
import lk.lztec.cbl.view.menu.Transport;

/**
 *
 * @author Ishan
 */
public class DailyFuel extends javax.swing.JFrame {

    /**
     * Creates new form DailyFuel
     */
    public DailyFuel() {
        initComponents();
        try {
            getAlllorry();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DailyFuel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DailyFuel.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AmountTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        AmountTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lorrynumberplateComboBox = new javax.swing.JComboBox();
        DoneButton1 = new javax.swing.JButton();
        LockButton1 = new javax.swing.JButton();
        SaveNewProductButton = new javax.swing.JButton();
        TableButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daily Fuel");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(24, 23, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(36, 31, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, 70));

        AmountTable.setBackground(new java.awt.Color(0, 153, 153));
        AmountTable.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        AmountTable.setForeground(new java.awt.Color(255, 255, 255));
        AmountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "lorry number plate", "Date", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        AmountTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AmountTable.setGridColor(new java.awt.Color(255, 255, 255));
        AmountTable.setOpaque(false);
        AmountTable.setSelectionBackground(new java.awt.Color(153, 255, 204));
        AmountTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(AmountTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 400, 620));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("lorry_number_plate");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 30));

        AmountTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        AmountTextField.setForeground(new java.awt.Color(204, 204, 204));
        AmountTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        AmountTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AmountTextField.setOpaque(false);
        jPanel3.add(AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 310, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Amount");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 30));

        lorrynumberplateComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lorrynumberplateComboBoxMouseClicked(evt);
            }
        });
        jPanel3.add(lorrynumberplateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 290, -1));

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

        SaveNewProductButton.setBackground(new java.awt.Color(127, 90, 240));
        SaveNewProductButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SaveNewProductButton.setForeground(new java.awt.Color(204, 204, 204));
        SaveNewProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/input_20px.png"))); // NOI18N
        SaveNewProductButton.setText("Enter");
        SaveNewProductButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        SaveNewProductButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveNewProductButton.setOpaque(false);
        SaveNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewProductButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SaveNewProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 120, 30));

        TableButton.setBackground(new java.awt.Color(127, 90, 240));
        TableButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TableButton.setForeground(new java.awt.Color(204, 204, 204));
        TableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/data_sheet_20px.png"))); // NOI18N
        TableButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        TableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableButton.setOpaque(false);
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });
        jPanel3.add(TableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 120, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 620));

        setSize(new java.awt.Dimension(847, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButton1ActionPerformed
        new Transport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoneButton1ActionPerformed

    private void LockButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockButton1ActionPerformed
        new LogScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LockButton1ActionPerformed

    private void SaveNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewProductButtonActionPerformed
        String lnplate = lorrynumberplateComboBox.getSelectedItem().toString();
        double amount = Double.parseDouble(AmountTextField.getText());
        
        try {
            boolean isAdded = Controllorry.saveFuel(lnplate, amount);
            if (isAdded) {
                AmountTextField.setText("");
                TableButton.doClick();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SaveNewProductButtonActionPerformed

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) AmountTable.getModel();
        int a = model.getRowCount();
        for (int i = 0; i < a; i++) {
            model.removeRow(0);
        }
        List<MFuel> list = null;
        
        try {
            list = new Controllorry().loadFuel();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DailyFuel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DailyFuel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Object row[] = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNo();
            row[1] = list.get(i).getLnplate();
            row[2] = list.get(i).getDate();
            row[3] = list.get(i).getAmount();
            model.addRow(row);
        }
    }//GEN-LAST:event_TableButtonActionPerformed

    private void lorrynumberplateComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lorrynumberplateComboBoxMouseClicked
         String lplate = lorrynumberplateComboBox.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) AmountTable.getModel();
        int a = model.getRowCount();
        for (int i = 0; i < a; i++) {
            model.removeRow(0);
        }
        List<MFuel> list = null;

    
        try {
            list = new Controllorry().loadlorryf2(lplate);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DailyFuel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DailyFuel.class.getName()).log(Level.SEVERE, null, ex);
        }
        

          Object row[] = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNo();
            row[1] = list.get(i).getLnplate();
            row[2] = list.get(i).getDate();
            row[3] = list.get(i).getAmount();
            model.addRow(row);
        }
    }//GEN-LAST:event_lorrynumberplateComboBoxMouseClicked

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
            java.util.logging.Logger.getLogger(DailyFuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyFuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyFuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyFuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyFuel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmountTable;
    private javax.swing.JTextField AmountTextField;
    private javax.swing.JButton DoneButton1;
    private javax.swing.JButton LockButton1;
    private javax.swing.JButton SaveNewProductButton;
    private javax.swing.JButton TableButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox lorrynumberplateComboBox;
    // End of variables declaration//GEN-END:variables

    private void getAlllorry() throws ClassNotFoundException, SQLException {
        for (MNewlorry temp : new Controllorry().getAllLorry()) {
            lorrynumberplateComboBox.addItem(temp.getNplate());
        }
    }
}
