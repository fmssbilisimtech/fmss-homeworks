package JavaCourse.Week2.exercises;

import java.util.Scanner;
import java.util.Scanner;
public class combinationCalculationEx6 {
    public static void main(String[] args) {
        int n;
        int r;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n for the r combination of n:");
        n = inp.nextInt();
        System.out.println("Enter r for the r combination of n");
        r = inp.nextInt();
        //C(n,r) = n! / (r! * (n-r)!)
        int total=1;

        for (int i=1;i<=n;i++) {
            total = total * i;
            int totalr=1;
            for (int k=1;k<=r;r++){
                totalr=totalr*k;
                int d=n-r;
                int totald=1;
                for (int j=1;j<=d;j++){
                    totald=totald*j;
                }

            }
            System.out.println( totalr);
        }

    }
}
