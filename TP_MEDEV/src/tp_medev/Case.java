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
public abstract class Case {
    private String Nom;
    private int Numero;
    
    // Constructors

    public Case(String Nom, int Numero) {
        this.Nom = Nom;
        this.Numero = Numero;
    }
    
    // Getters

    public String getNom() {
        return Nom;
    }

    public int getNumero() {
        return Numero;
    }
    
    // Setters

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }    
    
    /**
     * @author jvuil
     * @return String de l'objet Case
     */
    public abstract String toString();
}
