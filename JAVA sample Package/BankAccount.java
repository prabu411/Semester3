public class BankAccount {

    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    public BankAccount(String holder, int number){
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("$" + amount + "deposited.");
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount >0 && balance >= amount){
            balance -= amount;
            System.out.println("$" + amount + "withdraw.");
        }
        else
        {
            System.out.println("$"+ amount + "withdraw .");
        }
    }

    public void showBalance(){
        System.out.println("Current balance : $" + balance);
    }
    
}
