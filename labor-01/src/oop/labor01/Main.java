package oop.labor01;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //double x[] = {7, 1, -3, 45, 9};
        //System.out.printf("MAX: %6.2f\n", maxElement(x));
        System.out.println(getBit(13, 0));
        //System.out.println(countOneBits((byte)13));
        //double a[]={100,50};
        //System.out.println(secondLargest((a)));
        //double[] test1 = {};
        //System.out.println((computeMean(test1)));
        int size = 1_000_000;
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1_000_000);
        }
        Arrays.sort(numbers);
        int duplicateCount = 0;
        for (int i = 1; i < size; i++) {
            if (numbers[i] == numbers[i - 1]) {
                duplicateCount++;
            }
        }
        System.out.println("Duplak szama: " + duplicateCount);
    }

    public static double maxElement(double array[]) {
        if (array.length == 0) {
            System.out.println("The array is empty!");
            return 0;
        }
        double max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //sout system.out.print
    //main
    public static byte getBit(int number, int order){
        if(order > 31 || order < 0){
            return -1;
        }
        return (byte) ((number >> order) & 1);

    }
    public static int countOneBits(int number) {
        int count = 0;
        while (number>0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
    public static double secondLargest(double array[]) {
        if (array.length < 2) {
            return Double.NEGATIVE_INFINITY;
        }

        double first = Double.NEGATIVE_INFINITY;
        double second = Double.NEGATIVE_INFINITY;

        for (double num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return second;
    }
    public static double computeMean(double[] numbers) {
        if (numbers.length == 0) {
            return Double.NaN;
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}



