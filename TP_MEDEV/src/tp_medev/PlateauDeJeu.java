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
    
    public void nbGare(Joueur j){
        
    }
    
    public void affiche(){
        
    }
    
    public void avance(Case c, int d){

    }
    
    // Lance le dé pour avancer

    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random() * 6)) + 1;
    }
    
    public void finDePartie(){
        
    }
    
    public void tourDeJeu(){
        
    }
    
}
