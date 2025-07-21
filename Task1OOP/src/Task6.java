public class Task6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("ACC123456");
        account.setBalance(1500.75);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}

// BankAccount class demonstrating encapsulation
class BankAccount {
    private String accountNumber;  // private field
    private double balance;        // private field

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
