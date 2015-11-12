/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author Groupe H
 */
public class Constructible extends Achetable {

<<<<<<< HEAD

=======
    private int a;
    private int b;
    private int coutMaison;
    private int coutHotel;
    private int[] loyers;
    private int posLoyer;

    /**
     * Constructeur de la classe Constructible
     *
     * @param loyerBase
     * @param a
     * @param b
     * @param coutMaison
     * @param coutHotel
     * @param prix
     * @param proprietaire
     * @param nom
     * @param numero
     */
    public Constructible(int loyerBase, int a, int b, int coutMaison, int coutHotel, int prix, Joueur proprietaire, String nom, int numero) {
        super(prix, proprietaire, nom, numero);
        this.a = a; //loyer avec une maison
        this.b = b; //loyer avec un hotel (il faut 4 maison avant)
        this.coutMaison = coutMaison;
        this.coutHotel = coutHotel;
        loyers[0] = loyerBase;
        remplirLoyer();
        posLoyer = 0;
    }

    /**
    * Utilisée uniquement dans le constructeur
    */
    public void remplirLoyer() {
        for (int i = 1; i < 5; i++) {
            loyers[i] = a * i;
        }
        loyers[5] += b;
    }

    public void DemandeConstruction() {

    }

    /**
    * Affichage de la classe Constructible
    * @return Affichage de la classe Constructible
    */
>>>>>>> origin/master
    @Override
    public String toString() {

        String resultat = super.toString() + ", ";
        switch (posLoyer) {
            case 0:
                resultat += "Pas de maison, ";
                break;
            case 1:
                resultat += "1 maison, ";
                break;
            case 5:
                resultat += "1 hotel, ";
                break;
            default:
                resultat += posLoyer + " maisons, ";
        }

        resultat += "loyer = ";
        resultat += this.loyers[posLoyer];

        return resultat;
    }

}
