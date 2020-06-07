public class Customer {

    private Account account;
    private String name;
    private String lastName;
    private double balance = 0;
    private int id;

    public Customer(String name, String lastName, Account account){
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

    void transfer(Account accTran, double tranTo) {
        withdraw(tranTo);
        accTran.deposit(tranTo);
        System.out.println("Transfer complete");
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

