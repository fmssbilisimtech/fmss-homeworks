package thirdweek.hw3;

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome() {
        String temp = "";
        boolean result;

        System.out.println("String gir");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        for (int i = st.length() - 1; i >= 0; i++) {
            temp = temp + st.charAt(i);
        }

        if (st.equals(temp)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
