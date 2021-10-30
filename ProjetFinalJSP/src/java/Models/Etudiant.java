/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;

/**
 *
 * @author dave-
 */
public class Etudiant {

    //pour authentification
    private String username;
    private String password;
    private String nom;
    private String prenom;
    private String courriel;
    private String telephone;
    private int programme;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getProgramme() {
        return programme;
    }

    public void setProgramme(int programme) {
        this.programme = programme;
    }

    public Etudiant() {
    }

    public Etudiant(String username, String password, String nom, String prenom, String courriel, String telephone, int programme) {
        this.username = username;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.telephone = telephone;
        this.programme = programme;
    }

}
