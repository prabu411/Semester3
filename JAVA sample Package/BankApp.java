import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount("Prabu", 12345, 3.5);

        System.out.println("Welcome, " + account.accountHolder + "!");
        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Balance\n4. Add Interest\n5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    account.addInterest();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
