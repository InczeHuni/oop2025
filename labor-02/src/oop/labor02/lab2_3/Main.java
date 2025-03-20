package oop.labor02.lab2_3;

import java.util.Random;

import oop.labor02.lab2_3.Date;
import oop.labor02.lab2_3.DateUtil;

public class Main {
    public static void main(String[] args) {
        Date[] dates= new Date[1000];
        Random rand = new Random();
        int nemjodb=0;
        for(int i=0;i< dates.length;++i){
            int year=rand.nextInt(2026);
            int month=1+rand.nextInt(12);
            int day= 1+rand.nextInt(31);
            dates[i] = new Date(year,month,day);
            if(DateUtil.isValidDate(year,month,day)) {
                System.out.println("Date{" + "year:" + dates[i].getYear() +
                        " month:" + dates[i].getMonth() +
                        " day:" + dates[i].getDay() +
                        "}");
            }
            else{
                nemjodb++;
            }
        }
        System.out.println("Nem jo datumok szama:"+nemjodb);
        System.out.println(dates[5]);

    }
}
