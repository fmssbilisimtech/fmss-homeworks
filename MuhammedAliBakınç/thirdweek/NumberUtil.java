package thirdweek;

import java.util.Arrays;
import java.util.List;

public class NumberUtil {
    public static List<Integer> months30 = Arrays.asList(4, 6, 9, 11);
    public static List<Integer> months31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

    public static boolean isValidDate(List<Integer> date) {
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
