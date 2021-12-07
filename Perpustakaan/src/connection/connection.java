/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author Kandang
 */

//Krisna Purnama

import java.sql.*;
import javax.swing.JOptionPane;

public class connection {
    private static Connection conn;
    
    public static Connection getconn(){
        if(conn == null){
            try{
                String url = "jdbc:mysql://localhost:3306/perpustakaan";
                String user="root";
                String pass="";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url , user, pass);
                
                JOptionPane.showMessageDialog(null, "Berhasil terhubung dengan Database");
            }catch(Exception e){
                System.out.println("Gagal Koneksi ke Database");
                
                JOptionPane.showMessageDialog(null, "Gagal terhubung dengan Database");
            }
        }
        return conn;
    }
}
