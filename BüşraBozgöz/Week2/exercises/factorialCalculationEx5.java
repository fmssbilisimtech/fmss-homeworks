package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class factorialCalculationEx5 {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        n= inp.nextInt();
        int total=1;
        for (int i=1;i<=n;i++){
            total=total*i;
        }
        System.out.println(total);
    }
}
