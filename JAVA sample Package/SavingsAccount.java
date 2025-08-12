public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String holder, int number, double interestRate){
        super(holder, number);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of $" + interest + " added.");
    }
    
}
