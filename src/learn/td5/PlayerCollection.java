package learn.td5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phindau
 * @since 14/01/2022, 22:39
 */
public class PlayerCollection {
    private final List<Player> group;

    /**
     * PlayerCollection Constructor to init
     */
    public PlayerCollection() {
        this.group = new ArrayList<>();
    }

    /**
     * Get the Collection
     *
     * @return list of players
     */
    public List<Player> getGroup() {
        return this.group;
    }

    /**
     * Get Player considering his number
     *
     * @param n number (int)
     * @return player (Player)
     */
    public Player getPlayerWithNumber(int n) {
        for (Player player : this.group)
            if (player.getNumber() == n) return player;
        return null;
    }

    /**
     * Get Player considering his name
     *
     * @param name (String)
     * @return player (Player)
     */
    public Player getPlayerWithName(String name) {
        for (Player player : this.group)
            if (player.getLastname().equals(name)) return player;
        return null;
    }

    /**
     * Add some players to the group Collection
     *
     * @param players (Player[])
     */
    public void add(Player... players) {
        this.group.addAll(List.of(players));
    }
}
