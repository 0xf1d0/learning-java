package learn.tp2;

/**
 * @author phindau
 * @since 17/01/2022, 23:35
 */
public class User {
    private final String name;
    private Account main;
    private Account savings;
    private Double cash;

    /**
     * User Constructor
     *
     * @param name (string)
     */
    public User(String name) {
        this.name = name;
        this.cash = 0.0;
    }

    /**
     * Get main account
     *
     * @return Account
     */
    public Account getMain() {
        return this.main;
    }

    /**
     * Get savings account
     *
     * @return Account
     */
    public Account getSavings() {
        return this.savings;
    }

    /**
     * Set this user as principal to the account and set this account as main one
     *
     * @param a Account
     */
    public void setPrincipalMainAccount(Account a) {
        a.setPrincipalUser(this);
        this.main = a;
    }

    /**
     * Set this user as secondary to the account and set this account as main one
     *
     * @param a Account
     */
    public void setSecondaryMainAccount(Account a) {
        a.setSecondaryUser(this);
        this.main = a;
    }

    /**
     * Set this user as principal to the account and set this account as savings one
     *
     * @param a Account
     */
    public void setPrincipalSavingsAccount(Account a) {
        a.setPrincipalUser(this);
        this.savings = a;
    }

    /**
     * Set this user as secondary to the account and set this account as savings one
     *
     * @param a Account
     */
    public void setSecondarySavingsAccount(Account a) {
        a.setSecondaryUser(this);
        this.savings = a;
    }

    /**
     * Earn some cash
     *
     * @param amount (Double)
     */
    public void earn(Double amount) {
        this.cash += amount;
    }

    /**
     * Spend some cash
     *
     * @param amount (Double)
     * @return Double
     */
    public Double spend(Double amount) {
        this.cash -= amount;
        return amount;
    }

    /**
     * toString override
     *
     * @return String of User with following fields
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", main=" + main +
                ", savings=" + savings +
                ", cash=" + cash +
                '}';
    }
}
