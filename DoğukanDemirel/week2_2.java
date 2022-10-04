package week2_2;

import java.util.Objects;
import java.util.Scanner;

class NumberUtil{
    public static void getDigitsCount(){
        int number;
        int counter=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("BIR SAYI GIRINIZ:");
        number = sc.nextInt();
        while(number>0){
            number /= 10;
            counter++;
            System.out.print(number+"->");
        }
        System.out.println("\nBASAMAK="+counter);

    }
    public static void getReverse(){
        int number =0;
        int reverse =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayi giriniz:");
        number = sc.nextInt();
        while (number !=0){
            reverse *= 10;
            reverse = reverse + number % 10;
            number /=10;
        }
        System.out.println(reverse);
    }
    public static void getPower(){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("<----------A UZERI B ALAN PROGRAM---------->");
        System.out.println("B DEGERINI GIRINIZ:");
        b = sc.nextInt();
        if (b<=0)
        {
            System.out.println(1);
            return;
        }
        System.out.println("A DEGERINI GIRINIZ:");
        a = sc.nextInt();


        while (b>1)
        {
            a*=a;
            b--;
        }
        System.out.println(a);

    }
    public static void armstrongNumber(){
        Scanner scan = new Scanner(System.in);
        int digitCount=0,number;
        int total =0;
        System.out.println("SAYI GIRINIZ:");
        int value = scan.nextInt();
        int tempValue = value;
        int tempValue2 = value;
        if(value <0){
            return;
        }
        while (tempValue>0){
            tempValue /= 10;
            digitCount++;
        }
        while(value>0){
            number = value%10;
            total += Math.pow(number,digitCount);
            value/=10;
        }
        if (total ==tempValue2){
            System.out.println(tempValue2+""+"Sayisi Amstrong Sayidir");
        }
        else {
            System.out.println(tempValue2+""+"Sayisi Amstrong Sayi Degildir");
        }
    }
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        int value;
        int fac=1;
        System.out.println("Bir Sayi Giriniz:");
        value = sc.nextInt();
            for(int i=1;i<=value;i++){
                fac *=i;
            }
        System.out.println(fac);

    }
}
class DateUtil{
    public static void isLeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Yil Degeri Giriniz:");
        int year = sc.nextInt();
        if (year>=1 &&year<=2022){
            if(year%4==0){
                System.out.println("ARTIK YILDIR");
            }
            else{
                System.out.println("ARTIK YIL DEGILDIR");
            }
        }
        else{
           return;
        }

    }
    public static void isValidDate() {
        int day,month,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("GUN DEGERI GIRINIZ:");
        day = sc.nextInt();
        System.out.println("AY DEGERI GIRINIZ:");
        month = sc.nextInt();
        System.out.println("YIL DEGERI GIRINIZ:");
        year = sc.nextInt();
        System.out.println(day+"/"+month+"/"+year);
        if(2022>=year&& year>=1){
            if(12>=month&&1<=month)
            {
                if (day>=1&&day<=31)
                {
                    switch (month){
                        case 1:
                        case 5:
                        case 3:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            if(day<=31)
                                System.out.println("valid");
                            else
                                System.out.println("NOT VALID");
                            break;

                        case 2:
                            if(day ==28 && year%4 !=0)
                                System.out.println("valid");
                            else if(day == 29 && year%4 ==0)
                                System.out.println("valid");
                            else
                                System.out.println("NOT VALID");
                            break;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if(day<=30)
                                System.out.println("valid");
                            else
                                System.out.println("NOT VALID");

                            break;

                    }
                    }
                else
                    System.out.println("NOT VALID");
                }
            else
                System.out.println("NOT VALID");
            }
        else
        System.out.println("NOT VALID");

    }
    public static void getDayOfYear() {
        int day,month,year;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("GUN DEGERI GIRINIZ:");
        day = sc.nextInt();
        System.out.println("AY DEGERI GIRINIZ:");
        month = sc.nextInt();
        System.out.println("YIL DEGERI GIRINIZ:");
        year = sc.nextInt();
        int cout;
        for (cout =1;cout<month;cout++){
            if(cout<=7){
                if(cout==2){
                    sum=sum+28+leapYear(year);
                }
                else if (cout%2 ==0){
                    sum=sum+30;
                }
                else{
                    sum=sum+31;
                }
            }
            else{
                if(cout%2==0){
                    sum=sum+31;
                }
                else{
                    sum=sum+30;
                }
            }
        }
        sum +=day;
        System.out.println(day+"/"+month+"/"+year+"="+sum);
    }
    static int leapYear(int year){
        if (year%4==0 && year%100 !=0 || year%400 ==0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void getDayOfWeek() {
        //developing
    }
}
class StringExercise{
    public static void atmApp(){
        int cout=3;
        Scanner sc= new Scanner(System.in);
        String userName;
        String password;
        System.out.println("KULLANICI ADI GIRINIZ:");
        userName = sc.nextLine();
        System.out.println("SIFRE GIRINIZ: ");
        password = sc.nextLine();
            if (userName.equals("admin")&&password.equals("123456")){
                System.out.println("Giris Basarili");
            }
            else {
                while (true && cout !=0){
                    System.out.println("KULLANICI ADI GIRINIZ:");
                    userName = sc.nextLine();
                    System.out.println("SIFRE GIRINIZ: ");
                    password = sc.nextLine();
                    cout--;
                }
            }




    }

    public static void dice() {
        int [] dice1 = new int[200];
        int [] dice2 = new int[200];
        int cout = 0;

        for (int i=0;i< dice1.length;i++){
            dice1[i] = (int) (Math.random()*6)+1;
            dice2[i] = (int) (Math.random()*6)+1;
                if(dice1[i]==dice2[i]){
                    cout++;
            }
        }
        System.out.println((double) cout/dice1.length);
    }

    public static void input() {
        Scanner sc= new Scanner(System.in);
        String deger;
        System.out.println("Deger giriniz:");
        deger = sc.nextLine();
        while (deger.equals("quit")){
            System.out.println("Deger giriniz:");
            deger = sc.nextLine();
        }
        deger.replace(",","-");
        System.out.println(deger);
    }
}



public class Week2_2 {
    public static void main(String[] args) {
        //NumberUtil.getDigitsCount();
        //NumberUtil.getReverse();
        //NumberUtil.getPower();
        //NumberUtil.armstrongNumber();
        //NumberUtil.factorial();
        //DateUtil.isLeapYear();
        //DateUtil.isValidDate();
        //DateUtil.getDayOfYear();
        //DateUtil.getDayOfWeek();
        //StringExercise.atmApp();
        //StringExercise.dice();
        //StringExercise.input();
    }
}
