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

    public Depart(String nom, int numero) {
        super(nom, numero);
    }
    
    @Override
    public String toString() {
        return "Depart"; 
    }   
}
