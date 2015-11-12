/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

import java.util.*;

/**
 *
 * @author Hicham
 */
public class PlateauDeJeu {
    
    private ArrayList<Case> plateau;
    private LinkedList<Joueur> joueurs;
    
    // Constructors

    /**
    * Constructeur de la classe Case
    * @param plateu    Liste des cases
    * @param joueurs   Liste de joueurs
    */
    public PlateauDeJeu(ArrayList<Case> plateau, LinkedList<Joueur> joueurs) {
        this.plateau = plateau;
        this.joueurs = joueurs;
    }
    
    // Setters

    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }

    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    
    // Getters

    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    public LinkedList<Joueur> getJoueurs() {
        return joueurs;
    }
    
    // Autres méthodes A COMPLETER ET COMMENTER
    
    public void initPlateau(){
        
    }
    
    /**
     * Prend en paramètre le Joueur, et retourne son nombre de gare possédées
     * @param j joueur
     * @return nombre de gares possédées
     */
    public int nbGares(Joueur j){
        return j.nbGares();
    }

    public void affiche(){
        System.out.println("- Liste des cases : ");
        for (Case c: plateau){
            System.out.println("   + " + c.toString());
        }
        System.out.println("- Liste des joueurs : ");
        for (Joueur j:joueurs){
            System.out.println("   + " + j.toString());
        }
    }
    
    public void avance(Case c, int d){

    }
    
    // Lance le dé pour avancer

    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random() * 6)) + 1;
    }
    
    /**
     * return true s'il n'y a plus qu'un joueur en jeu, false sinon
     * @return 
     */
    public boolean findePartie(){
        return joueurs.size()==1;
    }
    
    public void tourDeJeu(){
        
    }
    
}
