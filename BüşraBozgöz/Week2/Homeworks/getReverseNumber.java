package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
import java.util.Stack;
public class getReverseNumber {

    static int getReverse(int num){
        int reversed=0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num;
        System.out.println("Enter a numer:");
        num= inp.nextInt();
        System.out.println("Reversed Number: " + getReverse(num));
    }
}
