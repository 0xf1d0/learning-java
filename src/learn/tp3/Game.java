package learn.tp3;

import java.util.Scanner;

/**
 * @author phindau
 * @since 18/01/2022, 23:00
 */
public class Game {
    public static void main(String[] args) {
        int draught = (int)(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Saisissez un entier entre 0 et 100: ");
            number = scanner.nextInt();
            if (number < draught) System.out.println("Plus grand !");
            else System.out.println("Plus petit !");
        }
        while (number != draught);
        System.out.println("Gagné !");
    }
}
