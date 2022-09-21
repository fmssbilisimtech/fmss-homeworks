package thirdweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana yazdıran programı yazınız.
	Not: Geçerlilik kontrolü yapılmayacaktır.

	<isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
	Oğuz karan:10/09/1976:Matematik:90:100

	Bu formatta kişinin vize final notlarına vize * %40 + final * %60 formulüne göre geçme notunu hesaplayan ve doğum
	tarihinin hangi güne geldiğini yazdıran programı yazınız

----------------------------------------------------------------------------------------------------------------------*/

public class TaskFive {
    public static void main(String[] args) {
        String data = getData();
        String[] datas = parseData(data);
        List<Integer> date = parseDate(datas[1]);

        int grade = calculateGrade(datas);
        int day = NumberUtil.getDayOfWeek(date);

        showResult(datas, grade, day);
    }

    public static String getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilgileri giriniz: ");

        return sc.nextLine();
    }

    private static String[] parseData(String data) {
        return data.split(":");
    }

    private static List<Integer> parseDate(String data) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String a : data.split("/")) {
            list.add(Integer.parseInt(a));
        }

        return list;
    }

    public static int calculateGrade(String[] datas) {
        return ((Integer.parseInt(datas[3]) / 10) * 4) + ((Integer.parseInt(datas[4]) / 10) * 6);
    }

    public static String calculateDay(int result) {
        return switch (result) {
            case 0 -> "Pazar";
            case 1 -> "Pazartesi";
            case 2 -> "Salı";
            case 3 -> "Çarşamba";
            case 4 -> "Perşembe";
            case 5 -> "Cuma";
            case 6 -> "Cumartesi";
            default -> "";
        };
    }

    public static void showResult(String[] datas, int grade, int day) {
        System.out.printf("Ad Soyad: %s%n", datas[0]);
        System.out.printf("Doğum Tarihi ve Günü: %s - %s%n", datas[1], calculateDay(day));
        System.out.printf("Ders: %s%n", datas[2]);
        System.out.printf("Vize: %s%n", datas[3]);
        System.out.printf("Final: %s%n", datas[4]);
        System.out.printf("Geçme Notu: %d%n", grade);
    }
}
