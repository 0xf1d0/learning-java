package learn.td5;

/**
 * @author phindau
 * @since 14/01/2022, 23:50
 */
public class ScoreManager {
    private final ScoreCollection scoreCollection;
    private final PlayerCollection playerCollection;

    /**
     * ScoreManager Constructor that init ScoreCollection and PlayerCollection
     * This class should be the one to instantiate to manage players and their scores
     */
    public ScoreManager() {
        this.scoreCollection = new ScoreCollection();
        this.playerCollection = new PlayerCollection();
    }

    /**
     * Get ScoreCollection
     *
     * @return ScoreCollection
     */
    public ScoreCollection getScoreCollection() {
        return this.scoreCollection;
    }

    /**
     * Get PlayerCollection
     *
     * @return PlayerCollection
     */
    public PlayerCollection getPlayerCollection() {
        return this.playerCollection;
    }

    /**
     * Stores into a new string a sentence which shows all the points earned by the players individually
     *
     * @return String of scores (dashboard)
     */
    public String displayScores() {
        StringBuilder dashboard = new StringBuilder();
        for (Player player : this.playerCollection.getGroup()) {
            int points = 0;
            for (Score score : this.scoreCollection.scoresOf(player.getNumber()))
                points += score.getResult();
            dashboard.append(player.getFirstname()).append(" ").
                    append(player.getLastname()).
                    append(" a obtenu ").
                    append(points).
                    append(" points\n");
        }
        return dashboard.toString();
    }

    /**
     * Creates a new ScoreCollection that stores the average score of each player
     *
     * @return ScoreCollection with all average scores
     */
    public ScoreCollection avgScores() {
        ScoreCollection newScoreCollection = new ScoreCollection();
        for (Player player : this.playerCollection.getGroup())
            newScoreCollection.add(new Score(player.getNumber(), (int) this.scoreCollection.avgScoreOf(player.getNumber())));
        return newScoreCollection;
    }

    /**
     * Add scores into ScoreCollection
     *
     * @param s Score[]
     */
    public void add(Score... s) {
        this.scoreCollection.add(s);
    }

    /**
     * Add players into PlayerCollection
     *
     * @param p Player[]
     */
    public void add(Player... p) {
        this.playerCollection.add(p);
    }
}
