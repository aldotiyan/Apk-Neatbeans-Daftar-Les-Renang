/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aldot
 */
public class KonfiqRemaja {
    
    private static Connection MysqlConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/remaja";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MysqlConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.out.println("Koneksi Data base Gagal "+ e.getMessage());
        }
        return MysqlConfig;
    }
}
