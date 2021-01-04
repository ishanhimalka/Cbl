/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.stockcontrolling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.stockcontrolling.MNewProduct;
import lk.lztec.cbl.module.stockcontrolling.MProductDetails;

/**
 *
 * @author Ishan
 */
public class ControlProductDetails {

    public static boolean saveItem(MProductDetails mProductDetails) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Products_Detail Values(?,?,?,?,?,?)");
        stm.setObject(1, mProductDetails.getPid());
        stm.setObject(2, mProductDetails.getName());
        stm.setObject(3, mProductDetails.getWeight());
        stm.setObject(4, mProductDetails.getPackets());
        stm.setObject(5, mProductDetails.getQty());
        stm.setObject(6, mProductDetails.getBprice());
        return stm.executeUpdate() > 0;
    }

    public static boolean DeleteItem(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from Products_Detail where products_id='" + id + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }

    public static boolean updateBprice(String pid,double bprice) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Products_Detail set buying_price=? where products_id=?");
        stm.setObject(2, pid);
        stm.setObject(1, bprice);
        return stm.executeUpdate() > 0;

    }

    public ArrayList<MProductDetails> loadProductTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Products_Detail ORDER BY products_id ASC ";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MProductDetails> itemList = new ArrayList<MProductDetails>();
        while (rs.next()) {
            itemList.add(new MProductDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6)));
        }

        return itemList;
    }

    public List<MProductDetails> getAllItem() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Products_Detail";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MProductDetails> itemList = new ArrayList<>();
        while (rs.next()) {
            itemList.add(new MProductDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6)));
        }

        return itemList;
    }

    public static boolean updateqty(String pid, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Products_Detail set qty=qty+? where products_id=?");
        stm.setObject(2, pid);
        stm.setObject(1, qty);
        return stm.executeUpdate() > 0;

    }

    public static boolean enterNewItem(String pid, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into New_product(products_id ,qty) Values(?,?)");
        stm.setObject(1, pid);
        stm.setObject(2, qty);
        return stm.executeUpdate() > 0;
    }
      public static boolean downqty(String pid, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Products_Detail set qty=qty-? where products_id=?");
        stm.setObject(2, pid);
        stm.setObject(1, qty);
        return stm.executeUpdate() > 0;

    }
      
     public List<MNewProduct> getAllstockadd() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM New_product";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MNewProduct> itemList = new ArrayList<>();
        while (rs.next()) {
            itemList.add(new MNewProduct(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
        }

        return itemList;
    }  
     public ArrayList<MProductDetails> loadProductTableq() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Products_Detail ORDER BY qty ASC ";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MProductDetails> itemList = new ArrayList<MProductDetails>();
        while (rs.next()) {
            itemList.add(new MProductDetails(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6)));
        }

        return itemList;
    }
     public List<MNewProduct> loadnewp(String pid) throws ClassNotFoundException, SQLException {

       
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM New_product where products_id=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, pid);
            ResultSet rs = pst.executeQuery();

            List<MNewProduct> billList = new ArrayList<>();
            while (rs.next()) {
                billList.add(new MNewProduct(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
            }

            return billList;
      
    }
     
}
