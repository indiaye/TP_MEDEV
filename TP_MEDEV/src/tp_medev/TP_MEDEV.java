/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author victo
 */
public class TP_MEDEV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PlateauDeJeu plateau = new PlateauDeJeu(null, null);
        plateau.chargerPlateau("Board.txt");
    // TODO code application logic here
    }
    
}
