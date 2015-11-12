/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author Hicham
 */
public class Impot extends Case {
    
    // Constructors
    
    /**
    * Constructeur de la classe Impot
    * @param nom    Nom
    * @param numero Numero
    */
    public Impot(String nom, int numero) {
        super(nom, numero);
    }
    
    /**
    * Affichage de la case Envoi Gare
    * @return Affichage de la case Gare
    */
    @Override
    public String toString() {
        return "Impot";
    }
}
