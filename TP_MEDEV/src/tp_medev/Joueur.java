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
    private int nbToursAtt;
    
    // Constructors

    /**
    * Constructeur de la classe Joueur
    * @param nom        Nom
    * @param fortune    Fortune
    * @param position   Position
    * @param possession Liste des possessions
    * @param emprisonne Statut de liberte
    * @param nbToursAtt Nombre de tours de prison restans
    * @param numero     Numero
    */
    public Joueur(String nom, int fortune, Case position, ArrayList<Achetable> possession, boolean emprisonne, int nbToursAtt) {
        this.nom = nom;
        this.fortune = fortune;
        this.position = position;
        this.possession = possession;
        this.emprisonne = emprisonne;
        this.nbToursAtt = nbToursAtt;
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
        return nbToursAtt;
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

    public void setNbToursAtt(int nbToursAtt) {
        this.nbToursAtt = nbToursAtt;
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
            j.setFortune(j.getFortune()+this.getFortune()); // le joueur donne tout ce qu'il lui reste !!
            this.fortune = 0;  // le joueur perdant passe à 0
            throw new NoMoreMoney(); // exception lancée (veut dire qu'il est en bankrupt)
        }
    }
    
    // Not tested yet. manque case.getnom et achetable.tostring(gare et constructible) PAUSE CLOPE
    public String toString(){
        String res="";
        res="Nom : "+nom+"\n"
                +"Fortune : "+fortune+"\n";
        for (Achetable a:possession){
            res=res+a.toString();
        }
        res=res+"\n"+"Position : "+position.getNom();    
    }
    
    /**
    * prend en paramètre le plateau de jeu, est appelée par le Joueur
    * avance d'une position, vérifie si on est passé par la case départ (dans ce cas + 20000€)
    * et on appelle la fonction interagir de la nouvelle case
    * la position du joueur est modifiée
    */
    public void avance(PlateauDeJeu p) throws NoMoreMoney {
        int d = PlateauDeJeu.lanceLeDe(); // résultat du lancé de dé
        if(p.avance(this.position, d).getNumero() < this.position.getNumero()) {// on est passé par la case départ
            this.setFortune(this.getFortune()+20000); // on lui rajoute 20 000 €
        }
        this.position = p.avance(position, d);
        System.out.println("Le joueur "+this.getNom()+" est en "+this.position.getNom());
        this.position.interagir(this);
    }
}
