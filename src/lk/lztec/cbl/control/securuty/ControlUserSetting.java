/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.lztec.cbl.control.securuty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.lztec.cbl.db.DBConnection;
import lk.lztec.cbl.module.securuty.MUserSetting;

/**
 *
 * @author Ishan
 */
public class ControlUserSetting {

   
    public static boolean saveUser(MUserSetting mUserSetting) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into User Values(?,md5(?),?)");

        stm.setObject(1, mUserSetting.getName());
        stm.setObject(2, mUserSetting.getPsw());
        stm.setObject(3, mUserSetting.getRole());
        

        return stm.executeUpdate() > 0;
    }
     public String getuser(String user,String psw)  {
     
       
        
         try {
             Connection con = DBConnection.getInstance().getConnection();
             String sql = "select role from User where user_name = ? and psw =md5(?)";
             PreparedStatement stm = con.prepareStatement(sql);
             stm.setString(1, user);
             stm.setString(2, psw);
             ResultSet rs = stm.executeQuery();
             if(rs.next()){
                 return rs.getString("role");
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ControlUserSetting.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ControlUserSetting.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
     }
}
