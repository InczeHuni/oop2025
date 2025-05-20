package oop.labor12.lab12_3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String firstname,lastname;
    private Map<String,Double> marks=new HashMap<>();
    private double average;

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void addMark(String subject,double mark){
        marks.put(subject,mark);
    }

    public double getMark(String subject){
        return marks.getOrDefault(subject,0.0);
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {

        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", marks=" + marks +
                ", average=" + String.format("%.2f", average) +
                '}';
    }

    public void generateAvarage(){
        if (marks.isEmpty()) {
            average = 0.0;
            return;
        }
        double sum = 0.0;
        for (double mark : marks.values()) {
            if (mark < 5.0) {
                average = 0.0;
                return;
            }
            sum += mark;
        }

        double calculatedAverage = sum / marks.size();
        if (calculatedAverage >= 6.0) {
            average = calculatedAverage;
        } else {
            average = 0.0;
        }
    }

    public double getAverage() {
        return average;
    }
}
