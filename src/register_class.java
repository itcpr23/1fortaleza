
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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



public class register_class {
    
    public int list(String fname, String lname, String uname, String password){
        int opt=0;  
       String sql = "INSERT INTO accounttable VALUES(?,?,?,md5(?));";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/account_registration?", "root", "");
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, fname);
            pstmt.setString(2, lname );
            pstmt.setString(3, uname);
            pstmt.setString(4, password);
            
            
            pstmt.executeUpdate();
           opt=1;
            
        } catch (ClassNotFoundException ex) {
            opt=0;
        } catch (SQLException ex) {
           opt=0;
        }
    return opt;  
    }
    
     public int mcheckpass(String pass, String cpass){
        int x = 0;
        if(pass.equals(cpass)){
            x=1;
        }else{
            x=0;
        }
        
        
        return x;
    }
    
     public int checkUser(String uname){
        int x=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/account_registration?", "root", "");
            String sql = "select * from accounttable where username=?;";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, uname);
            
            ResultSet rs =pstmt.executeQuery();
            if(rs.next()){
                x=1;
            }else{
                x=0;
            }
            
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(register_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
        
    }
    
}
