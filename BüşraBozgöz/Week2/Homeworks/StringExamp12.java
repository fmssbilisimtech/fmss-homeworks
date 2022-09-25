package JavaCourse.Week2.Homeworks;
import java.util.Scanner;
public class StringExamp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.print("Please enter some Strings: ");
        while (true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("stop"))
                break;
            s += input + "-";
        }
        System.out.println(s);
    }
}
