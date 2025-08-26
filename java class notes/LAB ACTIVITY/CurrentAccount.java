public class CurrentAccount extends Account {
    public CurrentAccount(String accountName, int accountNumber) {
        super(accountName, accountNumber);
    }
    @Override
    public void displayAccountType() {
        System.out.println("Current Account");
    }
}
