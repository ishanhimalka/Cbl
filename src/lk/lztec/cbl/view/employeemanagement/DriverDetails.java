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
import lk.lztec.cbl.control.employeemanagement.ControlDriverDetails;
import lk.lztec.cbl.module.employeemanagement.MDriverDetails;
import lk.lztec.cbl.view.menu.EmployeeManagement;
import lk.lztec.cbl.view.security.LogScreen;

/**
 *
 * @author Ishan
 */
public class DriverDetails extends javax.swing.JFrame {

    /**
     * Creates new form DriverDetails
     */
    public DriverDetails() {
        try {
            initComponents();
            loadAllDrivers();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DriverDetails.class.getName()).log(Level.SEVERE, null, ex);
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
        DriverDetailsTable = new javax.swing.JTable();
        DoneButton1 = new javax.swing.JButton();
        LockButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Driver Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(36, 31, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, -1, 70));

        DriverDetailsTable.setBackground(new java.awt.Color(0, 153, 153));
        DriverDetailsTable.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        DriverDetailsTable.setForeground(new java.awt.Color(204, 204, 204));
        DriverDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Driver_Nic", "Name", "Age", "Sex", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DriverDetailsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DriverDetailsTable.setGridColor(new java.awt.Color(255, 255, 255));
        DriverDetailsTable.setOpaque(false);
        DriverDetailsTable.setSelectionBackground(new java.awt.Color(153, 255, 204));
        DriverDetailsTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(DriverDetailsTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

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
        jPanel3.add(DoneButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 420, 40));

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
        jPanel3.add(LockButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 410, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 620));

        setSize(new java.awt.Dimension(847, 655));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButton1ActionPerformed
        new EmployeeManagement().setVisible(true);
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
            java.util.logging.Logger.getLogger(DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneButton1;
    private javax.swing.JTable DriverDetailsTable;
    private javax.swing.JButton LockButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadAllDrivers() throws ClassNotFoundException, SQLException {
        DefaultTableModel model = (DefaultTableModel) DriverDetailsTable.getModel();
        List<MDriverDetails> list= new ControlDriverDetails().loadDriverTable();
        Object row[]=new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0]=list.get(i).getNic();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getAge();
            row[3]=list.get(i).getSex();
            row[4]=list.get(i).getAddress();
            row[5]=list.get(i).getPhone();
            model.addRow(row);
        }
    }
}