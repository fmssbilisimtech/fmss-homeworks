package week3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

class isPangram{
    public static void isPangramEN(String string){
        string = string.toLowerCase();
        boolean allLetter = true;
        for (char ch = 'a';ch<='z';ch++)
        {
            if(!string.contains(String.valueOf(ch))){
                allLetter =false;
                break;
            }
        }
        if (allLetter){
            System.out.println("Pangram String");
        }
        else
            System.out.println("Pangram String Degil");
    }
    public static void isPangramTR(String string1){
        Locale trlocale = new Locale("tr-TR");
        boolean allLetter = true;
        char [] ch={'a','b','c','ç','d','e','f','g','ğ','h','i','ı','j','k','l'
                ,'m','n','o','ö','p','r','s','ş','t','u','ü','v','y','z'};
        if(string1.contentEquals(String.valueOf(ch))){
            System.out.println("Pangram Değildir");
        }
        else {
            System.out.println("Pangram'dır");
        }
    }
}
class isPalindrome{
    public static void palindromeString(){
        String a,b ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("String Girisi Yapiniz");
        a = sc.nextLine();
        String c= a.replace(" ","");
        int n = c.length();
                for(int i =n-1;i>=0;i--){
                    b = b + c.charAt(i);
                }
                if(c.equalsIgnoreCase(b)){
                    System.out.println(c+"Stringi palindrom");
                }
                else {
                    System.out.println(c +"Stringi palindrom degil");
                }
            }
        }
class stringExercise{
    public static void strArray(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("n sayisini giriniz");
        int n = sc.nextInt();
        String [] arr = new String[n];
        rand.toString();

    }
}


public class week3 {
    public static void main(String[] args) {
        //isPalindrome.palindromeString();
        //stringExercise.strArray();
       
    }


}
