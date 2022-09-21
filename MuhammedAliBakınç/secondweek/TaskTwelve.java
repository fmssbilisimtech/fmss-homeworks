package secondweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden quit girilene kadar alınan yazıların arasında - karakteri olacak şekilde
	birleştirilmiş bir String oluşturan programı yazınız.
	Örnek:
	ankara, istanbul, izmir girilirse
	ankara-istanbul-izmir
----------------------------------------------------------------------------------------------------------------------*/

public class TaskTwelve {
    public static void main(String[] args) {
        List<String> cities = getCities();
        String text = citiesToString(cities);

        System.out.println(text);
    }

    public static List<String> getCities(){
        Scanner sc = new Scanner(System.in);
        List<String> cities = new ArrayList<>();

        while (true) {
            System.out.print("Bir şehir giriniz: ");
            String line = sc.nextLine();
            if(line.equals("quit"))
                break;

            cities.add(line);
        }

        return cities;
    }

    public static String citiesToString(List<String> cities){
        String text = "";

        for (int i = 0; i < cities.size(); i++) {
            text = text.concat(cities.get(i));

            if (i != cities.size() - 1)
                text = text.concat("-");
        }

        return text;
    }
}
