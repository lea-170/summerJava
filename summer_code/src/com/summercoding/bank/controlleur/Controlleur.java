/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.controlleur;

import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Utilisateur;
import com.summercoding.bank.gestionnaires.GestionnaireAdmin;
import com.summercoding.bank.gestionnaires.GestionnaireCompte;
import com.summercoding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Black Baby
 */
public class Controlleur {
    
   GestionnaireAdmin gestionnaireAdmin = new GestionnaireAdmin();
   GestionnaireUtilisateur gestionnaireUser = new GestionnaireUtilisateur();
   GestionnaireCompte gestionnaireCompte = new GestionnaireCompte();
   // methode permettant gerer le login de l'administrateur  
   public Admin routeVersLogin(String login,String pwd) throws SQLException{
       return gestionnaireAdmin.login(login, pwd);  
   }
   
   public void routeVersSaveAdmin(String login,String password,String nom) throws SQLException{
       gestionnaireAdmin.saveAdmin(login, password, nom);
   }
   
   //route permettant de gerer l'enregistrement d'un utilisateur(route) 
   public void routeVersSaveUtilisateur(String login, String password,String nom,String prenom, LocalDate datenaiss,String genre,int idadmin) throws SQLException{
       
       gestionnaireUser.saveUtilisateur(login, password, nom,prenom,datenaiss,genre,idadmin);
   } 
   
   // route permettant de renvoyer la liste des tous les admins 
   public List<Admin> routeVersListAllAdmin() throws SQLException{
      return  gestionnaireAdmin.ListAllAdmin();
   }
   
   // route permettant d'enregistrer les comptes 
   public void routeVersSaveCompte(float solde,int iduser,int idadmin) throws SQLException{
       
       gestionnaireCompte.saveCompte(solde, iduser, idadmin);
   }
   
   // route permettant de renvoyer la liste de tous les utilisateurs 
   public List<Utilisateur> routeVersListAllUtilisateur() throws SQLException{
       
       return gestionnaireUser.listAllUtilisateur();
   }
   
   // route permettant de recuperer les informations d'un utilisateur connaissant son id
   public Utilisateur routeVersGetUtilisateurIduser(int iduser) throws SQLException{
       
       return gestionnaireUser.getUtilisateurByIduser(iduser);
   }
   
   // route permettant de recuperer les informations concernant un admin a partir de son id 
   public Admin  routeVersGetAdminIdadmin(int idadmin) throws SQLException{
       
       return gestionnaireAdmin.getAdminIdadmin(idadmin);
       
   }
}
