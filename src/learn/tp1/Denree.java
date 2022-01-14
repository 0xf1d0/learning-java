package learn.tp1;

/**
 * Modèle simple de denrée.
 *
 * @author jviaud
 */
public class Denree {
    /**
     * La TVA est de 20% pour tous.
     */
    private static final Double TAUX = 0.2;

    /**
     * Nom de la denrée.
     */
    private String nom;

    /**
     * Prix HT de la denrée.
     */
    private Double pouicpouic;

    /**
     * Accesseur du nom de la denrée.
     *
     * @return le nom de la denrée
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accesseur du prix de la denrée.
     *
     * @return le prix HT.
     */
    public Double getPrixHT() {
        return pouicpouic;
    }

    /**
     * Accesseur du prix de la denrée.
     *
     * @return le prix TTC.
     */
    public Double getPrixTTC() {
        return pouicpouic * (1 + TAUX);
    }

    /**
     * Mutateur du nom de la denrée.
     *
     * @param nom : nouveau nom.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mutateur du prix de la denrée.
     *
     * @param prix : nouveau prix HT.
     */
    public void setPrixHT(Double prix) {
        this.pouicpouic = prix;
    }

    /**
     * Mutateur du prix de la denrée.
     *
     * @param prix : nouveau prix TTC.
     */
    public void setPrixTTC(Double prix) {
        this.pouicpouic = prix / (1 + TAUX);
    }

    /**
     * Description textuelle de la denrée.
     *
     * @return texte relatif à la denrée.
     */
    @Override
    public String toString() {
        return "Denree{" + "nom=" + this.getNom() +
                ", prixHT=" + this.getPrixHT() +
                ", prixTTC=" + this.getPrixTTC() + '}';
    }    
}
