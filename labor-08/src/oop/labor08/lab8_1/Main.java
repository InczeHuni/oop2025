package oop.labor08.lab8_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("OTP");

        Customer customer1 = new Customer("Alice", "Smith");
        Customer customer2 = new Customer("Bob", "Johnson");

        SavingsAccount sa1 = new SavingsAccount(0.05);
        CheckingAccount ca1 = new CheckingAccount(300);

        SavingsAccount sa2 = new SavingsAccount(0.03);
        CheckingAccount ca2 = new CheckingAccount(200);

        sa1.deposit(1000);
        ca1.deposit(500);

        sa2.deposit(2000);
        ca2.deposit(700);

        customer1.addAccount(sa1);
        customer1.addAccount(ca1);

        customer2.addAccount(sa2);
        customer2.addAccount(ca2);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        System.out.println("Initial state:");
        System.out.println(customer1);
        System.out.println(customer2);


        sa1.addInterest();
        sa2.addInterest();

        System.out.println("After interest:");
        System.out.println(customer1);
        System.out.println(customer2);

        sa1.withdraw(150);
        ca1.withdraw(600);

        sa2.withdraw(100);
        ca2.withdraw(850);

        System.out.println("After withdrawals:");
        System.out.println(customer1);
        System.out.println(customer2);
        
        System.out.println("\nBank summary:");
        bank.printCustomersToStdout();
    }
}
