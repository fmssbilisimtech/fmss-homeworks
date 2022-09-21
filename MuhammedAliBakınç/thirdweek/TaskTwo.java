package thirdweek;

import java.util.Locale;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	 Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome
	 isimli metodu yazınız ve test ediniz
	 Palindrom: Yalnızca alfabetik karakterleri tersten de okunduğunda aynı olan yazılara denir. Yani alfabetik
	 dışı karakterler yok sayılır

	 Örnek:
	 ey edip Adana'da pide ye -> eyedipadanadapideye
	 Anastas mum satsana -> anastasmumsatsana
	 Ali Papila -> alipapila
----------------------------------------------------------------------------------------------------------------------*/

public class TaskTwo {
    public static void main(String[] args) {
        String text = getText();

        boolean result = isPalindrome(text.toLowerCase(Locale.ROOT));

        showResult(text, result);
    }

    public static String getText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");

        return sc.nextLine();
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-z]", "");

        StringBuilder reversed = new StringBuilder();

        for(int i = text.length()-1; i>= 0; i--){
            reversed.append(text.charAt(i));
        }

        return text.equals(reversed.toString());
    }

    public static void showResult(String text, boolean result){
        if(result)
            System.out.printf("%s, palindromdur", text);
        else
            System.out.printf("%s, palindrom değildir", text);
    }
}
