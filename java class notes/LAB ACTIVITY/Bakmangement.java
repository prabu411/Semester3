/*Bank management system
account type account name and accno with different class withdraw and deposit functionality */
import java.util.Scanner;
class BankManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Type (Savings/Current): ");
        String accountType = scanner.nextLine();

        System.out.println("Enter Account Name: ");
        String accountName = scanner.nextLine();

        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        int accNum;
        try {
            accNum = Integer.parseInt(accountNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid account number format");
            scanner.close();
            return;
        }
        Account account;
        if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accountName, accNum);
        } else if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(accountName, accNum);
        } else {
            System.out.println("Invalid Account Type");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


