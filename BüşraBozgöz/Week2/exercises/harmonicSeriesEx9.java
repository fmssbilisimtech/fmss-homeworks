package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class harmonicSeriesEx9 {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n :");
        n = inp.nextInt();
        double resoult=0;
        for (double i=1;i<=n;i++){
            resoult+=(1/i);
        }
        System.out.println(resoult);
        // int i double böldüğümüzde sonucu yanlış veriri i yi de double türünden tanımlamalıyız

    }
}
