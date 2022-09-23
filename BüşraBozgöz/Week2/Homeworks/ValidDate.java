package JavaCourse.Week2.Homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ValidDate {

    // Returns true if given year is valid.
    static boolean isLeap(int year)
    {
        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }

    // Returns true if given year is valid or not.
    static boolean isValidDate(int d,
                               int m,
                               int y)
    {

        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        //February month with leap year
        if (m == 2)
        {
            if (isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }

        // Months of April, June,Sept and Nov must have number of days equal to 30.
        //Month of 01,03,5,7,8,10,10 must have number of days equal to 31
        if (m == 4 || m == 6 ||
                m == 9 || m == 11)
            return (d <= 30);

        return true;
    }

    public static void main(String[] args) {
        int day,month,year;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a date day:");
        day= inp.nextInt();
        System.out.println("Enter a date month:");
        month= inp.nextInt();
        System.out.println("Enter a date year:");
        year= inp.nextInt();
        System.out.println(isValidDate(day,month,year));


    }

}
