package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer("Pozsonyi","Ferike");
        customer1.addAccount(new BankAccount("BT1"));
        customer1.addAccount(new BankAccount("BT2"));
        customer1.addAccount(new BankAccount("BT3"));
        System.out.println(customer1);
        customer1.getAccount("BT1").deposit(1000);
        System.out.println(customer1);
        customer1.getAccount("BT2").deposit(1600);
        System.out.println(customer1);
        customer1.getAccount("BT3").deposit(120);
        System.out.println(customer1);
    }
}
