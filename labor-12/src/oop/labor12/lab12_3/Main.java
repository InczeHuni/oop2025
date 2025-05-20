package oop.labor12.lab12_3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /* Student student=new Student(1,"Incze","Hunor");
        student.addMark("roman",8);
        student.addMark("matek",7.95);
        student.addMark("magyar",8);
        System.out.println(student);
        System.out.println("matek:"+student.getMark("matek"));*/
        Bac bacalaureat=new Bac();
        bacalaureat.printStudents();
        bacalaureat.countSuccesful();
    }
}
