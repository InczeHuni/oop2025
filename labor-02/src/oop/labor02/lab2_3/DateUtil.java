package oop.labor02.lab2_3;

public class DateUtil {
    public static boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0) || year%400==0) {
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(month>12 || day>31 || year==0 || (isLeapYear(year) && month==2 && day>29)){
            return false;
        }
        if(!isLeapYear(year)){
            if(month==2 && day>28){
                return false;
            }
        }
        return true;
    }
}
