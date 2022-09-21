package secondweek;

import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren
	pow isimli metodu yazınız.
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot b nin negatif değerleri için 1 değerini döndürecektir
	- Metot NumberUtil sınıfı içerisinde yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("a^b işlemi için;");
        System.out.print("a sayısını giriniz: ");
        int a = getNumber();
        System.out.print("b sayısını giriniz: ");
        int b = getNumber();

        int result = NumberUtil.pow(a, b);
        showResult(a, b, result);
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public static void showResult(int a, int b, int result) {
        System.out.printf("%d sayısının %d. dereceden kuvveti: %d", a, b, result);
    }
}
