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
import lk.lztec.cbl.module.employeemanagement.MHelperDetails;
import lk.lztec.cbl.module.employeemanagement.MHelperAt;
import lk.lztec.cbl.module.employeemanagement.MHelperSa;

/**
 *
 * @author Ishan
 */
public class ControlHelperDetails {
    public static boolean saveHelper(MHelperDetails mHelperDetails) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Helper Values(?,?,?,?,?,?)");

        stm.setObject(1, mHelperDetails.getNic());
        stm.setObject(2, mHelperDetails.getName());
        stm.setObject(3, mHelperDetails.getAge());
        stm.setObject(4, mHelperDetails.getSex());
        stm.setObject(5, mHelperDetails.getAddress());
        stm.setObject(6, mHelperDetails.getPhone());

        return stm.executeUpdate() > 0;
    }
     public static boolean DeleteHelper(String nic) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Delete from Helper where Helper_Nic='"+nic+"'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL)>0;
    }
     
     public ArrayList<MHelperDetails> loadHelperTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM helper ORDER BY Helper_Nic ASC";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MHelperDetails> helperList = new ArrayList<MHelperDetails>();
        while (rs.next()) {
            helperList.add(new MHelperDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
        }

        return helperList;
    }
     public List<MHelperDetails> getAllHelpers() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM helper";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MHelperDetails> helperList = new ArrayList<>();
        while (rs.next()) {
            helperList.add(new MHelperDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
        }

        return helperList;
    }
      public static boolean AtHelper(String nic) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Helper_attendence(Helper_Nic) Values(?)");
        stm.setObject(1, nic);
        return stm.executeUpdate() > 0;
    }
     public ArrayList<MHelperAt> loadHelperAt() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Helper_attendence";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MHelperAt> helperList = new ArrayList<MHelperAt>();
        while (rs.next()) {
            helperList.add(new MHelperAt(rs.getInt(1),rs.getString(2), rs.getString(3)));
        }

        return helperList;
    }
      public static boolean saveHelperSa(String dnic,int sal) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Helper_salary(Helper_Nic,salary_amount) Values(?,?)");

        stm.setObject(1, dnic);
        stm.setObject(2, sal);
    
        return stm.executeUpdate() > 0;
    }
            public ArrayList<MHelperSa> loadHelperSa() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Helper_salary";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MHelperSa> helperList = new ArrayList<MHelperSa>();
        while (rs.next()) {
            helperList.add(new MHelperSa(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getString(4)));
        }

        return helperList;
    }
           public List<MHelperAt> loadHelAt(String nic) throws ClassNotFoundException, SQLException {

        
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM Helper_attendence where Helper_Nic=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nic);
            ResultSet rs = pst.executeQuery();

            List<MHelperAt> helpList = new ArrayList<>();
            while (rs.next()) {
                helpList.add(new MHelperAt(rs.getInt(1),rs.getString(2), rs.getString(3)));
            }

            return helpList;
           }
               public List<MHelperSa> loadhelpsa(String nic) throws ClassNotFoundException, SQLException {

        
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM Helper_salary where Helper_Nic=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nic);
            ResultSet rs = pst.executeQuery();

            List<MHelperSa> billList = new ArrayList<>();
            while (rs.next()) {
                billList.add(new MHelperSa(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getString(4)));
            }

            return billList;
       
    }
}
