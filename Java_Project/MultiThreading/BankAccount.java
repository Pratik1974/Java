public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
    }

    public synchronized double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
