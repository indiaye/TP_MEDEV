/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author jvuil
 */
public class Constructible extends {

    public String toString() {

        String resultat = super.toString() + ", ";
        switch (posloyer) {
            case 0:
                resultat += "Pas de maison, ";
                break;
            case 1:
                resultat += "1 maison, " ;
                break ;
            case 5:
                resultat += "1 hotel, ";
                break;
            default:
                resultat += posloyer + " maisons, ";
        }
        
        resultat += "loyer = " ;
        resultat += this.loyer[posloyer];
        
        return resultat; 
    }

}
