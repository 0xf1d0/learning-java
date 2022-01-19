package learn.tp3;

import java.util.Scanner;

/**
 * @author vcohadon
 * @link vincent.cohadon@etudiant.univ-lr.fr
 * @since 19/01/2022, 11:27
 */
public class App {
    public static void main(String[] args) {
        /*Panel p = new Panel();
        System.out.println(p);

        p.switcher(1);
        System.out.println(p);*/

        Panel p = new Panel();
        Scanner s = new Scanner(System.in);
        while (!p.areTurnedOn()) {
            System.out.println("Etat du panneau : " + p);
            System.out.println("Interrupteur à actionner : ");
            short switchValue = s.nextShort();
            p.switcher(switchValue);
        }
        System.out.println("Gagné !");
    }
}
