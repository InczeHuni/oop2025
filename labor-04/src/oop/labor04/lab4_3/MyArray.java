package oop.labor04.lab4_3;

import java.io.*;
import java.util.*;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(double[] array) {
        this.length = array.length;
        this.elements = Arrays.copyOf(array, array.length);
    }

    public MyArray(MyArray other) {
        this.length = other.length;
        this.elements = Arrays.copyOf(other.elements, other.length);
    }

    public MyArray(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            this.length = scanner.nextInt();
            this.elements = new double[length];
            for (int i = 0; i < length; i++) {
                elements[i] = scanner.nextDouble();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    public void fillRandom(double a, double b) {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            elements[i] = a + (b - a) * rand.nextDouble();
        }
    }

    public double mean() {
        double sum = 0;
        for (double num : elements) {
            sum += num;
        }
        return sum / length;
    }

    public double stddev() {
        double mean = mean();
        double sum = 0;
        for (double num : elements) {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / length);
    }


    public void sort() {
        Arrays.sort(elements);
    }


    public void print(String label) {
        System.out.print(label + ": ");
        for (double num : elements) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();
    }
}
