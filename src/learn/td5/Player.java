package learn.td5;

/**
 * @author phindau
 * @since 14/01/2022, 22:28
 */
public class Player {
    private final int number;
    private final String lastname;
    private final String firstname;

    /**
     * Player Constructor
     *
     * @param number number given
     * @param lastname the lastname
     * @param firstname the firstname
     */
    public Player(int number, String lastname, String firstname) {
        this.number = number;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    /**
     * Get the Player Number
     *
     * @return number (int)
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Get the Player lastname
     *
     * @return lastname (String)
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Get Player firstname
     *
     * @return firstname (String)
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * toString override
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
