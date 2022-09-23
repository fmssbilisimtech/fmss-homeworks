package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
public class NumberUtilPow {
    static int pow(int a, int b){
        //a^b

        if (b<0){
            int total=1;
            for (int i=1;i<=b;i++){
                total*=a;
            }
            return total;
        }else

            return -1;

    }

    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a :");
        a = inp.nextInt();
        System.out.println("Enter b: ");
        b = inp.nextInt();
        System.out.println("a exponential b is equal to:"+ pow(a,b));
    }

}
