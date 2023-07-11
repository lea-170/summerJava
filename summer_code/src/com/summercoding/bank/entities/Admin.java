/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.entities;

import com.summercoding.bank.utils.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Black Baby
 */
public class Admin {
    
    int idadmin;

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }
    
    String login;
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    String password ;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String nom;
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public void save (  String login,  String password,  String nom) throws SQLException{
        
            String command = "INSERT INTO admin (login, password, nom) VALUES (?, ?,?)"; // commande permettant d'inserer des valeurs dans notre base de donnees
            PreparedStatement addstmt =
                    JDBC.getConnexion().prepareStatement(command);
            
            addstmt.setObject(1,login);
            addstmt.setObject(2,password);
            addstmt.setObject(3,nom);
            addstmt.execute();
       
 
    }
    
    // mise a jour d'un element dans la base de donnees 
    public void update (  int idadmin, String login,  String password,  String nom) throws SQLException{
        
        String command = "UPDATE admin SET login = ?, password = ?, nom = ? WHERE admin.idadmin = ?;";
        PreparedStatement addstmt =
                 JDBC.getConnexion().prepareStatement(command);
            
            addstmt.setObject(1,login);
            addstmt.setObject(2,password);
            addstmt.setObject(3,nom);
            addstmt.setObject(4,idadmin);
            addstmt.execute();
       
 
    }
    
    // methode qui nous permet de supprimer un element dans notre bd(elle n'est generalement pas utilisees)
    public void delete (int idadmin) throws SQLException{
        
        String command = "DELETE FROM admin WHERE admin.idadmin = ?;";
        PreparedStatement addstmt =
                 JDBC.getConnexion().prepareStatement(command);
      
            addstmt.setObject(1 ,idadmin);
            addstmt.execute();
       
 
    }
    
    // affichage  des attributs d'un admin connaissant son id
    public Admin getOne(int idadmin) throws SQLException{
        
        String cmd = "select * from admin where idadmin = ?";
        
        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1,idadmin);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            
            return new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
        }
        
        return null;
    }
    
    // methode pour le login et le password
    public Admin getByLoginAndPassword(String login,String password) throws SQLException{
        
        String cmd = "select * from admin where login = ? and password = ?";
        
        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1,login);
        stmt.setObject(2,password);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            
            return new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
        }
        
        return null;
    }
    
    // affichage 
    public List<Admin> getAllAdmin() throws SQLException{
        
        String cmd = "select * from admin order by idadmin desc";
        
        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);
        
        ResultSet rs = stmt.executeQuery();
        
        List<Admin> listAdmin = new ArrayList<>();
        while(rs.next()){
            
            listAdmin.add(new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
        }
        
        return listAdmin;
    }

    public Admin() {
    }

    public Admin(int idadmin, String login, String password, String nom) {
        this.idadmin = idadmin;
        this.login = login;
        this.password = password;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Admin{" + "idadmin=" + idadmin + ", login=" + login + ", password=" + password + ", nom=" + nom + '}';
    }
 
     /*public static  void main(String arg[]){
         Admin admin = new Admin();
        try {
            //admin.save("tamo", "gilbert","dagobert");
            
            String result = admin.getOne(2).toString(); // aide à convertir cet objet en un string, ça récupère les données de l'admin qui a l'id 2
            System.out.println(result);
            
            result = admin.getAllAdmin().toString();
            System.out.println(result); // on écrit le résultat
            
            result = admin.getByLoginAndPassword("root3", "root3").toString();
            System.out.println(result);
            
            // admin.delete(3);  //System.out.println(result);
            
            admin.update(2, "root3", "root3", "root3"); // pour tester la méthode update
            
            // System.out.println(admin.getOne(1).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
     }*/               
}
