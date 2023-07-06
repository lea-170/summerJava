/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.summercoding.bank.ui;

import com.summercoding.bank.controlleur.Controlleur;
import com.summercoding.bank.entities.Admin;
import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Black Baby
 */
public class JFrameSaveUtilisateur extends javax.swing.JFrame {
    
     Controlleur controlleur = new Controlleur();
    /**
     * Creates new form JFrameSaveUtilisateur
     */
    public JFrameSaveUtilisateur() {
        initComponents();
        initOthersComponents();
    }
    
    private void initOthersComponents(){
        
         
        // code permettant d'initialiser le radio button
        RadioButtonFeminin.setSelected(true);
        Calendar calendrier = Calendar.getInstance();
        int curentYear = calendrier.get(Calendar.YEAR);
        
        // code permettant d'initialiser les annees , les mois et les jours 
        for(int i = curentYear ; i>=1900 ; i--){
            
            ComboBoxAnnee.addItem(i+"");
        }
        
         for(int i = 1 ; i<=12 ; i++){
            
            ComboBoxMois.addItem(i+"");
        }
         
         /* for(int i = 1 ; i<=31 ; i++){
            
            ComboBoxJour.addItem(i+"");
        }*/
        
         try {
             for(Admin admin : controlleur.routeVersListAllAdmin()){
                 ComboBoxAdmin.addItem(admin.getIdadmin()+ " " +admin.getLogin());
             }
         } catch (SQLException ex) {
             Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        champLogin = new javax.swing.JTextField();
        champNom = new javax.swing.JTextField();
        champPassword = new javax.swing.JPasswordField();
        champPrenom = new javax.swing.JTextField();
        ComboBoxAnnee = new javax.swing.JComboBox<>();
        ComboBoxMois = new javax.swing.JComboBox<>();
        ComboBoxJour = new javax.swing.JComboBox<>();
        RadioButtonMasculin = new javax.swing.JRadioButton();
        RadioButtonFeminin = new javax.swing.JRadioButton();
        ComboBoxAdmin = new javax.swing.JComboBox<>();
        buttonOk = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Password");

        jLabel3.setText("Nom");

        jLabel4.setText("Prenom");

        jLabel5.setText("Date de naissance");

        jLabel6.setText("Genre");

        jLabel7.setText("Id Admin");

        ComboBoxAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAnneeActionPerformed(evt);
            }
        });

        ComboBoxMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMoisActionPerformed(evt);
            }
        });

        ComboBoxJour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        ComboBoxJour.setSelectedIndex(-1);
        ComboBoxJour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxJourActionPerformed(evt);
            }
        });

        RadioButtonMasculin.setText("Masculin");
        RadioButtonMasculin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMasculinActionPerformed(evt);
            }
        });

        RadioButtonFeminin.setText("Feminin");
        RadioButtonFeminin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFemininActionPerformed(evt);
            }
        });

        buttonOk.setText("OK");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(champLogin)
                            .addComponent(champNom)
                            .addComponent(champPassword)
                            .addComponent(champPrenom)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioButtonMasculin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RadioButtonFeminin))
                            .addComponent(ComboBoxAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonOk)
                        .addGap(53, 53, 53)
                        .addComponent(buttonCancel)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RadioButtonMasculin))
                    .addComponent(RadioButtonFeminin))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(ComboBoxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonOk))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
         try {
             // TODO add your handling code here:
             String login = champLogin.getText();
             String password = champPassword.getText();
             String nom = champNom.getText();
             String prenom = champPrenom.getText();
             String genre = RadioButtonFeminin.getText();
             
             if(RadioButtonMasculin.isSelected()){
                 genre = RadioButtonMasculin.getText();
             }
             
             /* pour le genre en boolean
             boolean genre = ! RadioButtonFeminin.isSelected;
             */
             int annee = Integer.parseInt(ComboBoxAnnee.getSelectedItem().toString()); 
             int mois = Integer.parseInt(ComboBoxMois.getSelectedItem().toString());
             int jour = Integer.parseInt(ComboBoxJour.getSelectedItem().toString());
             LocalDate datenaiss = LocalDate.of(annee,mois,jour);
             
             String idAdminString =  ComboBoxAdmin.getSelectedItem().toString().split(" ")[0];
             int idAdmin = Integer.parseInt(idAdminString);
             
             controlleur.routeVersSaveUtilisateur(login, password, nom, prenom, datenaiss, genre, idAdmin);
             
             JOptionPane.showMessageDialog(null, "Sucess");
            
             champLogin.setText("");
             champPassword.setText("");
             champNom.setText("");
             champPrenom.setText("");
             
             
         } catch (SQLException ex) {
             Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Veuillez contacter l'administrateur");
         }
    }//GEN-LAST:event_buttonOkActionPerformed

    private void RadioButtonMasculinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMasculinActionPerformed
        // TODO add your handling code here:
        
        // permet de desactiver le bouton de feminin lorsqu'on clique sur celui du masculin
         RadioButtonFeminin.setSelected(false);
    }//GEN-LAST:event_RadioButtonMasculinActionPerformed

    private void RadioButtonFemininActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFemininActionPerformed
        // TODO add your handling code here:
        
        // permet de desactiver le bouton de masculin lorsqu'on clique sur celui du feminin
        RadioButtonMasculin.setSelected(false);
    }//GEN-LAST:event_RadioButtonFemininActionPerformed

    private void ComboBoxAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAnneeActionPerformed
        // TODO add your handling code here:
        
        ComboBoxMois.setSelectedItem(1 + "");
        ComboBoxJour.setSelectedItem(1 + "");
    }//GEN-LAST:event_ComboBoxAnneeActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void ComboBoxJourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxJourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxJourActionPerformed

    private void ComboBoxMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMoisActionPerformed
        // TODO add your handling code here:
      
        // Bout de code permettant d'afficher le nombre de jours correspondant a un mois donnee
        int mois = Integer.parseInt(ComboBoxMois.getSelectedItem().toString());
        int annee = Integer.parseInt(ComboBoxAnnee.getSelectedItem().toString());
        
        Calendar calendrier = Calendar.getInstance();
        calendrier.set(Calendar.YEAR,annee);
        calendrier.set(Calendar.MONTH, mois-1);
        
        int joursDansMois = calendrier.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        ComboBoxJour.removeAllItems();
        for(int i = 1; i<= joursDansMois; i++){
            
            ComboBoxJour.addItem(String.valueOf(i));
        }
         
    }//GEN-LAST:event_ComboBoxMoisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSaveUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxAdmin;
    private javax.swing.JComboBox<String> ComboBoxAnnee;
    private javax.swing.JComboBox<String> ComboBoxJour;
    private javax.swing.JComboBox<String> ComboBoxMois;
    private javax.swing.JRadioButton RadioButtonFeminin;
    private javax.swing.JRadioButton RadioButtonMasculin;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonOk;
    private javax.swing.JTextField champLogin;
    private javax.swing.JTextField champNom;
    private javax.swing.JPasswordField champPassword;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}