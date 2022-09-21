package thirdweek;

import java.util.Random;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Klavyden int türden bir n sayısı isteyiniz. n elemanlı bir String dizisi yaratınız.
	Bu dizinin her bir elemanını rasgele uzunlukta rasgele üretilmiş yazılarla doldurunuz. Bu işlemden sonra
	dizinin elemanlarını aralarında - (tire) karakteri olacak şekilde birleştirip yeni bir String elde eden
	programı yazınız
----------------------------------------------------------------------------------------------------------------------*/

public class TaskFour {
    public static void main(String[] args) {
        int n = getLength();
        String[] texts = new String[n];

        fillArray(texts);

        String result = mergeStrings(texts);

        showResult(result);
    }

    public static int getLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir uzunluk giriniz: ");

        return Integer.parseInt(sc.nextLine());
    }

    private static void fillArray(String[] texts) {
        Random random = new Random();

        for (int i = 0; i < texts.length; i++) {
            StringBuilder builder = new StringBuilder();
            int length = 1 + random.nextInt(10);

            for (int j = 0; j < length; j++) {
                char c = (char) (65 + random.nextInt(58));
                builder.append(c);
            }

            texts[i] = builder.toString().replaceAll("[^A-Za-z]", "");
        }
    }

    public static String mergeStrings(String[] texts) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < texts.length; i++) {
            text.append(texts[i]);

            if(i != texts.length - 1)
                text.append("-");
        }

        return text.toString();
    }

    public static void showResult(String text) {
        System.out.printf("%s", text);
    }
}
