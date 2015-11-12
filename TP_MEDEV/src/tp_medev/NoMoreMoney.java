/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_medev;

/**
 *
 * @author Olivier
 */
class NoMoreMoney extends Exception {
    public NoMoreMoney() {
        super("Vous n'avez pas assez d'argent !");
    }
}
