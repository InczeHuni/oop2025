package oop.labor03.lab3_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String toString() {
        return "BankAccount{" + accountNumber + ", " + balance + "}";
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount>0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;

    }
}
