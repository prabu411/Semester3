public abstract class Account {
    protected String accountName;
    protected int accountNumber;
    protected double balance;

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public abstract void displayAccountType();

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
