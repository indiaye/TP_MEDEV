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

    private int prix;
    private Joueur proprietaire;

    // Constructors

    /**
    * Constructeur de la classe Achetable avec proprietaire
    * @param prix         Prix
    * @param proprietaire Proprietaire
    * @param nom          Nom
    * @param numero       Numero
    */
    public Achetable(int prix, Joueur proprietaire, String nom, int numero) {
        super(nom, numero);
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    /**
    * Constructeur de la classe Achetable sans proprietaire
    * @param prix         Prix
    * @param nom          Nom
    * @param numero       Numero
    */
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
    
    /**
    * Constructeur de la classe Achetable avec proprietaire
    * @return Boolean si achetable
    */
    public boolean demandeAchetable() {
        return this.proprietaire == null;
    }
    
    @Override
    public String toString() {
        return this.getNom() + " ( prix : " + this.getPrix() + "E ) - " + (demandeAchetable() ? "Sans propriétaire" : this.proprietaire.getNom());
    }
    
    /**
     * Interaction avec une case lambda.
     * Vérifie si la case a un propriétaire ou non.
     * Si c'est le cas, demande au joueur s'il souhaite l'acheter.
     * Sinon vérifie s'il a un loyer à payer (et le lui fait payer)
     * @param j le joueur concerné
     */
    public void interagir(Joueur j){
        if(this.proprietaire == null){
            this.demandeAchat(j);
        } else {
            this.demandeLoyer(j);
        }
    }
    
    public void demandeAchat(Joueur j){
        
    }
    
    public void demandeLoyer(Joueur j){
        
    }
    
}
