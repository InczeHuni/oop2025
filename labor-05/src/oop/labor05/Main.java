package oop.labor05;

import oop.labor05.Model.Course;
import oop.labor05.Model.Student;
import oop.labor05.Model.Training;
import oop.labor02.lab2_3.Date;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for(Course c: courses){
            System.out.println(c);
        }
        System.out.println();

        ArrayList<Student> students = readStudents("student.csv");
        for(Student c: students){
            System.out.println(c);
        }
        Random rand = new Random();
        ArrayList<Training> trainings = new ArrayList<>();
        Date startDate = new Date(2023, 3, 21);
        Date endDate = new Date(2023, 3, 25);
        for (Course course : courses) {
            double price = 1000 + rand.nextDouble() * 1000;
            Training training = new Training(course, startDate, endDate, price);
            ArrayList<Student> enrolledStudents = new ArrayList<>();
            while (enrolledStudents.size() < 10) {
                int randomIndex = rand.nextInt(students.size());
                Student student = students.get(randomIndex);
                if (!enrolledStudents.contains(student)) {
                    training.enroll(student);
                    enrolledStudents.add(student);
                }
            }
            training.printToFile();
            trainings.add(training);
        }

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
            for (Training training : trainings) {
                if (training.findStudentById(student.getID()) != null) {
                    System.out.println(training.getCourse().getName() + ", " + training.getCourse().getDescription());
                }
            }
            System.out.println();
        }
        for(Training training:trainings)
            System.out.println(training);
    }

    private static ArrayList<Course>readCourses(String filename){
        ArrayList<Course> courses=new ArrayList<>();
        try(Scanner scanner= new Scanner(new File(filename))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] array =line.split(",");
                int numHours=Integer.parseInt(array[2].trim());
                Course currentCourse = new Course(array[0].trim(),array[1].trim(),numHours);
                courses.add(currentCourse);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student>readStudents(String filename){
        ArrayList<Student> students=new ArrayList<>();
        try(Scanner scanner= new Scanner(new File(filename))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] array =line.split(",");
                Student currentStudent = new Student(array[0],array[1],array[2]);
                students.add(currentStudent);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }

}
