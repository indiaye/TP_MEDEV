/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *test
 * @author Hicham
 */
public class Chance extends Case {

    private int nb;

    // Constructors
    
    /**
     * Constructeur de la classe Case
     *
     * @param nom Nom
     * @param numero Numero
     */
    public Chance(String nom, int numero) {
        super(nom, numero);
    }
    
    /**
     * Get the value of nb
     *
     * @return the value of nb
     */
    public int getNb() {
        return nb;
    }

    /**
     * Set the value of nb
     *
     * @param nb new value of nb
     */
    public void setNb(int nb) {
        this.nb = nb;
    }

    /**
     * Affichage de la case Chance
     *
     * @return Affichage de la case Chance
     */
    @Override
    public String toString() {
        return "Chance";
    }
    
    @Override
    public void interagir(Joueur j) {
        
    }
}
