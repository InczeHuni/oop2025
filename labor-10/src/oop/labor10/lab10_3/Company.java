package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees=new ArrayList<>();

    protected Company(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hire(Employee employee){
        employees.add(employee);
    }

    public void hireAll(String filename){
        try(Scanner scanner=new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] array =line.split(",");
                double salary=Double.parseDouble(array[2].trim());
                int year=Integer.parseInt(array[3].trim());
                int month=Integer.parseInt(array[4].trim());
                int day=Integer.parseInt(array[5].trim());
                MyDate date=new MyDate(year,month,day);
                if(array.length==6) {
                    Employee currentStudent = new Employee(array[0], array[1], salary, date);
                    hire(currentStudent);
                }
                else if(array.length==7){
                    String department=array[6];
                    Employee currentStudent = new Manager(array[0], array[1], salary, date,department);
                    hire(currentStudent);

                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void fire(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    public void printAll(PrintStream out) {
        employees.forEach(out::println);
    }

    public void printManagers(PrintStream out) {
        for (Employee e : employees) {
            if (e instanceof Manager) {
                System.out.println(e);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> comp) {
        employees.sort(comp);
    }

}
