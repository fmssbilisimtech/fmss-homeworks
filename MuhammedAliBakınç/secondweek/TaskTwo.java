package secondweek;

import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren getReverse isimli metodu
	yazınız ve test ediniz. Örneğin -123 sayısı için metot -321 sayısını döndürecektir
	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/

public class TaskTwo {
    public static void main(String[] args) {
        NumberUtil.getReversed(getNumber());
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }
}