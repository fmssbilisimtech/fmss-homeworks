package backend.secondweek;

import java.util.Scanner;

public class StringAdder {
    public static String getScannedStrings(){
        Scanner scanner = new Scanner(System.in);

        String currentString;
        StringBuilder result = new StringBuilder();
        while (!(currentString = scanner.nextLine()).equals("quit")){
            result.append(currentString);
            result.append("-");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getScannedStrings());
    }
}
