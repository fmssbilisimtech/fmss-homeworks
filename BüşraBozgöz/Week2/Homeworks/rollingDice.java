package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
public class rollingDice {
    public static void main(String[] args) {
        System.out.println("iki zar atıyoruz bunların çift ve aynı sayı gelme olasılığını hesaplıyoruz");
        // olasılık = birinci durumun eleman sayısı *2.durumun elaman sayısı / tüm durum
        int tumDurum=36; // (1,1),(1,2),,,,,,,,,,,,(6,6)
        int birinciZar=3; // 3 çift sayı var 2,4,6
        int ikinciZar=3; // 2,4,6
        int olasilik;
        olasilik= (birinciZar*ikinciZar)/tumDurum;
        System.out.println(olasilik);
    }
}
