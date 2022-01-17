package learn.td5;

/**
 * @author phindau
 * @since 14/01/2022, 22:42
 */
public class AppScores {
    /**
     * Beginning of the program
     *
     * @param args Arguments passed while executing the app
     */
    public static void main(String[] args) {
        Player people1, people2;
        people1 = new Player(1, "WORLD", "Hello");
        people2 = new Player(2, "BAR", "FOO");

        Score score1, score2, score3, score4, score5, score6;
        score1 = new Score(1, 1235);
        score2 = new Score(2, 154);
        score3 = new Score(2, 1235);
        score4 = new Score(2, 154);
        score5 = new Score(1, 1235);
        score6 = new Score(1, 154);

        ScoreManager scoreManager;
        scoreManager = new ScoreManager();
        scoreManager.add(score1, score2, score3, score4, score5, score6);
        scoreManager.add(people1, people2);
        System.out.println(scoreManager.displayScores());
    }
}
