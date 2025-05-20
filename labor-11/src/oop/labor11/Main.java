package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Storage storage=new Storage("data10.txt");
        //storage.update("update10.txt");
        for(int i=10;i<10000000;i*=10){
            String datafilename="data"+i+".txt";
            for(int j=10;j<=10000000;j*=10){
                String updatefilename="update"+j+".txt";
                if(checkFile(datafilename)&& checkFile(updatefilename)) {
                    System.out.println("Data:"+datafilename + " Update:" + updatefilename+" Time:"+doIt(datafilename,updatefilename));
                }
            }
        }
        //storage.printProducts();
    }

    private static boolean checkFile(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    private static long doIt(String datafile,String updatefile){
        long startMilli=System.currentTimeMillis();
        Storage storage=new Storage(datafile);
        storage.update(updatefile);
        long stopMilli=System.currentTimeMillis();
        return (stopMilli-startMilli)%1000;

    }
}
