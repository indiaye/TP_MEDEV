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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jvuil
 */
public class Monopoly {

    public static PlateauDeJeu chargerPlateau(String filename) {

        ArrayList<Case> plateau = new ArrayList<>();
        LinkedList<Joueur> joueurs = new LinkedList<>();

        try {
            Reader reader = new FileReader(filename);
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
                        case 17:
                        case 22:
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
                            plateau.add(new Gare(Integer.parseInt(mots[1]), null, mots[0], indice));
                            break;

                        //Prison
                        case 10:
                            plateau.add(new Prison(mots[0], indice));
                            break;

                        //Envoie Prison
                        case 30:
                            plateau.add(new EnvoiPrison(mots[0], indice));
                            break;

                        default:
                            plateau.add(new Constructible(Integer.parseInt(mots[2]), Integer.parseInt(mots[3]), Integer.parseInt(mots[4]),
                                    Integer.parseInt(mots[5]), Integer.parseInt(mots[6]), Integer.parseInt(mots[6]), null, mots[0], indice));
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Monopoly.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Monopoly.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new PlateauDeJeu(plateau, joueurs);

    }
}
