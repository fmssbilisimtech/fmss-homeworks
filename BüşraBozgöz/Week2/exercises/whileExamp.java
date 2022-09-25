package JavaCourse.Week2.exercises;

import java.util.Scanner;
public class whileExamp {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSucces = true;

        Scanner inp=new Scanner(System.in);
        while (!isPasswordSucces){
            System.out.println("enter your password:");
            password= inp.nextInt();
            if (password == 123) {
                System.out.println("your password iss true");
                isPasswordSucces=false;

            }else {
                System.out.println("your password is false ! TRT AGAIN");
            }
        }
    }
}
