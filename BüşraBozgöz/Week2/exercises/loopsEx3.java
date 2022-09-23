package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class loopsEx3 {
 /*   public static void main(String[] args) {
        //A program that accepts input from the user until a negative value is entered and adds the odd
        // numbers from the entered values and prints it on the screen.
      int number;
        Scanner scan=new Scanner(System.in);
        int sum=0;
        do {
            System.out.println("enter a number:");
            number=scan.nextInt();
            if (number%2==1){
                sum+=number;

            }

        }while (number>0);
        System.out.println(sum);


    } */





    //A program that accepts input from the user until a single number is entered
    // and adds even and multiples of 4 from the entered values and prints it on the screen.

    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        int total=0;
        do {
            System.out.println("give me a number:");
            num= scan.nextInt();
            if (num%2==0 && num%4==0) {
                total += num;
            }
        }while (num>0);
            System.out.println(total);
    }
}

