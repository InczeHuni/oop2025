package oop.labor06.lab6_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int customerId) {
        for (Customer customer : customers) {
            if ( customerId == customer.getId()) {
                return customer;
            }
        }
        return null;
    }

    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ) {
            ps.println( customer.getId()+", " + customer.getFirstname() + ", "+
                    customer.getLastname()+", "+customer.getNumAccounts());
        }
    }

    public void printCustomersToStdout() {
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ) {
        try (PrintStream out = new PrintStream(filename)) {
            printCustomers(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public int numCustomers(){
        return this.customers.size();
    }


}
