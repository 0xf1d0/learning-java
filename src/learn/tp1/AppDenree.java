/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.tp1;

/**
 * Classe d'utilisation de Denrée.
 *
 * @author jviaud
 */
public class AppDenree {
    public static void main(String[] args) {
        Denree denree;
        denree = new Denree();
        denree.setNom("Pomme de Terre");
        denree.setPrixHT(2.0);
        System.out.print(denree);
        denree.setPrixHT(3.0);
        System.out.println(denree);
        denree.setPrixTTC(3.0);
        System.out.println(denree);
    }
}
