package firstweek.hw1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GetDigitSum.getDigitSum(123);

        Scanner kb = new Scanner(System.in);

        System.out.print("a sayıyı giriniz:");
        int a = kb.nextInt();
        System.out.print("b sayıyı giriniz:");
        int b = kb.nextInt();
        System.out.print("c sayıyı giriniz:");
        int c = kb.nextInt();
        DenklemKok.kokler(a, b, c);
    }
}
