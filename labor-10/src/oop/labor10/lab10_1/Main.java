package oop.labor10.lab10_1;

public class Main {
    public static void main(String[] args) {
        SortingDemo demo= new SortingDemo("fruits.txt");
        System.out.println("Eredeti sorrend:");
        demo.printFruits();
        System.out.println("Alphabetically sorted data");
        demo.sortAlphabetically();
        demo.printFruits();
        System.out.println("Alphabetically reverse sorted data");
        demo.sortReverseAlphabetically();
        demo.printFruits();

    }
}
