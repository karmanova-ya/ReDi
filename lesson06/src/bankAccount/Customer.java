package bankAccount;

public class Customer {

    private Account account;
    String name;
    String lastName;
    int id;
    double balance = 0;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer(String name, String lastName, Account account) {
        this.name = name;
        this.lastName = lastName;
        this.account = account;
    }

    void deposit(double money) {
        balance += money;
        System.out.print("+ " + money);
        System.out.println(" = " + balance);
    }

    void withdraw(double money) {
        System.out.print(" -" + money);
        if (money <= balance) {
            balance -= money;
            System.out.println(" = " + balance);
        } else {
            System.out.print(" You don't have enough money on your balance :(");
            System.out.println(" = " + balance);
        }
    }

    void transfer(bankAccount.Account accTran, double tranTo) {
        withdraw(tranTo);

        accTran.deposit(tranTo);
        System.out.println("Transfer complete");
    }
}
