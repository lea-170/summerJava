/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Black Baby
 */
public class JDBC {
    private final static String URL = "jdbc:mysql://localhost:3306/summerbankdb";
    
    private final static String USER = "root";
    
    private final static String PASSWORD = "";
    
    // methade permettant le chargement dans mysql
    public static Connection getConnexion(){
    
        
        try {            
            Connection connexion = null;
            
            Class.forName("com.mysql.jdbc.Driver");
            
            return (Connection) DriverManager.getConnection(URL,USER,PASSWORD);// permet la connexiom a la base de donnees 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return null;
    }
}




