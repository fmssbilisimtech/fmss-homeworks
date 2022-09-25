package JavaCourse.Week2.exercises;
import java.util.Scanner;
public class atmEx11 {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 12300;
        int select;
        while (right > 0) {
            System.out.print("Enter your username :");
            userName = input.nextLine();
            System.out.print("Enter your Password : ");
            password = input.nextLine();

            if (userName.equals("busrabzgz") && password.equals("bb123")) {
                System.out.println("Hello, Welcome to Fathers Bank!");
                do {
                    System.out.println("1-Put money \n" +
                            "2-Withdrawal\n" +
                            "3-Balance inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select the action you want to do : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Amount of money : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print(" Amount of money: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Your Balance : " + balance);
                    }
                } while (select != 4);
                System.out.println("Have nice day.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
            }
        }
    }
}
