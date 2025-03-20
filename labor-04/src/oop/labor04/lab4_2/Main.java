package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readCustomersFromCSV("lab4_2_input.csv");

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }


    public static ArrayList<Customer> readCustomersFromCSV(String filename) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            Customer currentCustomer = null;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                if (parts[0].equals("Customer")) {
                    currentCustomer = new Customer(parts[1], parts[2]);
                    customers.add(currentCustomer);
                } else if (parts[0].equals("Account") && currentCustomer != null) {
                    BankAccount account = new BankAccount(parts[1], Double.parseDouble(parts[2]));
                    currentCustomer.addAccount(account);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
