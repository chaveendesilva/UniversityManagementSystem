/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KAVINDI
 */
public class DBconnect {
    
    
    public static Connection connect(){
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system?", "root", "");
            System.out.println("Db connection success");
            
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.print(e);
        }
        return conn;
    }
}
