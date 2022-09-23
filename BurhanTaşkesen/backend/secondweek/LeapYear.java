package backend.secondweek;

public class LeapYear {
    public static boolean isLeapYear(int year){
        //kurallara wikipediden bakıldı.
        //   https://tr.wikipedia.org/wiki/Art%C4%B1k_y%C4%B1l


        //boolean x100 = year%100 == 0;
        //if (x100)
        return ((year%4 == 0) && ((year%400==0) || !(year%100 == 0)) && (year%4000 != 0));
        //else
        //    return ((year%4 == 0) && (year%4000 != 0));
    }//6


    public static void main(String[] args) {
        int num = 2012;

        System.out.printf("is year leap : %b\n",LeapYear.isLeapYear(num)); //6
    }
}
