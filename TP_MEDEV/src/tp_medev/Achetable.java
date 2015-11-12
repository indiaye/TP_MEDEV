/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    /**
     * Affichage de classe Achetable
     * @return Affichage de la classe Achetable
     */
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
    @Override
    public void interagir(Joueur j){
        if(this.proprietaire == null){
            this.demandeAchat(j);
        } else {
            this.demandeLoyer(j);
        }
    }
    
    public void demandeAchat(Joueur j){
        
    }
    
    /** Vérifie et demande le loyer au joueur.     * 
     * Si le joueur est le propriétaire, il ne se passe rien.
     * Sinon calcule le montant et appelle la méthode paiement dans joueur.
     * Suppose que la case a un propriétaire.
     * 
     * @param j le joueur arrivant sur la case
     */
    public void demandeLoyer(Joueur j){
        // Déclaration des varaibles
        int montant;
        
        // vérifie si le joueur concerné n'est pas le propriétaire
        if (!this.proprietaire.equals(j)){
            // S'il s'agit d'une gare, calculer le coût d'une gare
            if (this instanceof Gare){ 
                montant = ((Gare)this).calculerCout();
            } 
            // Sinon calculer le coût d'une propriété lambda
            else { 
                montant = ((Constructible)this).calculerCout();
            }
            
            // Effectue la transaction entre le joueur et le propiétaire
            try { 
                j.paiement(this.proprietaire, montant);
            } catch (NoMoreMoney ex) {
                Logger.getLogger(Achetable.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public abstract int calculerCout();
    
    public void demandeAchatJoueur(Joueur j){
        
        System.out.println("");
    }
}
