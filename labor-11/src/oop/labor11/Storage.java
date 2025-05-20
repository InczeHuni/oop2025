package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    ArrayList<Product> products=new ArrayList<>();

    public Storage(String filename) {
        try(Scanner scanner=new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] array =line.split(" ");
                int id=Integer.parseInt(array[0].trim());
                String name=array[1].trim();
                int amount=Integer.parseInt(array[2].trim());
                int price=Integer.parseInt(array[3].trim());
                Product currentproduct=new Product(id,name,amount,price);
                products.add(currentproduct);
            }
            products.sort(Product::compareTo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public int update(String filename){
        int count=0;
        try(Scanner scanner=new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String array[] = line.split(" ");
                int id = Integer.parseInt(array[0].trim());
                int amount = Integer.parseInt(array[1].trim());
                int index = Collections.binarySearch(products, new Product(id, "", 0, 0));
                if (index >= 0) {
                    products.get(index).increaseAmount(amount);
                    count++;
                }
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void printProducts(){
        for (Product p:products){
            System.out.println(p);
        }
    }
}
