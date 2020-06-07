package bankAccount;

public class Main {
    public static void main(String[] args) {

        bankAccount.Account db = new bankAccount.Account(123);
        bankAccount.Account n26 = new bankAccount.Account(987);
        bankAccount.Customer yana = new bankAccount.Customer("Yana", "Karmanova", db);
        bankAccount.Customer ira = new bankAccount.Customer("Irina", "Rykunova", n26);

        yana.getAccount().deposit(90);
        ira.getAccount().deposit(70);

        yana.getAccount().withdraw(23);
        ira.getAccount().withdraw(100);

        yana.getAccount().transfer(n26, 30);
    }
}
