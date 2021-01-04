/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.sales.MSales;
import lk.lztec.cbl.module.sales.Mbill;

/**
 *
 * @author Ishan
 */
public class ControlSales {

    public static boolean addBill(String sid, String pme, String paid, double i) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into bill(shop_id,payment_method,paid,total) Values(?,?,?,?)");
        stm.setObject(1, sid);
        stm.setObject(2, pme);
        stm.setObject(3, paid);
        stm.setObject(4, i);

        return stm.executeUpdate() > 0;
    }

    public List<Mbill> getAllbills() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM bill";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<Mbill> helperList = new ArrayList<>();
        while (rs.next()) {
            helperList.add(new Mbill(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
        }

        return helperList;
    }

    public static boolean addsales(String lsid, int bno, int qty, int dis, double tot) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into sales(lorry_stock_id,bill_no,qty,discount,total) Values(?,?,?,?,?)");
        stm.setObject(1, lsid);
        stm.setObject(2, bno);
        stm.setObject(3, qty);
        stm.setObject(4, dis);
        stm.setObject(5, tot);

        return stm.executeUpdate() > 0;
    }

    public List<Mbill> loadbill(String sid) {

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM bill where shop_id=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, sid);
            ResultSet rs = pst.executeQuery();

            List<Mbill> billList = new ArrayList<>();
            while (rs.next()) {
                billList.add(new Mbill(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
            }

            return billList;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlSales.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControlSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<MSales> getAllSales() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM sales";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MSales> saleList = new ArrayList<>();
        while (rs.next()) {
            saleList.add(new MSales(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6)));
        }

        return saleList;
    }
      
    public static boolean addTotal(int bno, double tot) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update bill set total=total+? where bill_no=?");
        stm.setObject(2, bno);
        stm.setObject(1, tot);
        return stm.executeUpdate() > 0;

    }
      public List<MSales> loadsales(int bno) {

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM sales where bill_no=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, bno);
            ResultSet rs = pst.executeQuery();

            List<MSales> SaleList = new ArrayList<>();
            while (rs.next()) {
                SaleList.add(new MSales(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6)));
            }

            return SaleList;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlSales.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControlSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
       public List<Mbill> loadbill2(String paid) {

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM bill where paid=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, paid);
            ResultSet rs = pst.executeQuery();

            List<Mbill> billList = new ArrayList<>();
            while (rs.next()) {
                billList.add(new Mbill(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
            }

            return billList;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlSales.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControlSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
