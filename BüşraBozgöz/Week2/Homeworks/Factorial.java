package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
public class Factorial {
    static int factorial(int number){
        if(number>=0){

            int total=1;
            for (int i=1;i<=number;i++){
                total=total*i;
            }return total;
        }else
            return -1;
    }

    public static void main(String[] args) {
        int number;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        number= inp.nextInt();
        System.out.println("The factorial of the number you entered is equal to:"+factorial(number));
    }
}
