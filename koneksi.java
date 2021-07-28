/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.ui;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ANDIKA
 */
class koneksi {
    private static final String DB_NAME = "kasir_sm";
    private static final String USER ="root";
    private static final String PASSWORD ="";
    private static final String URL ="jdbc:mysql://localhost:3306/" + DB_NAME;
    
    public static Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new Driver());
        
        Connection connections = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_sm","root","");
        //untuk mengoneksikan ke database
        return connections;//mereturn connection
    }
    

 


}
