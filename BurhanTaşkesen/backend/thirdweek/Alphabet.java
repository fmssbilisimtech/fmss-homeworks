package backend.thirdweek;

import backend.secondweek.Date;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alphabet {
    public static List<Character> alphabetTR = List.of('a','b','c','ç','d','e','f','g','ğ','h','ı','i','j','k','l','m','n','o','ö','p','r','s','ş','t','u','ü','v','y','z');
    public static List<Character> alphabetEN = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','q','u','v','w','x','y','z');

    public static boolean isPangramTR(String sentence){ //1
        String currentSentenceAsLowerCase = sentence.toLowerCase();
        for (char currentChar : alphabetTR) {
            String currentCharAsString = String.valueOf(currentChar);
            if (!currentSentenceAsLowerCase.contains(currentCharAsString))
                return false;
        }
        return true;
    }

    public static boolean isPangramEN(String sentence){ //1
        String currentSentenceAsLowerCaser = sentence.toLowerCase();
        for (char currentChar : alphabetEN) {
            String currentCharAsString = String.valueOf(currentChar);
            if (!currentSentenceAsLowerCaser.contains(currentCharAsString))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(String sentence){ //2
        //karakterlerin türkçe olarak geleceği varsayıldı.
        String a = "";
        String sentenceAsLowerCase = sentence.toLowerCase();
        StringBuilder reverseString = new StringBuilder();

        for (int i = sentenceAsLowerCase.length()-1; i >= 0; --i) {
            char currentChar = sentenceAsLowerCase.charAt(i);
            if(alphabetTR.contains(currentChar))
                reverseString.append(currentChar);
        }
        String senctenceWithoutSpecials = reverseString.reverse().toString();

        return reverseString.toString().equals(senctenceWithoutSpecials);
    }

    public static String myStringBuilder(int n){ //4
        String[] stringList = new String[n];

        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = getRandomString();

        }

        StringBuilder resultString = new StringBuilder();

        for(String currentString : stringList){
            resultString.append(currentString).append("-");
        }
        resultString.deleteCharAt(resultString.length()-1);

        return resultString.toString();
    }

    public static void splitStringAndCalculateResults(){
        //<isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
        //Oğuz karan:10/09/1976:Matematik:90:100
        //.*([0-9]{2}/[0-9]{2}/[0-9]{4}).*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen input giriniz:");
        String string = scanner.nextLine();

        //long before = Clock.systemDefaultZone().millis();
        Pattern pattern = Pattern.compile("([^:]*):([\\d]+)/([\\d]+)/([\\d]{4}):([\\S]+):([\\d]+):([\\d]+)");
        Matcher matcher = pattern.matcher(string);
        matcher.find();
        //long after = Clock.systemDefaultZone().millis();
        //System.out.println("Gecen sure : " + (after-before) + " ms");

        int nameIndex = 1;
        int dateAsDayIndex = 2;
        int dateAsMonthIndex = 3;
        int dateAsYearIndex = 4;
        int lessonIndex = 5;
        int midtermExamIndex = 6;
        int finalExamIndex = 7;

        String name = matcher.group(nameIndex);
        String dateAsDay = matcher.group(dateAsDayIndex);
        String dateAsMonth = matcher.group(dateAsMonthIndex);
        String dateAsYear = matcher.group(dateAsYearIndex);
        String lesson = matcher.group(lessonIndex);
        int midtermExam = Integer.valueOf(matcher.group(midtermExamIndex));
        int finalExam = Integer.valueOf(matcher.group(finalExamIndex));
        int average = (int) Math.round(midtermExam*0.4 + finalExam*0.6);

        String dayOfWeekAsString = "NA";
        int dayOfWeekAsNumber = Date.getDayOfWeek(Integer.valueOf(dateAsDay),Integer.valueOf(dateAsMonth),Integer.valueOf(dateAsYear));
        dayOfWeekAsString = DayOfWeek.values()[dayOfWeekAsNumber].toString();

        System.out.printf("%s %s günü doğdu.%s dersinde vizeden %d, finalden %d aldı ve not ortalaması : %d",name,dayOfWeekAsString,lesson,midtermExam,finalExam,average);
    }

    enum DayOfWeek {
        PAZAR, PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI
    }

    public static String getRandomString(){
        int stringLength = 30;
        //int charRange = 255;
        Random random = new Random();
        int size = random.nextInt(stringLength);
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < size; i++) {
            resultString.append((char) random.nextInt(65,90));
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        //System.out.println(isPangramEN("The quick brown fox jumps over the lazy dog")); //1
        //System.out.println(isPangramTR("Pijamalı hasta yağız şoföre çabucak güvendi")); //1
        //System.out.println(isPalindrome("ey edip Adana'da pide ye")); //2

        /** 3.ödev geçen haftanın Date sınıfı içerisinde yer alıyor.**/ //3

        //System.out.println(myStringBuilder(10)); //4

        splitStringAndCalculateResults(); //5
    }
}


