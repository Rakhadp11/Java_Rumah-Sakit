/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumahsakit;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Koneksi {
    Connection connection;
    
    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/database_rumahsakit","root","");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Koneksi\n" +e);
        }
        return connection;
    } 
  
}


