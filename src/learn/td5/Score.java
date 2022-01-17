package learn.td5;

/**
 * @author vcohadon
 * @link vincent.cohadon@etudiant.univ-lr.fr
 * @since 14/01/2022, 23:08
 */
public class Score {
    private final int number;
    private final int result;

    /**
     * Score Constructor
     *
     * @param number (int)
     * @param result (int)
     */
    public Score(int number, int result) {
        this.number = number;
        this.result = result;
    }

    /**
     * Get Number
     *
     * @return number (int)
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Get Result
     *
     * @return result (int)
     */
    public int getResult() {
        return this.result;
    }
}
