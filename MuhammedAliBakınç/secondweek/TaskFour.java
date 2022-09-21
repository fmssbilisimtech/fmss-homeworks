package secondweek;

import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden
	isArmstrong metodunu yazınız ve test ediniz.
	Açıklamalar:
	- Bir sayının her basamağının basamak sayıncı kuvvetleri toplamı sayının kendisine eşitse bu sayıya Armstrong
	sayısı denir
	153 -> 1 + 125 + 27 = 153
	- Sayı negatif ise false döndürebilirsiniz
----------------------------------------------------------------------------------------------------------------------*/

public class TaskFour {
    public static void main(String[] args) {
        int num = getNumber();
        boolean result = NumberUtil.isArmstrong(num);
        showResult(num, result);
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void showResult(int num, boolean result){
        if(result)
            System.out.printf("%d sayısı bir Armstrong sayıdır.", num);
        else
            System.out.printf("%d sayısı bir Armstrong sayı değildir.", num);
    }
}
