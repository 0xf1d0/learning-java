package learn.tp2;

/**
 * @author phindau
 * @since 17/01/2022, 23:37
 * All the methods described here can be called statically, so that we avoid instantiate this class.
 */
public class ATM {
    /**
     * Transfer the amount of money from source to target
     *
     * @param source (Account)
     * @param target (Account)
     * @param amount (Double)
     */
    public static void transfer(Account source, Account target, Double amount) {
        target.deposit(source.spend(amount));
    }

    /**
     * Transfer the amount of money from source's main account to target's main account
     *
     * @param source (User)
     * @param target (User)
     * @param amount (Double)
     */
    public static void transfer(User source, User target, Double amount) {
        target.getMain().deposit(source.getMain().spend(amount));
    }

    /**
     * Transfer the amount of money from user's savings to his main account
     *
     * @param user (User)
     * @param amount (Double)
     */
    public static void transfer(User user, Double amount) {
        user.getMain().deposit(user.getSavings().spend(amount));
    }

    /**
     * Transfer the amount of money from user's main account to his savings account
     *
     * @param user (User)
     * @param amount (Double)
     */
    public static void transferToSavings(User user, Double amount) {
        user.getSavings().deposit(user.getMain().spend(amount));
    }

    /**
     * Convert the amount of money located in source to cash for target
     *
     * @param source (Account)
     * @param target (User)
     * @param amount (Double)
     */
    public static void withdrawal(Account source, User target, Double amount) {
        target.earn(source.spend(amount));
    }

    /**
     * Convert the amount of money located in user's main account to cash
     *
     * @param user (User)
     * @param amount (Double)
     */
    public static void withdrawal(User user, Double amount) {
        user.earn(user.getMain().spend(amount));
    }

    /**
     * Deposit the amount of user's cash to account
     *
     * @param account (Account)
     * @param user (User)
     * @param amount (Double)
     */
    public static void deposit(Account account, User user, Double amount) {
        account.deposit(user.spend(amount));
    }

    /**
     * Deposit the amount of user's cash to his main account
     *
     * @param user (User)
     * @param amount (Double)
     */
    public static void deposit(User user, Double amount) {
        user.getMain().deposit(user.spend(amount));
    }
}
