package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstname;
    private String lastname;
    private BankAccount account;
    private int numAccounts;
    public static final int MAX_ACCOUNTS = 10;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstname + ' ' + lastname + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }

    public void addAccount(BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts] = account;
            numAccounts++;
        }

    }

    public void closeAccount() {
        this.account = null;
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber))
                return accounts[i];
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
}