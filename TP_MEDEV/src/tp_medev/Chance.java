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
public class Chance extends Case {

    // Constructors
    
    /**
    * Constructeur de la classe Case
    * @param nom    Nom
    * @param numero Numero
    */
    public Chance(String nom, int numero) {
        super(nom, numero);
    }
    
    /**
    * Affichage de la case Chance
    * @return Affichage de la case Chance
    */
    @Override
    public String toString() {
        return "Chance";
    }
}
