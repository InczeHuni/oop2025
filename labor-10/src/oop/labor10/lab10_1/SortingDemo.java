package oop.labor10.lab10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortingDemo {
    List<String> fruits=new ArrayList<>();

    public SortingDemo(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                fruits.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printFruits(){
        for(String fruit:fruits){
            System.out.print(fruit+" ");
        }
        System.out.println();
    }

    public void sortAlphabetically(){
        Collections.sort(fruits);
    }

    public void sortReverseAlphabetically(){
        Collections.sort(fruits,new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        /*Collections.sort(fruits,(o1,o2)->{
            return o2.compareTo(o1);
        });*/
    }
}
