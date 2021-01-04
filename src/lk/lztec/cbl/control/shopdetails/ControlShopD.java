/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.shopdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.shopdetails.MShop;

/**
 *
 * @author Ishan
 */
public class ControlShopD {
    public static boolean saveshop(MShop mShop) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into shop_details Values(?,?,?,?,?,?)");

        stm.setObject(1, mShop.getId());
        stm.setObject(2, mShop.getName());
        stm.setObject(3, mShop.getAddress());
        stm.setObject(4, mShop.getPhone());
        stm.setObject(5, mShop.getOname());
        stm.setObject(6, mShop.getOmic());

        return stm.executeUpdate() > 0;
    }
    public static boolean DeleteShop(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete from shop_details where shop_id='" + id + "'";
        Statement stm = connection.createStatement();
        return stm.executeUpdate(SQL) > 0;
    }
      public List<MShop> getAllshop() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM shop_details";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<MShop> helperList = new ArrayList<>();
        while (rs.next()) {
            helperList.add(new MShop(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
        }

        return helperList;
    }
}
