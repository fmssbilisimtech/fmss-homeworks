package secondweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MatchTeams {
    public static void main(String[] args) {
        int teamCount = getTeamCount();
        List<String> teams = getTeams(teamCount);
        List<List<String>> fixture = makeMatch(teams);

        System.out.println("Eşleştirme sonucu: " + fixture);
    }

    public static int getTeamCount(){
        Scanner sc = new Scanner(System.in);
        int teamCount;

        while(true){
            System.out.print("Takım sayısını giriniz: ");
            teamCount = Integer.parseInt(sc.nextLine());

            if(teamCount <= 0 || teamCount % 2 != 0){
                System.out.println("Takım sayısı 0'dan büyük ve çift olmalıdır!");
            } else {
                break;
            }
        }

        return teamCount;
    }

    public static List<String> getTeams(int teamCount){
        Scanner sc = new Scanner(System.in);
        List<String> teams = new ArrayList<>();

        for (int i = 0; i < teamCount; i++){
            System.out.printf("%d. takımı giriniz: ", i+1);
            teams.add(sc.nextLine());
        }

        System.out.println("Girilen takımlar: " + teams);

        return teams;
    }

    public static List<List<String>> makeMatch(List<String> teams){
        Random random = new Random();
        List<List<String>> fixture = new ArrayList<>();

        while (teams.size() != 0){
            List<String> match = new ArrayList<>();

            for(int i = 0; i < 2; i++){
                int index = random.nextInt(0, teams.size());
                match.add(teams.get(index));
                teams.remove(teams.get(index));
            }

            fixture.add(match);
        }

        return fixture;
    }
}
