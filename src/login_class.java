
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurence
 */
public class login_class {
    
    public int logIn(String uname, String password){
          int c = 0;
        String sql = "SELECT * FROM accounttable WHERE USERNAME=? AND PASSWORD=md5(?);";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/account_registration?", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, uname);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                c=1;
                
            }else{
              c=0;
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
