public class SavingsAccount extends Account {
    public SavingsAccount(String accountName, int accountNumber) {
        super(accountName, accountNumber);
    }
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}
