package learn.tp2;

/**
 * @author phindau
 * @since 17/01/2022, 23:50
 */
public class AppTest {
    public static void main(String[] args) {
        Account account;
        account = new Account(125);


        /* First part of TP
        System.out.println(account.getNumber());
        account.deposit(145.2);
        System.out.println(account.show());
        account.spend(126.1);
        System.out.println(account.show());
        System.out.println(account);*/

        User user;
        user = new User("COUCOU");
        user.earn(1000.0);
        user.setPrincipalMainAccount(account);

        ATM.deposit(account, user, 300.0);
        System.out.println(user);

    }
}
