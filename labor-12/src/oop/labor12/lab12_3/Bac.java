package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer,Student> students=new HashMap<>();
    private String [] subjects={"magyar","matek","roman"};

    public Bac(){
        readNames();
        for(String s:subjects){
            readSubject(s);
        }
    }

    private void readNames(){
        try(Scanner scanner=new Scanner(new File("nevek1.txt"))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String []array =line.split(" ");
                int id=Integer.parseInt(array[0].trim());
                students.put(id,new Student(id,array[1],array[2]));
            }
            System.out.println("Number of students: "+students.size());
        } catch (FileNotFoundException e) {
            System.out.println("A fajl nem letezik!");
            System.exit(1);
        }
    }

    private void readSubject(String subject){
        String filename=subject+".txt";
        try(Scanner scanner=new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] array=line.split(" ");
                int id=Integer.parseInt(array[0].trim());
                double mark=Double.parseDouble(array[1].trim());
                Student student=students.get(id);
                student.addMark(subject,mark);
                student.generateAvarage();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nincs ilyen allomany!");;
        }

    }

    public void printStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public void countSuccesful() {
        int count=0;
        for (Student student : students.values()) {
            if (student.getAverage()!=0){
                count++;
            }
        }
        System.out.println("Az erettsegit sikeresen teljesitok szama:"+count);
    }

}
