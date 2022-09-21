package secondweek;

import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyelini döndüren factorial isimli
	metodu yazınız ve test ediniz.
	Açıklamalar:
	- Metot negatif sayılar için -1 değerini döndürecektir
	- Faktoriyel tanımı:
		0!= 1
		1!=1
		2!=1*2
		...
		n!=1 * 2 * ...* (n - 1) * n
	- Sınır taşması gözardı edilecektir
----------------------------------------------------------------------------------------------------------------------*/

public class TaskFive {
    public static void main(String[] args) {
        int num = getNumber();
        int result = NumberUtil.factorial(num);

        showResult(num, result);
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void showResult(int num, int result){
        System.out.printf("%d sayısının faktöriyeli: %d", num, result);
    }
}
