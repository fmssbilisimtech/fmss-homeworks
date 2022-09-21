package secondweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı
	günü olduğunu döndüren getDayOfYear isimli metodu yazınız ve test ediniz. Metot geçersiz bir tarih için
	-1 değerini döndürecektir
----------------------------------------------------------------------------------------------------------------------*/

public class TaskEight {
    public static void main(String[] args) {
        List<Integer> date = getDate();
        int result = NumberUtil.getDayOfYear(date);
        showResult(date, result);
    }

    public static List<Integer> getDate(){
        List<Integer> date = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir gün giriniz: ");
        date.add(Integer.parseInt(sc.nextLine()));

        System.out.print("Bir ay giriniz: ");
        date.add(Integer.parseInt(sc.nextLine()));

        System.out.print("Bir yıl giriniz: ");
        date.add(Integer.parseInt(sc.nextLine()));

        return date;
    }

    public static void showResult(List<Integer> date, int result){
        System.out.printf("%d/%d/%d yılın %d. günüdür.", date.get(0), date.get(1), date.get(2), result);
    }
}
