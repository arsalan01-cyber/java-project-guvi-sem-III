// BankAccount.java

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdrawal Method
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this transaction.");
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }

    // Check balance
    public double getBalance() {
        return balance;
    }

    // Account details
    public String getAccountNumber() {
        return accountNumber;
    }
}
