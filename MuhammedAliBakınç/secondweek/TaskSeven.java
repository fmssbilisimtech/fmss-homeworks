package secondweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin geçerli bir
	tarih olup olmadığını test eden isValidDate isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/

public class TaskSeven {
    public static void main(String[] args) {
        List<Integer> date = getDate();
        boolean result = NumberUtil.isValidDate(date);
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

    public static void showResult(List<Integer> date, boolean result){
        if(result)
            System.out.printf("%d/%d/%d geçerli bir tarihtir.", date.get(0), date.get(1), date.get(2));
        else
            System.out.printf("%d/%d/%d geçerli bir tarih değildir.", date.get(0), date.get(1), date.get(2));
    }
}
