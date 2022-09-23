package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class exponentialCalculationEx7 {
    public static void main(String[] args) {
        int n;
        int r;
        //n^r
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n :");
        n = inp.nextInt();
        System.out.println("Enter r: ");
        r = inp.nextInt();
//3^5=3*3*3*3*3 r kadar döngü dönecek
        int total=1;
 /*     int i=1;
        while (i<=r){

            total*=n;
            i++;
        }
        System.out.println("Reponse:"+total);*/
        for (int i=1;i<=r;i++){
            total*=n;
        }
        System.out.println(total);
    }
}
