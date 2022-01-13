package learn.td3;

import java.util.Scanner;

/**
 * @author phindau
 * @since 13/01/2022, 20:10
 */
public class Main {
    /**
     * Convert Deg to Radian
     *
     * @param deg double precision deg
     * @return double precision radian
     */
    public static double toRadian(double deg) {
        return deg * (Math.PI / 180);
    }

    /**
     * Convert Radian angle to Deg
     *
     * @param radian double precision radian
     * @return double precision deg
     */
    public static double toDeg(double radian) {
        return radian * (180 / Math.PI);
    }

    /**
     * This is the most powerful detection of leap year
     * according to this link
     * https://stackoverflow.com/questions/3220163/how-to-find-leap-year-programmatically-in-c/11595914#11595914
     *
     * @param year the year in int
     * @return true/false whether the year is leap or not (Bissextile in French)
     */
    public static boolean isLeap(int year) {
        return (year & 3) == 0 && (year % 25) != 0 || (year & 15) == 0;
    }

    /**
     * Start of the code
     * Answers of all the TD sheet
     *
     * @param args args provided while executing the program
     */
    public static void main(String[] args) {
        System.out.println(toDeg(Math.PI/2));
        System.out.println(toRadian(180));
        System.out.println(isLeap(7));

        Scanner s = new Scanner(System.in);
        System.out.println("Entrez le stock de produits disponibles :");
        int stock = s.nextInt();
        System.out.println("Consommation");
        while (stock > 0) {
            System.out.println("Combien de produits voulez-vous ?");
            int nbr = s.nextInt();
            StringBuilder remainMessage = new StringBuilder();
            if (nbr > stock)
                remainMessage.append("Impossible : ");
            else stock -= nbr;
            remainMessage.append("Il reste ").append(stock).append(" unités de produits");
            System.out.println(remainMessage);
        }
    }
}
