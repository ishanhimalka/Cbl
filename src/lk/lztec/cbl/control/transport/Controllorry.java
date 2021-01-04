/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.transport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.employeemanagement.MDriverAt;
import lk.lztec.cbl.module.transport.MNewlorry;
import lk.lztec.cbl.module.transport.MFuel;
import lk.lztec.cbl.module.transport.MRapair;

/**
 *
 * @author Ishan
 */
public class Controllorry {

    public static boolean saveLorry(String nplate, String dnic, String hnic) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Lorry_Details(lorry_number_plate,Driver_Nic,Helper_Nic) Values(?,?,?)");
        stm.setObject(1, nplate);
        stm.setObject(2, dnic);
        stm.setObject(3, hnic);

        return stm.executeUpdate() > 0;
    }

    public static boolean Deletelorry(String nplate) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from Lorry_Details where lorry_number_plate='" + nplate + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    public ArrayList<MNewlorry> loadLorryTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Lorry_Details ";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MNewlorry> itemList = new ArrayList<MNewlorry>();
        while (rs.next()) {
            itemList.add(new MNewlorry(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }

        return itemList;
    }

    public List<MNewlorry> getAllLorry() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Lorry_Details";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MNewlorry> itemList = new ArrayList<>();
        while (rs.next()) {
            itemList.add(new MNewlorry(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }

        return itemList;
    }

    public static boolean saveFuel(String nplate, double amount) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into daily_fuel(lorry_number_plate,amount) Values(?,?)");
        stm.setObject(1, nplate);
        stm.setObject(2, amount);

        return stm.executeUpdate() > 0;
    }

    public ArrayList<MFuel> loadFuel() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM daily_fuel";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MFuel> fuelList = new ArrayList<MFuel>();
        while (rs.next()) {
            fuelList.add(new MFuel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }

        return fuelList;
    }

    public ArrayList<MRapair> loadrapair() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Repair_Details";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MRapair> rapairList = new ArrayList<MRapair>();
        while (rs.next()) {
            rapairList.add(new MRapair(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
        }

        return rapairList;
    }

    public static boolean saverapair(String nplate, String desc, double amount) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Repair_Details(lorry_number_plate,description,amount) Values(?,?,?)");
        stm.setObject(1, nplate);
        stm.setObject(2, desc);
        stm.setObject(3, amount);

        return stm.executeUpdate() > 0;
    }

    public List<MRapair> loadlorryr2(String lplate) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Repair_Details where lorry_number_plate=?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, lplate);
        ResultSet rs = pst.executeQuery();

        List<MRapair> rapairList = new ArrayList<>();
        while (rs.next()) {
            rapairList.add(new MRapair(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
        }

        return rapairList;

    }

    public List<MFuel> loadlorryf2(String lplate) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM daily_fuel where lorry_number_plate=?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, lplate);
        ResultSet rs = pst.executeQuery();

        List<MFuel> fuellList = new ArrayList<>();
        while (rs.next()) {
            fuellList.add(new MFuel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }

        return fuellList;

    }
}
