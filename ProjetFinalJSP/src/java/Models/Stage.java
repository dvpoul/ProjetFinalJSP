/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Calendar;

/**
 *
 * @author dave-
 */
public class Stage {

    private int id_stage;
    private int id_entreprise;
    private String nom;
    private String description;
    private int categorie;
    private Calendar dateStage;

    public int getStage() {
        return id_stage;
    }

    public void setStage(int stage) {
        this.id_stage = stage;
    }

    public int getEntreprise() {
        return id_entreprise;
    }

    public void setEntreprise(int entreprise) {
        this.id_entreprise = entreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public Calendar getDateStage() {
        return dateStage;
    }

    public void setDateStage(Calendar dateStage) {
        this.dateStage = dateStage;
    }

    public Stage(int id_stage, int id_entreprise, String nom, String description, int categorie, Calendar dateStage) {
        this.id_stage = id_stage;
        this.id_entreprise = id_entreprise;
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
        this.dateStage = dateStage;
    }

    public Stage() {
    }

}
