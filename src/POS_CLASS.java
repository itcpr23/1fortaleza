
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class POS_CLASS {
        public void getProduct(int barcode, JTable table){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/account_registration?", "root", "");
            
            String sql = "SELECT * FROM product where PRODUCT_ID=?;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, barcode);
            
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel mod = (DefaultTableModel)table.getModel();
            if(rs.next()){
                mod.addRow(new Object[]{rs.getString("PRODUCT_ID"),rs.getString("PRODUCT_NAME"),rs.getString("PRICE"),rs.getString("PRICE")});

            }else{
                JOptionPane.showMessageDialog(table, "No Product on Database");
            }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(POS_CLASS.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(POS_CLASS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}
