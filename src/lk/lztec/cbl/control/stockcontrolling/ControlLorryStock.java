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
import java.util.ArrayList;
import java.util.List;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.stockcontrolling.MLorryStock;
import lk.lztec.cbl.module.stockcontrolling.MstocklorryIn;

/**
 *
 * @author Ishan
 */
public class ControlLorryStock {
    public static boolean saveItem(String lsid, String lnplate, String pid, double sprice, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Lorry_Stock Values(?,?,?,?,?)");
        stm.setObject(1, lsid);
        stm.setObject(2, lnplate);
        stm.setObject(3, pid);
        stm.setObject(4, sprice);
        stm.setObject(5, qty);
        return stm.executeUpdate() > 0;
    }

      public ArrayList<MLorryStock> loadlsTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Lorry_Stock ORDER BY lorry_stock_id ASC  ";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MLorryStock> itemList = new ArrayList<>();
        while (rs.next()) {
            itemList.add(new MLorryStock(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5)));
        }

        return itemList;
    }
    

      public static boolean addItem(String lsid, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into lorry_in(lorry_stock_id,qty) Values(?,?)");
        stm.setObject(1, lsid);
        stm.setObject(2, qty);
    
        return stm.executeUpdate() > 0;
    }
      
       public static boolean updateqty(String lsid, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Lorry_Stock set qty=qty+? where lorry_stock_id=?");
        stm.setObject(2, lsid);
        stm.setObject(1, qty);
        return stm.executeUpdate() > 0;

    }
       
       public ArrayList<MstocklorryIn> loadstockTable() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM lorry_in";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MstocklorryIn> itemList = new ArrayList<MstocklorryIn>();
        while (rs.next()) {
            itemList.add(new MstocklorryIn(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getString(4)));
        }

        return itemList;
    }
       
    public static String getPid(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select products_id from Lorry_Stock where lorry_stock_id=?");
        pst.setString(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return rs.getString(1);
        }
        return null;    
               
    }
    
  
    public static boolean updatesprice(String lsid,double sprice) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Lorry_Stock set selling_price=? where lorry_stock_id=?");
        stm.setObject(2,lsid );
        stm.setObject(1, sprice);
        return stm.executeUpdate() > 0;

    }
    public static double getsSprice( String lsid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select selling_price from Lorry_Stock where lorry_stock_id=?");
        pst.setString(1, lsid);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return rs.getDouble(1);
        }
        return 0;
           
    }
   public static boolean downqty(String lsid, int qty) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Lorry_Stock set qty=qty-? where lorry_stock_id=?");
        stm.setObject(2, lsid);
        stm.setObject(1, qty);
        return stm.executeUpdate() > 0;

    }
  public ArrayList<MLorryStock> loadlsTableq() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Lorry_Stock ORDER BY qty ASC  ";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        ArrayList<MLorryStock> itemList = new ArrayList<>();
        while (rs.next()) {
            itemList.add(new MLorryStock(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5)));
        }

        return itemList;
    }
   public List<MstocklorryIn> loadnewls(String lsid) throws ClassNotFoundException, SQLException {

       
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM lorry_in where lorry_stock_id=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, lsid);
            ResultSet rs = pst.executeQuery();

            List<MstocklorryIn> List = new ArrayList<>();
            while (rs.next()) {
                List.add(new MstocklorryIn(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getString(4)));
            }

            return List;
      
    }
}
