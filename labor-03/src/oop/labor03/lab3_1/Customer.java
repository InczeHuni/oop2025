package oop.labor03.lab3_1;

public class Customer {
    private String firstname;
    private  String lastname;
    private BankAccount account;

    public Customer(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public String toString(){
        return "Customer{"+firstname+" "+ lastname+" "+ account+"}";
    }

    public void setAccount(BankAccount account){
        this.account=account;

    }

    public void closeAccount(){
        this.account=null;
    }

    public BankAccount getAccount(){
        return account;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastnamename(String lastname){
        this.lastname=lastname;
    }
}
