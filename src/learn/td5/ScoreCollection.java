package learn.td5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phindau
 * @since 14/01/2022, 23:11
 */
public class ScoreCollection {
    private final List<Score> results;

    /**
     * ScoreCollection Constructor to init
     */
    public ScoreCollection() {
        this.results = new ArrayList<>();
    }

    /**
     * Get Results
     *
     * @return results (Collection)
     */
    public List<Score> getResults() {
        return this.results;
    }

    /**
     * Get the best score from the Collection
     *
     * @return max (Score)
     */
    public Score bestScore() {
        Score max = this.results.get(0);
        for (Score score : this.results)
            if (score.getResult() > max.getResult()) max = score;
        return max;
    }

    /**
     * Get the best player
     *
     * @return best player's number (int)
     */
    public int bestPlayer() {
        return this.bestScore().getNumber();
    }

    /**
     * Get all the scores of specific player (referenced by number)
     *
     * @param n player's number
     * @return scores (Collection)
     */
    public List<Score> scoresOf(int n) {
        List<Score> scores = new ArrayList<>();
        for (Score score : this.results)
            if (score.getNumber() == n) scores.add(score);
        return scores;
    }

    /**
     * Get the average score of a specific player
     *
     * @param n player's number
     * @return score average (double)
     */
    public double avgScoreOf(int n) {
        double sum = 0.0;
        if (!this.scoresOf(n).isEmpty()) {
            List<Score> scores = this.scoresOf(n);
            for (Score score : scores)
                sum += score.getResult();
            return sum / scores.size();
        }
        return sum;
    }

    /**
     * Add scores to the Collection
     *
     * @param scores (Score[])
     */
    public void add(Score... scores) {
        this.results.addAll(List.of(scores));
    }
}
