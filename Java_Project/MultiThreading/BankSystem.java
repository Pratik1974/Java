// Run this code

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("123456789");

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    BankTransaction deposit = new BankTransaction(account, "deposit", depositAmount);
                    deposit.start();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    BankTransaction withdraw = new BankTransaction(account, "withdraw", withdrawAmount);
                    withdraw.start();
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
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
