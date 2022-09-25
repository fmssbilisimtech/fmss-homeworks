package backend.secondweek;

public class Date {
    public static boolean isValidDate(int day,int month,int year){//7
        int [][] maxMonthDay = new int[12][1];
        maxMonthDay[0][0] = 31;
        maxMonthDay[1][0] = 29;
        maxMonthDay[2][0] = 31;
        maxMonthDay[3][0] = 30;
        maxMonthDay[4][0] = 31;
        maxMonthDay[5][0] = 30;
        maxMonthDay[6][0] = 31;
        maxMonthDay[7][0] = 31;
        maxMonthDay[8][0] = 30;
        maxMonthDay[9][0] = 31;
        maxMonthDay[10][0] = 30;
        maxMonthDay[11][0] = 31;

        if (!LeapYear.isLeapYear(year)){
            maxMonthDay[1][0] = 28;
        }

        if (month <= 0 || month > 12)
            return false;

        return (day <= maxMonthDay[month-1][0] && day > 0);
    }//7

    public static int getDayOfYear(int day,int month,int year){//8
        int [][] maxMonthDay = new int[12][1];
        maxMonthDay[0][0] = 31;
        maxMonthDay[1][0] = 29;
        maxMonthDay[2][0] = 31;
        maxMonthDay[3][0] = 30;
        maxMonthDay[4][0] = 31;
        maxMonthDay[5][0] = 30;
        maxMonthDay[6][0] = 31;
        maxMonthDay[7][0] = 31;
        maxMonthDay[8][0] = 30;
        maxMonthDay[9][0] = 31;
        maxMonthDay[10][0] = 30;
        maxMonthDay[11][0] = 31;

        if (!LeapYear.isLeapYear(year)){
            maxMonthDay[1][0] = 28;
        }

        if(isValidDate(day, month, year)){
            int sum=0;
            for (int i = 0; i < month-1; i++) {
                sum += maxMonthDay[i][0];
            }
            return sum + day;
        }else
            return -1;
    }//8

    public static int getDayOfWeek(int day,int month,int year){
        if (year<1900)
            return -1;

        int [][] maxMonthDay = new int[12][1];
        maxMonthDay[0][0] = 31;
        maxMonthDay[1][0] = 29;
        maxMonthDay[2][0] = 31;
        maxMonthDay[3][0] = 30;
        maxMonthDay[4][0] = 31;
        maxMonthDay[5][0] = 30;
        maxMonthDay[6][0] = 31;
        maxMonthDay[7][0] = 31;
        maxMonthDay[8][0] = 30;
        maxMonthDay[9][0] = 31;
        maxMonthDay[10][0] = 30;
        maxMonthDay[11][0] = 31;

        int sumDays = 0;
        for (int i = 1900; i < year; i++) {
            if (!LeapYear.isLeapYear(year)){
                maxMonthDay[1][0] = 28;
            }else {
                maxMonthDay[1][0] = 29;
            }

            sumDays += getDayOfYear(maxMonthDay[11][0] , 12, i);
        }

        sumDays += getDayOfYear(day, month, year);

        int dayOfWeek = sumDays%7;

        return dayOfWeek;
    }//9

    public static void main(String[] args) {
        //System.out.println(isValidDate(1, 11, 4)); //7

        //System.out.println(getDayOfYear(33, 8, 2022)); //8

        System.out.println(getDayOfWeek(9, 5, 2023)); //9
    }
}
