package thirdweek.hw3;

import static secondweek.hw2.SecondWeekHW.getDayofYear;
import static secondweek.hw2.SecondWeekHW.isValidDate;

public class GetDayofWeek {

    public static String getDayofWeek(int gün, int ay, int yil) { //9.ödev

        int günSayisi = 0;
        int index = 0;

        String haftaninGunleri[] = {"Pazar", "Pazartesi", "Salı" /*Haftanın günlerini arraya at*/
                , "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};

        if (!isValidDate(gün, ay, yil) || yil < 1900)
            return String.valueOf(-1);

        for (int i = 1900; i <= yil; i++) { /*1900'den günümüze aralık ver*/

            if (i != yil) { //Girilen yıla kadar olan bütün günleri topla ve ekle
                günSayisi = günSayisi + getDayofYear(31, 12, i);
            } else if (i == yil) { //Girilen yılda kaç gün varsa topla ve ekle
                günSayisi = günSayisi + getDayofYear(gün, ay, yil);
            }
        }

        index = günSayisi % 7;

        return haftaninGunleri[index];

    }


}
