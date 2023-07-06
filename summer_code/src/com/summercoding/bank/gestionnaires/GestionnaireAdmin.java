/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Admin;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Black Baby
 */
public class GestionnaireAdmin {
    
    private Admin admin = new Admin();
    
    // methode permettant de faire le login de l'admin    
    public Admin login(String login,String pwd) throws SQLException{
            
        return admin.getByLoginAndPassword(login, pwd);
        
    }
    
    // methode permettant d'enregistrer un admin
    public void saveAdmin(String login, String password,String nom) throws SQLException{
        
        admin.save(login, password, nom);
    }
    
    //methode permttant de recuperer la liste de tous les admins enregistres
    public List<Admin> ListAllAdmin() throws SQLException{
        return admin.getAllAdmin();
    }
    
    // methode permettant de recuperer les informations d'un admin connaissant son idadmin
    public Admin getAdminIdadmin(int idadmin) throws SQLException{
        
        return admin.getOne(idadmin);
    }
}
