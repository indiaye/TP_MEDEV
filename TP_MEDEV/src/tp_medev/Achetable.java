/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

import java.util.Scanner;
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
    * Constructeur de la classe Achetable avec propriétaire
    * @param prix         Prix
    * @param proprietaire Propriétaire
    * @param nom          Nom
    * @param numero       Numéro
    */
    public Achetable(int prix, Joueur proprietaire, String nom, int numero) {
        super(nom, numero);
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    /**
    * Constructeur de la classe Achetable sans propriétaire
    * @param prix         Prix
    * @param nom          Nom
    * @param numero       Numéro
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
    * Vérifie si le terrain est achetable
    * @return Vrai si achetable
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
     * @throws tp_medev.NoMoreMoney
     */
    public void demandeLoyer(Joueur j) {
        
        if (!this.proprietaire.equals(j)) { // vérifie si le joueur concerné n'est pas le propriétaire
            int montant = 0;
            if (this instanceof Gare) { // s'il s'agit d'une gare, calculer le coût d'une gare
                montant = ((Gare) this).calculLoyer(j);
            } else { // sinon calculer le coût d'une propriété lambda
                montant = ((Constructible) this).calculLoyer(j);
            }
            
            try {
                j.paiement(this.proprietaire, montant); // effectue le paiement du joueur envers le propriétaire
            } catch (NoMoreMoney ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public abstract int calculLoyer(Joueur j);
    
    public void demandeAchatJoueur(Joueur j) throws NoMoreMoney{
        
        System.out.println("Voulez vous acheter cette propriété? Oui (1) ou Non (0)");
        Scanner scan = new Scanner (System.in);
        int choix = scan.nextInt();
        if (choix==1){
            if (j.getFortune()-prix>0){
                j.setFortune(j.getFortune()-prix);
                proprietaire=j;
            }
            else{
                throw new NoMoreMoney();
            }
        }
        
        
    }
}
