// BankAccountController.java

public class BankAccountController {
    public static void main(String[] args) {
        // Create a bank account with initial balance
        BankAccount account = new BankAccount("123456789", 500.00);

        // Handle transactions
        try {
            // Deposit money
            System.out.println("Balance before deposit: $" + account.getBalance());
            account.deposit(200);  // Valid deposit
            System.out.println("Balance after deposit: $" + account.getBalance());

            // Withdraw money
            System.out.println("Balance before withdrawal: $" + account.getBalance());
            account.withdraw(100);  // Valid withdrawal
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            // Withdraw more money than available to trigger InsufficientFundsException
            account.withdraw(700);  // Invalid withdrawal, InsufficientFundsException

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Always show final balance
            System.out.println("Final balance: $" + account.getBalance());
        }
    }
}
