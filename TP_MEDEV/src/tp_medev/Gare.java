/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author Seb
 */
public class Gare extends Achetable {

    // Constructors
    
    /**
    * Constructeur de la classe Gare
    * @param nom    Nom
    * @param numero Numero
    */
    public Gare(int prix, Joueur proprietaire, String nom, int numero) {
        super(prix, proprietaire, nom, numero);
    }
    
    /**
    * Affichage de la case Envoi Gare
    * @return Affichage de la case Gare
    */
    @Override
    public String toString() {
        return "Gare";
    }

}
