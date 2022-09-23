package firstweek.hw1;

public class GetDigitSum {
    public static int getDigitSum(int number){
        int sum=0;
        sum+=(number%10);
        number=number/10;
        sum+=(number%10);
        number=number/10;
        sum+=(number%10);
        return sum;
    }
}
