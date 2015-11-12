/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     *
     * @param plateau Liste des cases
     * @param joueurs Liste de joueurs
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
    public void initPlateau() {

    }

    /**
     * nbGares Prend en paramètre le Joueur, et retourne son nombre de gare
     * possédées
     *
     * @param j joueur
     * @return nombre de gares possédées
     */
    public int nbGares(Joueur j) {
        return j.nbGares();
    }

    public void affiche() {
        System.out.println("- Liste des cases : ");
        for (Case c : plateau) {
            System.out.println("   + " + c);
        }
        System.out.println("- Liste des joueurs : ");
        for (Joueur j : joueurs) {
            System.out.println("   + " + j);
        }
    }

    public Case avance(Case c, int d) {
        c.setNumero(d);
        return c;
    }

    /**
     * Lance le dé pour avancer Détermine une valeur aléatoire
     *
     * @return Une valeur de dé
     */
    public static int lanceLeDe() {
        return ((int) Math.floor(Math.random() * 6)) + 1;
    }

    /**
     * return true s'il n'y a plus qu'un joueur en jeu, false sinon
     *
     * @return
     */
    public boolean findePartie() {
        return joueurs.size() == 1;
    }

    public void tourDeJeu() {

    }

    public void init(String filename) {

        this.plateau = new ArrayList<>();
        this.joueurs = new LinkedList<>();
        try {
            Reader reader = new FileReader("src/tp_medev/" + filename);
            BufferedReader buf = new BufferedReader(reader);
            String line;
            try {
                line = buf.readLine();
                int indice = 0;
                while (line != null) {
                    String[] mots = line.split(" - ");
                    switch (indice) {
                        //Depart
                        case 0:
                            plateau.add(new Depart(mots[0], indice));
                            break;

                        //Chance    
                        case 2:
                        case 7:
                        case 12:
                        case 17:
                        case 20:
                        case 22:
                        case 28:
                        case 33:
                        case 36:
                            plateau.add(new Chance(mots[0], indice));
                            break;

                        //Impots
                        case 4:
                        case 38:
                            plateau.add(new Impot(mots[0], indice));
                            break;

                        //Gares
                        case 5:
                        case 15:
                        case 25:
                        case 35:
                            plateau.add(new Gare(Integer.parseInt(mots[1]), null, mots[0], indice, Integer.parseInt(mots[2])));
                            break;

                        //Prison
                        case 10:
                            plateau.add(new Prison(mots[0], indice));
                            break;

                        //Envoie Prison
                        case 30:
                            plateau.add(new EnvoiPrison(mots[0], indice));
                            break;

                            //Free Parking
                        default:
                            plateau.add(new Constructible(Integer.parseInt(mots[1]), Integer.parseInt(mots[2]), Integer.parseInt(mots[3]),
                                    Integer.parseInt(mots[4]), Integer.parseInt(mots[5]), Integer.parseInt(mots[6]), null, mots[0], indice));
                    }
                    line = buf.readLine();
                    indice++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Monopoly.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Monopoly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
