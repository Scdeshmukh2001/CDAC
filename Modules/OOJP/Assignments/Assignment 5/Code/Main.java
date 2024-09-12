class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Minimum balance of $" + MIN_BALANCE + " required!");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount ba = new BankAccount("BA1234", 500);
        ba.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + ba.getBalance());
        ba.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + ba.getBalance());

        System.out.println("\nCreate a Savings Account object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount sa = new SavingsAccount("SA1234", 450);
        sa.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + sa.getBalance());
        sa.withdraw(200);
        System.out.println("Balance after trying to withdraw $200: $" + sa.getBalance());
    }
}
