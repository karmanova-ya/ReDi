public class Main {
    public static void main(String[] args) {

        bankAccount.Account db = new bankAccount.Account(123);
        bankAccount.Account n26 = new bankAccount.Account(987);
        bankAccount.Customer yana = new bankAccount.Customer("Yana", "Karmanova", db);
        bankAccount.Customer stefan = new bankAccount.Customer("Stefan", "Kraus", n26);

        yana.getAccount().deposit(90);
        stefan.getAccount().deposit(70);

        yana.getAccount().withdraw(23);
        stefan.getAccount().withdraw(100);

        yana.getAccount().transfer(n26, 30);

        BankService bank = new BankService();

        bank.addPayment(new Payment(1, 5, Category.INCOME, 4, 2019));
        bank.addPayment(new Payment(2, -10.5, Category.CAFE, 4, 2019));
        bank.addPayment(new Payment(3, -4.5, Category.TRANSPORT, 4, 2019));
        bank.addPayment(new Payment(4, 33, Category.INCOME, 5, 2019));
        bank.addPayment(new Payment(5, 7, Category.INCOME, 5, 2019));
        bank.addPayment(new Payment(6, -5, Category.CAFE, 5, 2019));
        bank.addPayment(new Payment(7, 20, Category.INCOME, 4, 2020));
        bank.addPayment(new Payment(8, 3, Category.INCOME, 4, 2020));
        bank.addPayment(new Payment(9, -15, Category.TRANSPORT, 4, 2020));

        System.out.println(bank.biggestPayment());
        System.out.println(bank.totalIncome());
        bank.alphGrouping();
        bank.selectStatistics();
        bank.biggestIncome();
        bank.totalSpending();
        bank.totalSpendingByMonth();
    }
}
