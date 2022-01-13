package learn.td4;

import java.util.Scanner;

/**
 * @author phindau
 * @since 13/01/2022, 22:17
 */
public class Main {
    /**
     * Start of the program ;) Answers of the TD4... Enjoy !
     *
     * @param args args passed in the command while executing the program
     */
    public static void main(String[] args) {
        int n = 1;
        for (int number : multiplesOf(7, 10)) {
            System.out.println("7 fois " + n + " = " + number);
            ++n;
        }

        System.out.println(bin(22));

        Scanner s = new Scanner(System.in);
        System.out.println("Give a number to iterate in the suite 'U'");
        int a = s.nextInt();
        System.out.println(U(a));

        System.out.println(S(5));

        System.out.println(newS(5));
    }

    /**
     * Get the multiplication table as array of a given number
     *
     * @param number Whatever number you want ;)
     * @param limit You have to provide a limit !
     * @return multiplication table as array
     */
    public static int[] multiplesOf(int number, int limit) {
        int[] table = new int[limit];
        for (int i = 0; i < limit; ++i)
            table[i] = number * (i+1);
        return table;
    }

    /**
     * Little recursive method ;-) enjoy ! -phindau
     *
     * @param n decimal number
     * @return binary conversion
     */
    public static String bin(int n) {
        if (n == 0) return "";
        return bin(n / 2) + n % 2;
    }

    /**
     * The recursive sequence
     *
     * @param n position
     * @return value at n position
     */
    public static int U(int n) {
        int result = 2;
        for (int i = 0; i < n; ++i)
            result = 3 * result - 25;
        return result;
    }

    /**
     * Sum of U(n) sequences
     *
     * @param n number of U suite
     * @return sum of these suites
     */
    public static int S(int n) {
        int sum = 0;
        for (int i = 0; i < n; ++i)
            sum += U(i);
        return sum;
    }

    /**
     * New Sum method
     *
     * @param n U(n) sequences
     * @return the sum of all these sequences
     */
    public static int newS(int n) {
        int sum = 0;
        for (int i = 0; i < n; ++i)
        {
            int result = 2;
            for (int j = 0; j < i; ++j)
                result = 3 * result - 25;
            sum += result;
        }
        return sum;
    }
}
