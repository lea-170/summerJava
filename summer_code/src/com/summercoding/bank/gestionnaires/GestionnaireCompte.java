/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Compte;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Black Baby
 */
public class GestionnaireCompte {
    
    private Compte compte = new Compte();
    
    // fonction permettant d'enregistrer le solde d'un utilisateur 
    public void saveCompte(float solde,int iduser,int idadmin) throws SQLException{
        
        compte.save(solde, iduser, idadmin);
    }
    
    // fonction permettant de retrouver la liste des comptes 
    public List<Compte> listAllCompte() throws SQLException{
        
       return compte.getAllCompte();
    }
    
    public void updateCompte(int idcompe,float solde,int iduser,int idadmin) throws SQLException{
        
        compte.update(idcompe, solde, iduser, idadmin);
    }
    
    public Compte getDetailsCompte (int idcompte) throws SQLException{
        
        return compte.getOne(idcompte);
    }
    
    public void deleteCompte(int idcompte) throws SQLException{
        
        compte.delete(idcompte);
    }
}
