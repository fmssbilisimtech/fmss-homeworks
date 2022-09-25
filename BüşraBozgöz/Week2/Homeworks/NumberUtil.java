package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
import java.util.Stack;

public class NumberUtil {
    //Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren getDigitsCount isimli
    //	metodu NumberUtil isimli bir sınıfın içerisinde yazınız ve klavyeden alınan değerlerle çağırarak
    //	test ediniz

    static int getDigitCount(int number){
        if (number==0){
            return 0;
        }else
            return number % 10 + getDigitCount(number / 10);

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;
        System.out.println("Enter a numer:");
        number= inp.nextInt();
        System.out.println("Digit sum is equl to:"+ getDigitCount(number));
    }
}
