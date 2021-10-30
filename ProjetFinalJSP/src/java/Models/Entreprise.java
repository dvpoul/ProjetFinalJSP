/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author EWOL
 */
public class Entreprise {

    private int id_entreprise;
    private int id_categorie;
    private String nom;
    private String adresse;
    private String courriel;
    private String contact;
    private String telephoneContact;

    public int getId_entreprise() {
        return id_entreprise;
    }

    public void setId_entreprise(int id_entreprise) {
        this.id_entreprise = id_entreprise;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephoneContact() {
        return telephoneContact;
    }

    public void setTelephoneContact(String telephoneContact) {
        this.telephoneContact = telephoneContact;
    }

    public Entreprise(int id_entreprise, int id_categorie, String nom, String adresse, String courriel, String contact, String telephoneContact) {
        this.id_entreprise = id_entreprise;
        this.id_categorie = id_categorie;
        this.nom = nom;
        this.adresse = adresse;
        this.courriel = courriel;
        this.contact = contact;
        this.telephoneContact = telephoneContact;
    }

    public Entreprise() {
    }

}
