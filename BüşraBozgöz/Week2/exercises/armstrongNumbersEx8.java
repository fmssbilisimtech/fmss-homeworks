package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class armstrongNumbersEx8 {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number:");
        int number= inp.nextInt();

        int numberCounter=0;
        int digitsValue;
        int tempNumber=number;
        int digitPow;
        int result=0;

        while (tempNumber!=0){
            tempNumber/=10;
            numberCounter++;
        }
        tempNumber=number;
        System.out.println(numberCounter);


        while (tempNumber != 0) {
            digitsValue=tempNumber%10;

            digitPow=1;
            for (int i=1;i<=numberCounter;i++){
                digitPow*=digitsValue;
            }
            result+=digitPow;
            tempNumber/=10;


        }
        if(result==number){
            System.out.println("this number is amstron number:"+result);
        }else
            System.out.println("This is not amstron number");

    }
}
