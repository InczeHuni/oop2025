package oop.labor02.lab2_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String paccountNumber){
        accountNumber = paccountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String toString(){
        return "BankAccount{" + accountNumber + ", " + balance +"}";
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance +=amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        balance-=amount;
        return true;

    }
}
