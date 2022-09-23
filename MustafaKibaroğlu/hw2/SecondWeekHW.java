package secondweek.hw2;

import secondweek.hw2.NumberUtil;

public class SecondWeekHW {
    public static String kullaniciAdiAlma() {//10. ödevde kullanıcı adı alma
        System.out.println("Lütfen kullanıcı adınızı giriniz.");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        String kullaniciAdi = kb.nextLine();
        return kullaniciAdi;
    }

    public static String sifreAlma() {//10. ödevde şifre alma
        System.out.println("Lütfen sifrenizi giriniz.");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        String sifre = kb.nextLine();
        return sifre;
    }

    public static int kenarSayisi() {//11. ödevde zarın kaç kenarlı olduğunu belirt
        System.out.println("Zarlarınız kaç kenarlı olsun?");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int sayi = Integer.parseInt(kb.nextLine());
        return sayi;
    }

    public static int zarAtma() {//11. ödevde zarın kaç kere atılacağı
        System.out.println("Zarlarınızı kaç kere atmak istiyorsunuz?");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int sayi = Integer.parseInt(kb.nextLine());
        return sayi;
    }

    public static String kelimeAlma() {//12. ödevde kelime alma
        System.out.println("Lütfen kelimenizi giriniz.");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        String kelime = kb.nextLine();
        return kelime;
    }

    public static int sayiAlma() {//Kullanıcıdan sayı al
        System.out.println("Lütfen bir sayı giriniz.");
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int sayi = Integer.parseInt(kb.nextLine());
        return sayi;
    }

    public static boolean isNegative(int sayi) {//sayının negatifliğini kontrol et
        if (sayi < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getReverse(int sayi) { //2. ödev
        int basamakSayisi = NumberUtil.getDigitsCount(sayi); //1.ödevden basamak sayısını al
        int sayininTersi = 0;
        int temp = 0;
        int temp2 = basamakSayisi;
        for (int i = 0; i < basamakSayisi; i++) { //Döngü basamak sayısı kadar sürsün
            temp = sayi % 10; //Son basamağı temp değişkenine ata
            sayininTersi += temp * (Math.pow(10, temp2 - 1));
            sayi = sayi / 10;
            temp2--;
        }
        return sayininTersi;
    }

    public static boolean isArmstrong(int sayi) {//4.ödev
        int basamakSayisi = NumberUtil.getDigitsCount(sayi);//Basamak sayısını al
        int sonuc = 0;
        int temp = 0;
        int temp2 = sayi;
        for (int i = 0; i < basamakSayisi; i++) {
            temp = temp2 % 10;//sayının son basamağını temp değişkenine ata
            sonuc += (Math.pow(temp, basamakSayisi));//temp'in basamak sayısı kuvvetini al sonuca ekle
            temp2 = temp2 / 10;
        }
        return isNegative(sayi) ? false : ((sayi == sonuc) ? true : false);/*sayı negatifse false döndür.
                                                                   sayı pozitifse,sonuç ile kıyasla.Eşitse
                                                                   true,değilse false döndür*/
    }

    public static int factorial(int sayi) { //5.ödev
        int sonuc = 1;
        int temp = sayi;
        for (int i = 0; i < sayi; i++) {/*Döngü sayının değeri kadar dönsün.
                                  Ve sonuc her seferinde sayının 1 eksiği ile çarpılsın*/
            sonuc *= temp;
            temp--;
        }
        return isNegative(sayi) ? -1 : ((sayi == 0) ? 1 : sonuc);/*Sayı negatifse -1 döndür.
                                                         Sayının negatif olmadığı durumda;sayı 0 ise 1 döndür,
                                                         değise sonucu döndür*/
    }

    public static boolean isLeapYear(int year) {//6.ödev

        if (isNegative(year)) {
            System.out.println("Lütfen pozitif bir sayı giriniz!");
            return isLeapYear(sayiAlma());
        }

        if (NumberUtil.getDigitsCount(year) != 4) {
            System.out.println("Lütfen 4 haneli bir sayı giriniz!");
            return isLeapYear(sayiAlma());
        }

        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
    }

    public static boolean isValidDate(int gün, int ay, int yil) { //7.ödev

        if (gün < 1 || gün > 31)
            return false;
        if (ay < 1 || ay > 12)
            return false;
        if (yil < 1)
            return false;
        if (ay == 2) {  //Eğer artık yılsa şubat ayı 29 çeker
            if (isLeapYear(yil))
                return gün < 30;
            else
                return gün < 29;
        }
        if (ay == 4 || ay == 6 || ay == 9 || ay == 11) //Nisan,Haziran,Eylül,Kasım ayları 30 çeker
            return gün < 31;

        return true;
    }

    public static int getDayofYear(int gün, int ay, int yil) {//8.ödev

        int sonuc = 0;

        if (!isValidDate(gün, ay, yil))
            return -1;

        int aylarinGunleri[] = {31, 28, 31, 30, 31, 30, /*Bütün aylar kaç günse arraya at*/
                31, 31, 30, 31, 30, 31};

        if (isLeapYear(yil)) /* Eğer artık yılsa Şubat 29 çeker*/
            aylarinGunleri[1] = 29;

        for (int i = 0; i < ay; i++) { //Kaçıncı aysa o kadar dönsün

            if (i == (ay - 1)) { //Array 0. indexten başladığı için ay-1
                return sonuc = sonuc + gün;
            }
            sonuc = sonuc + aylarinGunleri[i];
        }
        return sonuc;
    }

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

    public static void atm(String kAdi, String sifre) { //10.ödev

        String denemeAdi = kullaniciAdiAlma();
        String denemeSifre = sifreAlma();
        int i = 0;

        if (kAdi.equals(denemeAdi) && sifre.equals(denemeSifre)) { /*Kullanıcı adı ve şifre aynıysa*/
            System.out.println("Giriş Başarılı.");
        } else if (i < 3 && (!(kAdi.equals(denemeAdi)) || !(sifre.equals(denemeSifre)))) {/*Kullanıcı adı veya şifre
                                                                                       şifre farklıysa ve 3'ten
                                                                                       az deneme yapılmışsa*/
            while (i < 3) {
                System.out.println("Hatalı giriş.Lütfen tekrar deneyin");
                denemeAdi = kullaniciAdiAlma();
                denemeSifre = sifreAlma();

                if (kAdi.equals(denemeAdi) && sifre.equals(denemeSifre)) {/*3 deneme içinde doğru
                                                                             kullanıcı adı ve şifre
                                                                             girilmişse*/
                    System.out.println("Giriş Başarılı.");
                    break;
                } else if (i == 2 && (!(kAdi.equals(denemeAdi)) || !(sifre.equals(denemeSifre))))/*3 denemede de
                                                                                              kullanıcı adı ve
                                                                                              şifre yanlış girilmişse*/
                    System.out.println("Giriş Başarısız. Deneme hakkınız bitti");
                i++;
            }
        }
    }

    public static double simülasyon() { //11.ödev

        int kenarSayisi=kenarSayisi();
        int tekrar=zarAtma();
        double olasilik = 1 / (double) kenarSayisi;
        olasilik=Math.pow(olasilik,tekrar);
        return olasilik;
    }

    public static String kelimeBirlestirme(){
        String kelime;
        String sonuc="";
        kelime=kelimeAlma();

        while (!(kelime.equals("quit"))){

            if(sonuc.isEmpty())
                sonuc=kelime;

            else
                sonuc = sonuc.concat("-").concat(kelime);

            kelime=kelimeAlma();
        }

        return sonuc;
    }
}
