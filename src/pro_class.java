
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurence
 */
public class pro_class {
    connection c = new connection();
    public int addPro(String product_name, int quantity, String price){
        int c = 0;
        String sql = "INSERT INTO product VALUES(null,?,?,?);";
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/account_registration?", "root", "");
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, product_name);
        pst.setInt(2, quantity);
        pst.setString(3, price);
        c=pst.executeUpdate();
        
       
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(pro_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pro_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }



public int addQuantity(int id, Object quantity){
    int x=0;
        try {
            Class.forName(c.driver);
            Connection con = DriverManager.getConnection(c.url,c.uname,c.pword);
            PreparedStatement ps = con.prepareStatement("update product set quantity = (quantity + ?) where product_id = ?");
           ps.setObject(1, quantity);
            ps.setInt(2, id);
            x =  ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pro_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pro_class.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return x;
}


}




