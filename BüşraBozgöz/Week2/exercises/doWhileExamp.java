package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class doWhileExamp {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int pass;
        boolean askPassword=true;
        do{
            System.out.println("enter your password:");
            pass= inp.nextInt();
            if (pass==123){
                System.out.println("your password is true");
                askPassword=false;

            }else {
                System.out.println(("your password is false"));

            }
        }while (askPassword);
    }
}
