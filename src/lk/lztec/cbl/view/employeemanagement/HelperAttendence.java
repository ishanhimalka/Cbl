/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.view.employeemanagement;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.lztec.cbl.control.employeemanagement.ControlHelperDetails;
import lk.lztec.cbl.module.employeemanagement.MHelperAt;
import lk.lztec.cbl.module.employeemanagement.MHelperDetails;
import lk.lztec.cbl.view.menu.EmployeeManagement;
import lk.lztec.cbl.view.security.LogScreen;

/**
 *
 * @author Ishan
 */
public class HelperAttendence extends javax.swing.JFrame {

    /**
     * Creates new form HelperAttendence
     */
    public HelperAttendence() {
        initComponents();

        try {
            helpernic();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
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
        HelperTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        HelperNicComboBox = new javax.swing.JComboBox();
        LockButton1 = new javax.swing.JButton();
        DoneButton1 = new javax.swing.JButton();
        WorkingButton = new javax.swing.JButton();
        saveLabel = new javax.swing.JLabel();
        TableButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helper Attendence");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(24, 23, 54));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(36, 31, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, 70));

        HelperTable.setBackground(new java.awt.Color(0, 153, 153));
        HelperTable.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        HelperTable.setForeground(new java.awt.Color(255, 255, 255));
        HelperTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Helper_Nic", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HelperTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HelperTable.setGridColor(new java.awt.Color(255, 255, 255));
        HelperTable.setOpaque(false);
        HelperTable.setSelectionBackground(new java.awt.Color(153, 255, 204));
        HelperTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(HelperTable);
        if (HelperTable.getColumnModel().getColumnCount() > 0) {
            HelperTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 390, 620));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Helper_Nic");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 40));

        HelperNicComboBox.setBackground(new java.awt.Color(0, 153, 153));
        HelperNicComboBox.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        HelperNicComboBox.setForeground(new java.awt.Color(255, 255, 255));
        HelperNicComboBox.setBorder(null);
        HelperNicComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HelperNicComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelperNicComboBoxMouseClicked(evt);
            }
        });
        jPanel3.add(HelperNicComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 300, 30));

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
        jPanel3.add(DoneButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 210, 50));

        WorkingButton.setBackground(new java.awt.Color(0, 153, 153));
        WorkingButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        WorkingButton.setForeground(new java.awt.Color(204, 204, 204));
        WorkingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/lztec/cbl/icon/driver_20px.png"))); // NOI18N
        WorkingButton.setText("Working");
        WorkingButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        WorkingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WorkingButton.setOpaque(false);
        WorkingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkingButtonActionPerformed(evt);
            }
        });
        jPanel3.add(WorkingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 120, 30));

        saveLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(0, 153, 153));
        jPanel3.add(saveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 180, 50));

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
        jPanel3.add(TableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 120, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 620));

        setSize(new java.awt.Dimension(827, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LockButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockButton1ActionPerformed
        new LogScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LockButton1ActionPerformed

    private void DoneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButton1ActionPerformed
        new EmployeeManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoneButton1ActionPerformed

    private void WorkingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkingButtonActionPerformed
        String id = HelperNicComboBox.getSelectedItem().toString();
        try {
            boolean isAdded = ControlHelperDetails.AtHelper(id);
            if (isAdded) {
                saveLabel.setText("Saved");
                DefaultTableModel model = (DefaultTableModel) HelperTable.getModel();
                int a = model.getRowCount();
                for (int i = 0; i < a; i++) {
                    model.removeRow(0);
                }
                List<MHelperAt> list = null;
                try {
                    list = new ControlHelperDetails().loadHelperAt();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
                }
                Object row[] = new Object[3];
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getNo();
                    row[1] = list.get(i).getDnic();
                    row[2] = list.get(i).getDate();
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_WorkingButtonActionPerformed

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) HelperTable.getModel();
        int a = model.getRowCount();
        for (int i = 0; i < a; i++) {
            model.removeRow(0);
        }
        List<MHelperAt> list = null;
        try {
            list = new ControlHelperDetails().loadHelperAt();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object row[] = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNo();
            row[1] = list.get(i).getDnic();
            row[2] = list.get(i).getDate();
            model.addRow(row);
        }
    }//GEN-LAST:event_TableButtonActionPerformed

    private void HelperNicComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelperNicComboBoxMouseClicked
           String nic = HelperNicComboBox.getSelectedItem().toString();
         
        DefaultTableModel model = (DefaultTableModel) HelperTable.getModel();
        int a = model.getRowCount();
        for (int i = 0; i < a; i++) {
            model.removeRow(0);
        }
        List<MHelperAt> list = null;

        try {
            list = new ControlHelperDetails().loadHelAt(nic);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HelperAttendence.class.getName()).log(Level.SEVERE, null, ex);
        }
        

         Object row[] = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNo();
            row[1] = list.get(i).getDnic();
            row[2] = list.get(i).getDate();
            model.addRow(row);
        }
    }//GEN-LAST:event_HelperNicComboBoxMouseClicked

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
            java.util.logging.Logger.getLogger(HelperAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelperAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelperAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelperAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelperAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneButton1;
    private javax.swing.JComboBox HelperNicComboBox;
    private javax.swing.JTable HelperTable;
    private javax.swing.JButton LockButton1;
    private javax.swing.JButton TableButton;
    private javax.swing.JButton WorkingButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saveLabel;
    // End of variables declaration//GEN-END:variables

    private void helpernic() throws ClassNotFoundException, SQLException {
        for (MHelperDetails temp : new ControlHelperDetails().getAllHelpers()) {
            HelperNicComboBox.addItem(temp.getNic());
        }
    }
}
