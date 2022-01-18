package learn.tp2;

/**
 * @author phindau
 * @since 17/01/2022, 23:34
 */
public class Account {
    private final Integer number;
    private User principalUser, secondaryUser;
    private Double amount;

    /**
     * Account Constructor
     *
     * @param number of the account (Integer)
     */
    public Account(Integer number) {
        this.number = number;
        this.amount = 0.0;
    }

    /**
     * Account Constructor
     *
     * @param number of the account (Integer)
     * @param amount available (Double)
     * @param principalUser the main user (User)
     */
    public Account(Integer number, Double amount, User principalUser) {
        this.number = number;
        this.amount = amount;
        this.principalUser = principalUser;
    }

    /**
     * Get account's number
     *
     * @return number (int)
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Get the amount available
     *
     * @return amount (Double)
     */
    public Double show() {
        return this.amount;
    }

    /**
     * Get principal user
     *
     * @return principal user (User)
     */
    public User getPrincipalUser() {
        return this.principalUser;
    }

    /**
     * Get Secondary User
     *
     * @return secondary user (User)
     */
    public User getSecondaryUser() {
        return this.secondaryUser;
    }

    /**
     * Set the principal user
     *
     * @param pu (User)
     */
    public void setPrincipalUser(User pu) {
        this.principalUser = pu;
    }

    /**
     * Set the secondary user
     *
     * @param su (User)
     */
    public void setSecondaryUser(User su) {
        this.secondaryUser = su;
    }

    /**
     * Deposit money
     *
     * @param amount (Double)
     */
    public void deposit(Double amount) {
        this.amount += amount;
    }

    /**
     * Spend money
     *
     * @param amount (Double)
     * @return Double
     */
    public Double spend(Double amount) {
        this.amount -= amount;
        return amount;
    }

    /**
     * toString override
     *
     * @return String of class name including only number and amount available
     */
    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", amount=" + amount +
                '}';
    }
}
