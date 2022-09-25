package JavaCourse.Week1;

/* Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamını döngü
kullanmadan döndüren getDigitsSum metodunu yazınız. Metot sayının basamak sayısı kontrolünü yapmayacaktır
*/
import java.util.Scanner;
public class HomeworkGetDigitSum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp=new Scanner(System.in);
        System.out.println("3 basamakli bir sayinin yuzler basamagini giriniz:");
        a= inp.nextInt();
        System.out.println("3 basamakli bir sayinın onlar basamagini giriniz:");
        b= inp.nextInt();
        System.out.println("3 basamakli bir sayinin birler basamagini giriniz:");
        c= inp.nextInt();
        int girilenSayi;
        System.out.println(" Girilen Sayi: " + ((a*100)+(b*10)+c));
        int basamakToplami;
        basamakToplami=(c+b+a);
        System.out.println("Girilen sayinin basamak toplami:"+basamakToplami);





;


    }
}
