package oop.labor02.lab2_3;


public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year,int month ,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        return "{" + year + " " + month + " " + day +"}";
    }
}