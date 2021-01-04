/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.financemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.financemanagement.MfinMang;

/**
 *
 * @author Ishan
 */
public class Controlfingmang {

    public static boolean saveLoan(String des, double amount) throws ClassNotFoundException, SQLException, java.sql.SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into loans(description,amount) Values(?,?)");

        stm.setObject(1, des);
        stm.setObject(2, amount);
        return stm.executeUpdate() > 0;
    }

    public List<MfinMang> loadLoan() {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM loans";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            List<MfinMang> loanList = new ArrayList<>();
            while (rs.next()) {
                loanList.add(new MfinMang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
            }

            return loanList;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlfingmang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Controlfingmang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean saveRent(String des, double amount) throws ClassNotFoundException, SQLException, java.sql.SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into rent(description,amount) Values(?,?)");

        stm.setObject(1, des);
        stm.setObject(2, amount);
        return stm.executeUpdate() > 0;
    }

    public ArrayList<MfinMang> loadrent() throws java.sql.SQLException {
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlfingmang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Controlfingmang.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM rent";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MfinMang> driverList = new ArrayList<>();
        while (rs.next()) {
            driverList.add(new MfinMang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        return driverList;
    }

    public static boolean saveExpensive(String des, double amount) throws ClassNotFoundException, SQLException, java.sql.SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Other_Expensive(description,amount) Values(?,?)");

        stm.setObject(1, des);
        stm.setObject(2, amount);
        return stm.executeUpdate() > 0;
    }

    public ArrayList<MfinMang> loadExpensive() throws java.sql.SQLException {

        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlfingmang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Controlfingmang.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT * FROM Other_Expensive";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MfinMang> driverList = new ArrayList<>();
        while (rs.next()) {
            driverList.add(new MfinMang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        return driverList;
    }
}
