package thirdweek.hw3;

import java.util.Random;
import java.util.Scanner;

public class CreateString {
    public static void createString(){

        String result="";
        String temp;

        System.out.println("Kelime sayısı girin..");
        Scanner sc=new Scanner(System.in);
        int elemanSayisi=sc.nextInt();

        for(int i=0;i<elemanSayisi;i++){
            temp=generateString();
            result=result+"-"+temp;
        }
        System.out.println(result);

    }
    public static String generateString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int)(Math.random()*10);
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
}
