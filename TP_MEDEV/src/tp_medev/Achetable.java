/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author Hicham
 */
public abstract class Achetable extends Case {
    
    // TEST
    private int prix;
    private Joueur proprietaire;
    
    // Constructors

    public Achetable(int prix, Joueur proprietaire, String Nom, int Numero) {
        super(Nom, Numero);
        this.prix = prix;
        this.proprietaire = proprietaire;
    }
    
    // Getters

    public int getPrix() {
        return prix;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }
    
    // Setters

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }  
    
    
    
}
