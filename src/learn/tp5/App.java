package learn.tp5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author prodriguez
 */
public class App {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException : envoie une erreur si l'accès au fichier pose un problème
     */
    public static void main(String[] args) throws IOException {
        LecteurFichier monLecteur = new LecteurFichier("C:\\Users\\phindau\\OneDrive - Université de La Rochelle\\L1\\S2\\Informatique\\Java\\src\\learn\\tp5\\revenus.txt");
        ArrayList<Double> salaires = monLecteur.lectureReels();

        sort(salaires);

        System.out.println(salaires);
        System.out.println("Salaire Minimum : " + salaireMin(salaires));
        System.out.println("Salaire Maximum : " + salaireMax(salaires));
        System.out.println("Nombre total de salaires : " + salaires.size());
        System.out.println("Salaire moyen : " + salaireMoyen(salaires));
        System.out.println("Salaire médian : " + salaireMedian(salaires));
        ArrayList<String> lines = new ArrayList<String>();
        for (Double[] d : repartition(salaires, 5)) {
            lines.add(d[0] + " Salaires entre " + d[1] + "€ et " + d[2] + "€ " + "(" + Math.round(d[0] / salaires.size() * 100) + "%)");
        }
        new EnregistrementFichier(lines);

    }

    public static double salaireMin(ArrayList<Double> salaires) {
        return salaires.get(0);
    }

    public static double salaireMax(ArrayList<Double> salaires) {
        return salaires.get(salaires.size()-1);
    }

    public static double salaireMoyen(ArrayList<Double> salaires) {
        double sum = 0.0;
        for (double salaire : salaires)
            sum += salaire;
        return sum / salaires.size();
    }

    public static ArrayList<Double> sort(ArrayList<Double> salaires) {
        for (int x = 0; x < salaires.size() - 1; ++x) {
            int selected = x;
            for (int y = x + 1; y < salaires.size(); ++y) {
                if (salaires.get(y) < salaires.get(selected)) selected = y;
            }
            if (selected != x) {
                double share = salaires.set(x, salaires.get(selected));
                salaires.set(selected, share);
            }

        }
        return salaires;
    }

    public static ArrayList<Double[]> repartition(ArrayList<Double> salaires, int classes) {
        ArrayList<Double[]> repartition = new ArrayList<Double[]>();
        double step = (salaireMax(salaires) - salaireMin(salaires)) / classes;
        int j = 0;
        for (int i = 1; i <= classes; ++i) {
            double count = 0;
            double current = salaireMin(salaires) + step * i;
            while (j < salaires.size() && salaires.get(j) <= current) {
                count++;
                j++;
            }
            repartition.add(new Double[]{count, current - step, current});
        }
        return repartition;
    }

    public static double salaireMedian(ArrayList<Double> salaires) {
        int size = salaires.size();
        if (size % 2 == 0) {
            return (salaires.get(size / 2) + salaires.get(size / 2 - 1)) / 2;
        }
        return salaires.get(size / 2);
    }
}