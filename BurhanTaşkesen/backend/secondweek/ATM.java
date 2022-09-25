package backend.secondweek;

import java.util.Scanner;

public class ATM {
    public ATM(){
        USERNAME = "admin";
        PASSWORD = "password";
    }
    public ATM(String username, String password){
        USERNAME = username;
        PASSWORD = password;
    }
    public static Scanner scanner = new Scanner(System.in);
    private static String USERNAME;
    private static String PASSWORD;
    public static int attemptCounter;

    public boolean tryLogin(){
        while (attemptCounter<3){
            System.out.print("enter username : ");
            String username = scanner.nextLine();
            System.out.print("enter password : ");
            String password = scanner.nextLine();

            if(username.equals(USERNAME) && password.equals(PASSWORD)){
                System.out.println("Giris basarili !");
                return true;
            }
            else if(++attemptCounter < 3){
                System.out.println("Lutfen tekrar deneyin");
            }

        }
        System.out.println("Giris basarisiz...");
        return false;
    }

    public static void main(String[] args) {
        //String username = ATM.scanner.nextLine();
        //String password = ATM.scanner.nextLine();
        ATM atm = new ATM("admin","password");
        atm.tryLogin();
    }
}
