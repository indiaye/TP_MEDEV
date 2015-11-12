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
public class Prison extends Case {

    // Constructors

    /**
    * Constructeur de la classe Prison
    * @param nom    Nom
    * @param numero Numero
    */
    public Prison(String nom, int numero) {
        super(nom, numero);
    }
    
    /**
    * Affichage de la case Prison
    * @return Affichage de la case Prison
    */
    @Override
    public String toString() {
        return "Depart"; 
    }   
}
