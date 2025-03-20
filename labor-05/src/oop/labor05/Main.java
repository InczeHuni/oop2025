package oop.labor05;

import oop.labor05.Model.Course;
import oop.labor05.Model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
