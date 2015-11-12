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
    
}
