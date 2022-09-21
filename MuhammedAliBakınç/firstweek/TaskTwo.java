package firstweek;

import java.util.Scanner;

/*
Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana
basan programı yazınız
*/

public class TaskTwo {
    public static void main(String[] args) {
        getNumbers();
    }

    public static void getNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2+bx+c denkleminin katsayılarını giriniz.");

        System.out.print("a değerini giriniz: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("b değerini giriniz: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("c değerini giriniz: ");
        int c = Integer.parseInt(scanner.nextLine());

        calcDelta(a, b, c);
    }

    private static void calcDelta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);

        findXs(delta, a, b);
    }

    private static void findXs(int delta, int a, int b) {
        double x1;
        double x2;

        if(delta > 0){
            x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
            x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1: %f , x2: %f", x1, x2);
        }

        if(delta == 0){
            x1 = (-1d * b) / (2d * a);
            x2 = x1;

            System.out.printf("Denklemin çakışık kökü vardır: %f", x1);
        }

        if(delta < 0){
            System.out.println("Denklemin gerçel kökü yoktur");
        }
    }
}
