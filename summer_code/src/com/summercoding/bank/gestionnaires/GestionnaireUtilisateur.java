/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Utilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Black Baby
 */
public class GestionnaireUtilisateur {
    
    private Utilisateur user = new Utilisateur();
    
   // methode permettant de faire le login d'un utilisateur 
    public Utilisateur loginUser(String login,String pwd) throws SQLException{
        
        return user.getByLoginAndPassword(login, pwd);
                
    }
    
    // methode permettant d'enregistrer un utilisateur 
    public void saveUtilisateur(String login, String password,String nom,String prenom, LocalDate datenaiss,String genre,int idadmin) throws SQLException{
        
        user.save(login, password, nom,prenom,datenaiss,genre,idadmin);
    }
    
    //methode permettant de recuperer la liste de tous les utilisateurs 
    public List<Utilisateur> listAllUtilisateur() throws SQLException{
        
        return user.getAllUtilisateur();
    }
    
    // methode permettant de trouver un utilisateur connaissant son id dans la base de donnee
    public Utilisateur getUtilisateurByIduser(int iduser) throws SQLException{
         return user.getOne(iduser);  
    }
    
    public void updateUser(int iduser,String login, String password,String nom,String prenom, LocalDate datenaiss,String genre,int idadmin) throws SQLException{
        user.update(iduser, login, password, nom, prenom, datenaiss, genre, idadmin);
    }
    
    public void deleteUser(int iduser) throws SQLException{
        
        user.delete(iduser);
    }
}
