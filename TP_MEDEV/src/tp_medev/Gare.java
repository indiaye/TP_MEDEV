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
public class Gare extends Achetable {
    
    private int coefGare;

    // Constructors
    
    /**
    * Constructeur de la classe Gare
    * @param nom    Nom
    * @param numero Numero
    * @param coefGare Coefficient de prix pour la gare
    */
    public Gare(int prix, Joueur proprietaire, String nom, int numero, int coefGare) {
        super(prix, proprietaire, nom, numero);
        this.coefGare = coefGare;
    }

    public int getCoefGare() {
        return coefGare;
    }

    public void setCoefGare(int coefGare) {
        this.coefGare = coefGare;
    }  
    
    
    /**
    * Affichage de la case Envoi Gare
    * @return Affichage de la case Gare
    */
    @Override
    public String toString() {
        return "Gare";
    }
    
    /**
     * Calcule le montant à payer en cas de passage.
     * Récupère le loyer en fonction du nombre d'habitations.
     * @return le montant désiré
     */
    public int calculerCout() {
        int montant = this.getCoefGare()*this.getProprietaire().nbGares();
        return montant;
    }

     public int calculLoyer(Joueur joueur) {
        int loyer;
        try {
            if ((this.getProprietaire() != null) && (!joueur.getNom().equals(this.getProprietaire().getNom())) ){
                loyer = proprietaire.nbGares() * 2500;
                                }
                }
catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        return loyer;

    }
}
