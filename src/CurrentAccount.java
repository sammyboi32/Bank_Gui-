import java.util.Scanner;
// This is the current account

public class CurrentAccount {
    private double balance;

    public CurrentAccount() {
        balance = 100000;
    }

    // This is for the deposit
    public void deposit(double amount) {
        balance += amount;
    }

   // This is for the withdrawal
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Funds!");
        }
    }
    // Shows how much you have left
    
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrentAccount bank = new CurrentAccount();

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be deposited: ");
                    int depositAmount = scanner.nextInt();
                    bank.deposit(depositAmount);
                    System.out.println("Deposited successfully.");
                    break;

                case 2:
                    System.out.print("Enter the amount for withdrawal: ");
                    int withdrawAmount = scanner.nextInt();
                    bank.withdraw(withdrawAmount);
                    System.out.println("Withdrawn successfully.");
                    break;

                case 3:
                    bank.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for accepting our service. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid action. Please try again.");
            }

            System.out.println();
        }
    }
}
