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

    public EnvoiPrison(String nom, int numero) {
        super(nom, numero);
    }
    
    @Override
    public String toString() {
        return "Envoi Prison";
    }
    
    /**
     * Envoie un joueur en prison.
     * L'affecte à la case prison, et rend le booléen emprisonne "vrai".
     * A COMPLETER/VERIFIER
     * @param j le joueur concerné 
     */
    public void interagir(Joueur j){
        j.setEmprisonne(true);
        
    }
}
