/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.controlleur;

import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Compte;
import com.summercoding.bank.entities.Utilisateur;
import com.summercoding.bank.gestionnaires.GestionnaireAdmin;
import com.summercoding.bank.gestionnaires.GestionnaireCompte;
import com.summercoding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Black Baby
 */
public class Controlleur {
    
   GestionnaireAdmin gestionnaireAdmin = new GestionnaireAdmin();
   GestionnaireUtilisateur gestionnaireUser = new GestionnaireUtilisateur();
   GestionnaireCompte gestionnaireCompte = new GestionnaireCompte();
   
// methode permettant gerer le login de l'administrateur  
   public Admin routeVersLoginAdmin(String login,String pwd) throws SQLException{
       return gestionnaireAdmin.loginAdmin(login, pwd);  
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
   
   // route vers le gestionnaire utilisateur chargee du login et du password 
   public Utilisateur routeVersLoginUser(String login , String pwd) throws SQLException{
       
       return gestionnaireUser.loginUser(login,pwd);
   }
   
   //route vers le gestionnaire admin chargee de l'update 
   public void routeVersUpdateAdmin(int idadmin,String login,String password,String nom) throws SQLException{
       gestionnaireAdmin.updateAdmin(idadmin,login, password, nom);
   }
   
   //route vers le gestionnaire utilisateur chargee du delete 
   public void routeVersDeleteAdmin(int idadmin) throws SQLException{
       
       gestionnaireAdmin.deleteAdmin(idadmin);
   }
   
   public void routeVersUpdateUser(int iduser,String login, String password,String nom,String prenom, LocalDate datenaiss,String genre,int idadmin) throws SQLException{
       gestionnaireUser.updateUser(iduser,login, password, nom, prenom, datenaiss, genre, idadmin);
   }
   
   public List<Compte> routeVersListAllCompte() throws SQLException{
       
       return gestionnaireCompte.listAllCompte();
   }
   
   public void routeVersUpdateCompte(int idcompte,float solde,int iduser,int idadmin) throws SQLException{
       
       gestionnaireCompte.updateCompte(idcompte, solde, iduser, idadmin);
   }
   
   public Compte routeVersGetDetailsCompte(int idcompte) throws SQLException{
       
       return gestionnaireCompte.getDetailsCompte(idcompte);
   }
   
   public void routeVersDeleteCompte(int idcompte) throws SQLException{
       
       gestionnaireCompte.deleteCompte(idcompte);
   }
   
   public void routeVersDeleteUser(int iduser) throws SQLException{
       
       gestionnaireUser.deleteUser(iduser);
   }
   
   // methode permettant de verifier la valide du login en email
   public boolean isEmailValid(String login){
       boolean isValid = false;
       
       // Expression de notre email
       String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Za-z]{2,4}$";
       
       CharSequence inputStr = login;
       
       Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
       
       Matcher matcher = pattern.matcher(inputStr);
       
       // verification de la validite du login
       if(matcher.matches()){
           
           isValid = true;
           
       }
       
       return isValid;
   }
   
   // methode permettant de verifier la validite du mot de passe 
   public boolean isPasswordValid(String password){
       
       String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
       
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(password);
       
       
       return matcher.matches();
     
   }
}
