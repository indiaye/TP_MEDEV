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
public class EnvoiPrison extends Case {

    /**
    * Constructeur de la classe EnvoiPrison
    * @param nom          Nom
    * @param numero       Numero
    */
    public EnvoiPrison(String nom, int numero) {
        super(nom, numero);
    }
    
    /**
    * Affichage de la case Envoi Prison
    * @return Affichage de la case Envoi Prison
    */
    @Override
    public String toString() {
        return "Envoi Prison";
    }
}
