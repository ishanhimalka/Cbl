/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.employeemanagement.MDriverAt;
import lk.lztec.cbl.module.employeemanagement.MDriverDetails;
import lk.lztec.cbl.module.employeemanagement.MDriverSa;

/**
 *
 * @author Ishan
 */
public class ControlDriverDetails {

    public static boolean saveDriver(MDriverDetails mDriverDetails) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Driver Values(?,?,?,?,?,?)");

        stm.setObject(1, mDriverDetails.getNic());
        stm.setObject(2, mDriverDetails.getName());
        stm.setObject(3, mDriverDetails.getAge());
        stm.setObject(4, mDriverDetails.getSex());
        stm.setObject(5, mDriverDetails.getAddress());
        stm.setObject(6, mDriverDetails.getPhone());

        return stm.executeUpdate() > 0;
    }

    public static boolean DeleteDriver(String nic) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from Driver where Driver_Nic='" + nic + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    public List<MDriverDetails> getAllDrivers() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM driver";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MDriverDetails> driverList = new ArrayList<>();
        while (rs.next()) {
            driverList.add(new MDriverDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
        }

        return driverList;
    }

    public ArrayList<MDriverDetails> loadDriverTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM driver ORDER BY Driver_Nic ASC";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MDriverDetails> driverList = new ArrayList<MDriverDetails>();
        while (rs.next()) {
            driverList.add(new MDriverDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
        }

        return driverList;
    }

    public static boolean AtDriver(String nic) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Driver_attendence(Driver_Nic) Values(?)");

        stm.setObject(1, nic);
        return stm.executeUpdate() > 0;
    }
     public ArrayList<MDriverAt> loadDriverAt() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Driver_attendence";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MDriverAt> driverList = new ArrayList<MDriverAt>();
        while (rs.next()) {
            driverList.add(new MDriverAt(rs.getInt(1),rs.getString(2), rs.getString(3)));
        }

        return driverList;
    }
    public static boolean saveDriverSa(String dnic,int sal) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Driver_salary(Driver_Nic,salary_amount) Values(?,?)");

        stm.setObject(1, dnic);
        stm.setObject(2, sal);
    
        return stm.executeUpdate() > 0;
    }
      public ArrayList<MDriverSa> loadDriverSa() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Driver_salary";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MDriverSa> driverList = new ArrayList<MDriverSa>();
        while (rs.next()) {
            driverList.add(new MDriverSa(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getString(4)));
        }

        return driverList;
    }
      public List<MDriverAt> loadDriAt(String nic) throws ClassNotFoundException, SQLException {

        
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM Driver_attendence where Driver_Nic=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nic);
            ResultSet rs = pst.executeQuery();

            List<MDriverAt> billList = new ArrayList<>();
            while (rs.next()) {
                billList.add(new MDriverAt(rs.getInt(1),rs.getString(2), rs.getString(3)));
            }

            return billList;
       
    }
      public List<MDriverSa> loadDriSa(String nic) throws ClassNotFoundException, SQLException {

        
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM Driver_salary where Driver_Nic=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nic);
            ResultSet rs = pst.executeQuery();

            List<MDriverSa> billList = new ArrayList<>();
            while (rs.next()) {
                billList.add(new MDriverSa(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getString(4)));
            }

            return billList;
       
    }
}
