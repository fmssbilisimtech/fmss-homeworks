package secondweek;

import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren getDigitsCount isimli
	metodu NumberUtil isimli bir sınıfın içerisinde yazınız ve klavyeden alınan değerlerle çağırarak test ediniz

	123 -> 12 -> 1 -> 0
----------------------------------------------------------------------------------------------------------------------*/

public class TaskOne {
    public static void main(String[] args) {
        NumberUtil.getDigitsCount(getNumber());
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }
}
