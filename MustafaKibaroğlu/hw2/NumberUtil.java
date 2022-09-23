package secondweek.hw2;

import secondweek.loops.SecondWeekHW;

public class NumberUtil {
    public static int getDigitsCount(int sayi) { //1.Ödev

        int basamakSayisi = 0;
        if (SecondWeekHW.isNegative(sayi)) { //negatif sayı kontrolü
            sayi = (-1) * sayi;
        }
        do { // 0'ın da basamak sayısını bassın diye 1 kere içeri girmeli
            sayi = sayi / 10;
            basamakSayisi++;
        } while (sayi > 0);
        return basamakSayisi;
    }

    public static int pow(int a, int b) { //3.ödev
        int sonuc = 1;
        for (int i = 0; i < b; i++) {//döngü b kadar dönsün.Sonucu her seferinde a ile çarp.
            sonuc *= a;
        }
        return SecondWeekHW.isNegative(b) ? 1 : sonuc;//b negatifse 1,pozitifse sonucu döndür
    }
}
