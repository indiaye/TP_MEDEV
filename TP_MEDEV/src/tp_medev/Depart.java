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
public class Depart extends Case {
    
    // Constructors
    
    /**
    * Constructeur de la classe Depart
    * @param nom    Nom
    * @param numero Numero
    */
    public Depart(String nom, int numero) {
        super(nom, numero);
    }
    
    /**
    * Affichage de la case Depart
    * @return Affichage de la case Depart
    */
    @Override
    public String toString() {
        return "Depart"; 
    }
    
    /**
     * Méthode régissant le passage par la case départ.
     * Augmente la fortune d'un joueur de 400 €
     * @param j 
     */
    public void interagir(Joueur j){
        j.setFortune(j.getFortune() + 400);        
    }
}
