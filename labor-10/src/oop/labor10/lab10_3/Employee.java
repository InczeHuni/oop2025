package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

public class Employee {
    private final int id;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthdate;
    private static int counter;

    public Employee(String firstName, String lastName, double salary, MyDate birthdate) {
        counter++;
        this.id=counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthdate = birthdate;

    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthdate() {
        return birthdate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}
