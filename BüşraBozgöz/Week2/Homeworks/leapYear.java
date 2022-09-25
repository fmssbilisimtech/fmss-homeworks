package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
public class leapYear {
    //Sınıf çalışması: Parametresi ile aldığı int türden bir yıl değerine göre yılın artık yıl olup olmadığını
    //	test eden isLeapYear isimli metodu yazınız ve test ediniz

    static int isleapyear(int year){
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + "is a leap year !");
            } else {
                System.out.println(year + " is not a leap year !");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is a leap year !");
            } else {
                System.out.println(year + " is not a leap year !");
            }
        }
        return year;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int year;
        System.out.println("Enter a numer of the year:");
        year= inp.nextInt();
        System.out.println(isleapyear(year));

    }

}
