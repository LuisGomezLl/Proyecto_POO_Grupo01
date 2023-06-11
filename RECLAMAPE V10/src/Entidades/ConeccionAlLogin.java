/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class ConeccionAlLogin {
    
    static final String DB_URL="jdbc:mysql://localhost/datospersonales";
    static final String USER = "root";
    static final String PASS="";
    
    public static Connection connectDB()
    {
        Connection conn = null;
        
        try{
       
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn; 
            
        }catch(Exception ex){
        
            System.out.println("Hay errores mientras conectamos la base de datos ");
            return null;
        
        }
    
    }
    
    
    
}
