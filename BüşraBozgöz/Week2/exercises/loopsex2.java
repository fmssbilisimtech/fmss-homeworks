package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class loopsex2 {
    public static void main(String[] args) {
        //Program that calculates the average of numbers
        // divisible by 3 and 4 from numbers from 0 to the number entered
        int number;
        System.out.println("Enter a number:");
        Scanner inp=new Scanner(System.in);
        number = inp.nextInt();

        int sum = 0;


        for (int i =0;i<=number;i++){
            if (i%4==0 && i%3==0 ) {
                sum +=i;

            }
        }
        System.out.println(sum);
    }
}
