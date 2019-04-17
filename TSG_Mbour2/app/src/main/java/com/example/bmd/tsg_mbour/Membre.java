package com.example.bmd.tsg_mbour;

/**
 * Created by bmd on 15/04/19.
 */

public class Membre {
    String prenom;
    String nom;
    String telephone;
    String fonction;
    String email;
    String password;

    public Membre(){

    }

    public Membre(String prenom, String nom, String telephone, String fonction, String email, String password) {
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.fonction = fonction;
        this.email = email;
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
