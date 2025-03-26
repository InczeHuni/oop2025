package oop.labor05.Model;

import oop.labor02.lab2_3.Date;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Training {
    private Course course;
    private Date startDate;
    private Date endDate;
    private double price;
    private ArrayList<Student> enrolledStudents=new ArrayList<>();

    public Training(Course course, Date startDate, Date endDate, double price) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public int numEnrolled() {
        return enrolledStudents.size();
    }

    public Course getCourse() {
        return course;
    }

    public boolean enroll(Student student) {
        if (student == null || enrolledStudents.contains(student)) {
            return false;
        }
        enrolledStudents.add(student);
        return true;
    }

    public Student findStudentById(String ID) {
        for (Student student : enrolledStudents) {
            if (student.getID().equals(ID)) {
                return student;
            }
        }
        return null;
    }

    public void unEnroll(String ID) {
        enrolledStudents.removeIf(student -> student.getID().equals(ID));
    }

    public void printToFile() {
        String fileName = course.getName() + "_" + startDate + "_" + endDate + ".csv";
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student : enrolledStudents) {
                writer.write(student + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Training{\n");
        sb.append("course='").append(course).append("'\n");
        sb.append("startDate=").append(startDate).append("\n");
        sb.append("endDate=").append(endDate).append("\n");
        for (Student student : enrolledStudents) {
            sb.append(student).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
