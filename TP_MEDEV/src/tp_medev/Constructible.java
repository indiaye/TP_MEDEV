
package tp_medev;

/**
 *
 * @author jvuil
 */
public class Constructible extends Achetable {

     private int a;
    private int b;
    private int coutMaison ;
    private int coutHotel;
    private int[] loyers;
    private int posLoyer;

    /**
     * 
     * @param a
     * @param b
     * @param coutMaison
     * @param coutHotel
     * @param loyerBase 
     * Attention le dernier paramétre est de la première case du tableau loyers
     * 
     * Attention SUPER A RAJOUTER !!!!!
     */
    public Constructible(int a, int b, int coutMaison, int coutHotel,int loyerBase) {
        this.a = a; //loyer avec une maison
        this.b = b; //loyer avec un hotel (il faut 4 maison avant)
        this.coutMaison = coutMaison;
        this.coutHotel = coutHotel;
        loyers[0]=loyerBase;
        remplirLoyer();
        posLoyer = 0;
    }
    
   
    /**
     * utilisé uniquement dans le constructeur
     */
    public void remplirLoyer(){
        for(int i=1;i<5;i++){
            loyers[i]=a*i;
        }
        loyers[5]+=b;
    }
    
    public void DemandeConstruction(){
        
    }
    /**
     * 
     * @return 
     */
    @Override
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
