package oop.labor08.lab8_1;

public class BankAccount {
    protected static final String PREFIX = "OTP";
    protected static final int ACCOUNT_NUMBER_LENGTH = 8;
    protected static int numAccounts = 0;

    protected String accountNumber;
    protected double balance;

    protected BankAccount() {
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }

    protected String createAccountNumber() {
        numAccounts++;
        return PREFIX + String.format("%0" + ACCOUNT_NUMBER_LENGTH + "d", numAccounts);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", Balance: " + balance;
    }
}
