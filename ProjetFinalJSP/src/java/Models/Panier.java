/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dave-
 */
public class Panier {

    //pour gestion session stage choisie
    //liste des stages choisis
    private List<StageChoisi> liste;

    public Panier() {
        this.liste = new ArrayList();
    }

    public void ajouter(StageChoisi element) {
        this.liste.add(element);

    }

    public void supprimer(int numero) {

        this.liste.remove(this.liste.stream().filter(l -> l.getId_stage() == numero).findFirst().get());
    }

    public List<StageChoisi> getListe() {
        return this.liste;
    }

    public void vider() {
        this.liste.clear();

    }

    public boolean isPresent(int numero) {
        if (this.liste.contains(this.liste.stream().filter(l -> l.getId_stage() == numero).findFirst().get())) {
            return true;
        } else {
            return false;
        }
    }

}
