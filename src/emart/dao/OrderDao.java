/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.dao;

import emart.dbbuilt.DBConnection;
import emart.pojo.ProductPojo;
import emart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ABC
 */
public class OrderDao {
    public static String getNextOrderId()throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(order_id) from orders");
        rs.next();
        String ordid = rs.getString(1);
        if(ordid==null)
            return "O-101";
        int ordno = Integer.parseInt(ordid.substring(2));
        ordno = ordno+1;
        return "O-"+ordno;
    }
    
    public static boolean addOrders(ArrayList<ProductPojo>al,String ordId)throws SQLException
    {
         Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement("insert into orders values(?,?,?,?)");
         int count = 0;
         for(ProductPojo p:al){
             ps.setString(1, ordId);
             ps.setString(2, p.getProuductId());
             ps.setInt(3, p.getQuantity());
             ps.setString(4,UserProfile.getUserid());
             count = count + ps.executeUpdate();
         }
         return count==al.size();
    }
}
