package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class loopsEx4 {
    public static void main(String[] args) {
        //program that prints powers of 2 up to the entered number
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        n= inp.nextInt();
        /*for (int i =1;i<=n;i*=2){
            System.out.println(i);
        }*/
        for (int i=1; i<=n; i*=3){
            System.out.println(i);
        }
    }
}
