package tp_medev;

/**
 *
 * @author Groupe H
 */
public class Constructible extends Achetable {

    private boolean[] nbMaisons;
    private int a;
    private int b;
    private int coutMaison;
    private int coutHotel;
    private int[] loyers;
    private int posLoyer;

    /**
     * Attention le dernier paramétre est de la première case du tableau loyers
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
        for (int i = 0; i < 6; i++) {
            nbMaisons[i] = false;
        }
        this.a = a; //loyer avec une maison
        this.b = b; //loyer avec un hotel (il faut 4 maison avant)
        this.coutMaison = coutMaison;
        this.coutHotel = coutHotel;
        loyers[0] = loyerBase;
        remplirLoyer();
        posLoyer = 0;
    }

    /**
     * utilisé uniquement dans le constructeur
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
     *
     * @return
     */
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
    
    /**
     * Calcul du coût de construction
     * @return Cout de construction
     */
    @Override
    public int calculerCout() {
        return 0;
    }

    public int calculLoyer(Joueur joueur) {
        int loyer = 0;
        try {
            if ((this.getProprietaire() != null) && (!joueur.getNom().equals(this.getProprietaire().getNom()))) {
                loyer = this.loyers[posLoyer];
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        return loyer;

    }
    
    
}
