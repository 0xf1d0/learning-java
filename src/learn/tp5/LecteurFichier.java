package learn.tp5;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;

/**
 *
 * @author prodriguez
 */
public class LecteurFichier {
    private final StreamTokenizer input;
   
    /**
     * Choix du fichier à lire.
     *
     * @param name : le nom de fichier que ce lecteur de fichier permettra de lire
     * @throws IOException : envoie une erreur si l'accès au fichier pose un problème
     */
    public LecteurFichier(String name) throws IOException {
        this.input = new StreamTokenizer(new FileReader(name));
    }
   
    /**
     * Lecture du fichier.
     * 
     * @return un tableau de réel, ceux lus dans le fichier choisi
     * @throws IOException : envoie une erreur si l'accès au fichier pose un problème
     */
    public ArrayList<Double> lectureReels() throws IOException {
        ArrayList<Double> buffer = new ArrayList<Double>();
        this.input.nextToken();
        while (this.input.ttype != StreamTokenizer.TT_EOF) {
            buffer.add(this.input.nval);
            this.input.nextToken();
        }
        return buffer;
    }
}