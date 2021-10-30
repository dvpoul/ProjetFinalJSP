/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author dave-
 */
public class StageChoisi {

    private int id_stage;
    private int id_entreprise;
    private String nom;
    private int categorie;

    public int getId_stage() {
        return id_stage;
    }

    public void setId_stage(int id_stage) {
        this.id_stage = id_stage;
    }

    public int getId_entreprise() {
        return id_entreprise;
    }

    public void setId_entreprise(int id_entreprise) {
        this.id_entreprise = id_entreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public StageChoisi(int id_stage, int id_entreprise, String nom, int categorie) {
        this.id_stage = id_stage;
        this.id_entreprise = id_entreprise;
        this.nom = nom;
        this.categorie = categorie;
    }

    public StageChoisi() {
    }

}
