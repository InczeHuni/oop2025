package oop.labor08.lab8_1;

import java.util.ArrayList;

public class Customer {
    private static int numCustomers;
    private String firstname;
    private String lastname;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private final int id;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        numCustomers++;
        id=numCustomers;
    }


    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstname + ' ' + lastname + ' '+  id + " accounts:\n");
        for (BankAccount account: accounts) {
            result.append("\t"+ account.toString() + "\n");
        }
        return result.toString();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);

    }

    public void closeAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastnamename(String lastname) {
        this.lastname = lastname;
    }

    public int getNumAccounts() {
        return this.accounts.size();
    }

    public int getId() {
        return id;
    }

    public ArrayList getAccountNumbers(){
        ArrayList <String > accountNumbers = new ArrayList<>();
        for(BankAccount account:accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }
}
