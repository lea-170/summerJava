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
public class Compte {
    int idcompte ;
    
    float solde;
    
    int iduser;
    
    int idadmin;

    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }
    
    // e nregistrement d'un element dans la bd
    public void save (  float solde,  int iduser,  int idadmin) throws SQLException{
       
            String command = "INSERT INTO compte (solde, iduser, idadmin) VALUES (?, ?,?)"; // commande permettant d'inserer des valeurs dans notre base de donnees
            PreparedStatement addstmt =
                    JDBC.getConnexion().prepareStatement(command);
            
            addstmt.setObject(1,solde);
            addstmt.setObject(2,iduser);
            addstmt.setObject(3,idadmin);
            addstmt.execute();
       
 
    }
    
    // mise a jour d'un element dans la base de donnees 
    public void update ( int idcompte ,float solde, int iduser,  int idadmin) throws SQLException{
        
        String command = "UPDATE compte SET solde = ?, iduser = ?, idadmin = ? WHERE compte.idcompte = ?;";
        PreparedStatement addstmt =
                 JDBC.getConnexion().prepareStatement(command);
            
            addstmt.setObject(1,solde);
            addstmt.setObject(2,iduser);
            addstmt.setObject(3,idadmin);
            addstmt.execute();
       
 
    }
    
    // methode qui nous permet de supprimer un element dans notre bd(elle n'est generalement pas utilisees)
    public void delete (int idcompte) throws SQLException{
        
        String command = "DELETE FROM compte WHERE compte.idcompte = ?;";
        PreparedStatement addstmt =
                 JDBC.getConnexion().prepareStatement(command);
      
            addstmt.setObject(1 ,idcompte);
            addstmt.execute();
       
 
    }
    
    // affichage  des attributs d'un admin connaissant son id
    public Compte getOne(int idcompte) throws SQLException{
        
        String cmd = "select * from compte where idcompte = ?";
        
        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1,idcompte);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            
            return new Compte(rs.getInt(1),rs.getFloat(2),rs.getInt(3),rs.getInt(4));
        }
        
        return null;
    }
    
    // affichage 
    public List<Compte> getAllCompte() throws SQLException{
        
        String cmd = "select * from compte";
        
        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);
        
        ResultSet rs = stmt.executeQuery();
        
        List<Compte> listCompte = new ArrayList<>();
        while(rs.next()){
            
            listCompte.add(new Compte(rs.getInt(1),rs.getFloat(2),rs.getInt(3),rs.getInt(4)));
        }
        
        return listCompte;
    }

  
    @Override
    public String toString() {
        return "Compte{" + "idcompte=" + idcompte + ", solde=" + solde + ", iduser=" + iduser + ", idadmin=" + idadmin + '}';
    }
 

    public Compte() {
    }

    public Compte(int idcompte, float solde, int iduser, int idadmin) {
        this.idcompte = idcompte;
        this.solde = solde;
        this.iduser = iduser;
        this.idadmin = idadmin;
    }
   
}
