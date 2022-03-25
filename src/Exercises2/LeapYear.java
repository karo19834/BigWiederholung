package Exercises2;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1;
        while (year <= 2100) {
            isALeapYear(year);
            year++;
        }
        for ( int i=1; i<=2100;i++){
            isALeapYear(i);
        }


    }

    public static void isALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year. ");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
