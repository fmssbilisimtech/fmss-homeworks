package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class loopsEx1 {
  /*  public static void main(String[] args) {
        // printing even numbers up to the entered number to the screen
        int number;
        System.out.println("Enter a number:");
        Scanner inp=new Scanner(System.in);
        number= inp.nextInt();

        int i=0;

        while (i<=number){
            i++;
            if(i%2==0){
                System.out.println(i);

            }
        }
    }*/

    public static void main(String[] args) {
        // printing even numbers up to the entered number to the screen
        int number;
        System.out.println("Enter a number:");
        Scanner inp=new Scanner(System.in);
        number= inp.nextInt();


        for(int i=1; i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
