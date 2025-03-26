package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* BankAccount account1=new BankAccount();
        System.out.println(account1);
        BankAccount account2=new BankAccount();
        System.out.println(account2);*/
       /* ArrayList<Customer> customers=new ArrayList<>();
        customers.add( new Customer("Pozsonyi","Terike"));
        customers.add( new Customer("Pozsonyi","Terike"));
        customers.add( new Customer("Pozsonyi","Terike"));
        for(Customer customer:customers) {
            customer.addAccount(new BankAccount());
            System.out.println(customer);
        }*/

        Bank otpBank = new Bank("OTP");
        Customer customer1 = new Customer("John", "Doe");
        Customer customer2 = new Customer("Jane", "Smith");
        otpBank.addCustomer(customer1);
        otpBank.addCustomer(customer2);
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        customer2.addAccount(account3);
        customer2.addAccount(account4);
        System.out.println("Customer with ID 1:");
        System.out.println(otpBank.getCustomer(1));
        customer1.getAccount(account1.getAccountNumber()).deposit(1000);
        customer1.getAccount(account2.getAccountNumber()).deposit(1500);
        customer2.getAccount(account3.getAccountNumber()).deposit(2000);
        customer2.getAccount(account4.getAccountNumber()).deposit(2500);
        System.out.println("Customer with ID 2:");
        System.out.println(otpBank.getCustomer(2));
        otpBank.printCustomersToFile("bank_customers.csv");
    }


}
