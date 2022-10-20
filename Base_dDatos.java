/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Antonio Casas Martínez
 */





public class Base_dDatos {
    
    
    public static String servername = "127.0.0.1";
    public static String user = "root";
    public static String BdDname = "productos_BdD";
    public static int portnumber = 3306;
    public static String password = "@Tercero6@";
    
   
    public static Connection getConnection(){
     
        
        MysqlDataSource datasource = new MysqlDataSource();
    
        datasource.setServerName(servername);
        datasource.setUser(user);
        datasource.setDatabaseName(BdDname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            return datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Base_dDatos.class.getName()).log(Level.SEVERE, null, ex);
        }   return null;
        
        
    }
    
    
    
}
