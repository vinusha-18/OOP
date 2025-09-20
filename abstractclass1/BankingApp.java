package abstractclass1;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return 0; // No interest for Current Account
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SAV123", 10000);
        BankAccount current = new CurrentAccount("CUR456", 20000);

        savings.deposit(2000);
        savings.withdraw(5000);
        System.out.println("Savings Interest: " + savings.calculateInterest());

        current.deposit(3000);
        current.withdraw(25000); // should show insufficient
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}
