/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

/**
 *
 * @author etien
 */
public class Etudiant {
   private int id_utilisateur;

   private int numero;
   private int id_groupe;
  
   
   public Etudiant(int id_utilisateur,int numero,int id_groupe ) {
    this.id_utilisateur = id_utilisateur;
    this.numero=numero;
    this.id_groupe=id_groupe;
  }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public int getNumero() {
        return numero;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }
   
}
