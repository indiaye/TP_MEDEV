/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

import java.util.ArrayList;

/**
 *
 * @author Hicham
 */
public class Joueur {
    
    private String nom;
    private int fortune;
    private Case position;
    private ArrayList<Achetable> possession;
    private boolean emprisonne;
    private int nbtoursatt;
    
    // Constructors

    public Joueur(String nom, int fortune, Case position, ArrayList<Achetable> possession, boolean emprisonne, int nbtoursatt) {
        this.nom = nom;
        this.fortune = fortune;
        this.position = position;
        this.possession = possession;
        this.emprisonne = emprisonne;
        this.nbtoursatt = nbtoursatt;
    }
    
    // Getters

    public String getNom() {
        return nom;
    }

    public int getFortune() {
        return fortune;
    }

    public Case getPosition() {
        return position;
    }

    public ArrayList<Achetable> getPossession() {
        return possession;
    }

    public boolean isEmprisonne() {
        return emprisonne;
    }

    public int getNbtoursatt() {
        return nbtoursatt;
    }   
    
    
    // Setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public void setPosition(Case position) {
        this.position = position;
    }

    public void setPossession(ArrayList<Achetable> possession) {
        this.possession = possession;
    }

    public void setEmprisonne(boolean emprisonne) {
        this.emprisonne = emprisonne;
    }

    public void setNbtoursatt(int nbtoursatt) {
        this.nbtoursatt = nbtoursatt;
    }
    
    /**
     * Méthode sans argument dans la classe Joueur qui retourne le nombre de gares possédées par le joueur
     * @return nombre de gares possédées
     */
    public int nbGares(){
        int n=0;
        for (Achetable c : possession){
            if(c instanceof Gare) n++;
        }
        return n;
    }
    
    /**
     * Methode permettant le paiement entre deux joueurs
     * @param j joueur à payer
     * @param montant somme à payer
     * @throws NoMoreMoney exception quand le joueur n'a pas assez d'argent pour payer
     */
    public void paiement(Joueur j, int montant) throws NoMoreMoney{
        if (fortune >= montant){
            this.fortune -= montant;
            j.setFortune(j.getFortune()+montant);
        }
        else{
            throw new NoMoreMoney();
        }
    }
}
