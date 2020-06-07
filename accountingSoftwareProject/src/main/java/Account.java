
public class Account {
    int id;
    double balance = 0;

    public Account(int id){this.id = id;}

    public void deposit(double money) {
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

    void transfer(Account accTran, double tranTo) {
        withdraw(tranTo);

        accTran.deposit(tranTo);
        System.out.println("Transfer complete");
    }
}
