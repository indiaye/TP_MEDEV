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
    public Achetable(int prix, Joueur proprietaire, String nom, int numero) {
        super(nom, numero);
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    // Constructeur par défault de la classe Achetable (affectation d'un proprietaire null)
    public Achetable(int prix, String nom, int numero) {
        super(nom, numero);
        this.prix = prix;
        this.proprietaire = null;
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
    
    public boolean demandeAchetable() {
        return this.proprietaire == null;
    }
    
        @Override
    public String toString() {
        return this.getNom() + " ( prix : " + this.getPrix() + "E ) - " + (demandeAchetable() ? "Sans propriétaire" : this.proprietaire.getNom());
    }
    
}
