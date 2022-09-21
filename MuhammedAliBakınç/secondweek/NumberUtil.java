package secondweek;

import java.util.Arrays;
import java.util.List;

public class NumberUtil {
    public static void getDigitsCount(int num) {
        int count = 0;
        int temp = num;

        if (num == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.printf("%d sayısının basamak sayısı: %d", num, count);
    }

    public static void getReversed(int num) {
        int reversed = 0;
        int temp = num;

        while (temp != 0) {
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }

        System.out.printf("%d sayısının tersi: %d", num, reversed);
    }

    public static int pow(int a, int b) {
        int result = 1;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
        }

        return result;
    }

    public static boolean isArmstrong(int num) {
        int result = 0;
        int temp = num;

        if (num < 0) {
            return false;
        }

        while (temp != 0) {
            result += pow(temp % 10, 3);
            temp /= 10;
        }

        return num == result;
    }

    public static int factorial(int num) {
        int result = 1;

        if (num < 0) {
            return -1;
        }

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        return result;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isValidDate(List<Integer> date) {
        List<Integer> months30 = Arrays.asList(4, 6, 9, 11);
        List<Integer> months31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

        if ((date.get(0) <= 31 && date.get(0) > 0) && (date.get(1) <= 12 && date.get(1) > 0) && (date.get(2) <= 9999 && date.get(2) > 0)) {
            if ((months30.contains(date.get(1)) && date.get(0) <= 30) || months31.contains(date.get(1)))
                return true;

            if (date.get(1) == 2)
                if (((date.get(2) % 4 == 0) && date.get(0) <= 29) || ((date.get(2) % 4 != 0) && date.get(0) <= 28))
                    return true;
        }

        return false;
    }

    public static int getDayOfYear(List<Integer> date) {
        List<Integer> months30 = Arrays.asList(4, 6, 9, 11);
        List<Integer> months31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        int day = 0;

        if (!isValidDate(date)) {
            return -1;
        }

        for (int i = 1; i <= date.get(1); i++) {
            if (i != date.get(1)) {
                if (months30.contains(i))
                    day += 30;
                if (months31.contains(i))
                    day += 31;
                if (i == 2) {
                    if (date.get(2) % 4 == 0)
                        day += 29;
                    else
                        day += 28;
                }
            } else
                day += date.get(0);
        }

        return day;
    }

    public static int getDayOfWeek(List<Integer> date) {
        if (!isValidDate(date)) {
            return -1;
        }

        int diff = 0;
        int day;

        for (int i = 1900; i < date.get(2); i++) {
            if (i % 4 == 0)
                diff += 366;
            else
                diff += 365;
        }

        diff += getDayOfYear(date) - 1;
        day = diff % 7;

        return day;
    }

}
