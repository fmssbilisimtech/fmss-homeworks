package backend.firstweek;

import java.util.ArrayList;

public class Digit {
    public static int getDigitSum(int x){
        //Sınıf Çalışması: Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamını döngü
        //kullanmadan döndüren getDigitsSum metodunu yazınız. Metot sayının basamak sayısı kontrolünü yapmayacaktır
        if(x/10 == 0)
            return x;
        else {
            return x%10 + getDigitSum(x/10);
        }
    }

    public static ArrayList<Double> getRadicals(int a, int b, int c){
        double discriminant = (b*b) - (4*a*c);
        if(discriminant > 0){
            ArrayList<Double> results = new ArrayList<>();
            double x1 = (-b + Math.sqrt(discriminant))/(2*a);
            double x2 = (-b - Math.sqrt(discriminant))/(2*a);
            results.add(x1);
            results.add(x2);
            return results;
        } else if (discriminant == 0) {
            ArrayList<Double> results = new ArrayList<>();
            double x1 = (-b + Math.sqrt(discriminant))/(2*a);
            results.add(x1);
            return results;
        }else {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        System.out.println(getDigitSum(-1234));

        System.out.println(getRadicals(1, -1, -1));
    }
}
