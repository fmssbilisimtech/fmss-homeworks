package backend.secondweek.match_teams;

import java.time.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class League {//ekstra
    public ArrayList<String> teams;

    public void firstShuffleAlgorithm(){
        ArrayList<String> shuffled = new ArrayList<>();

        Random random = new Random();
        int randomTeamPlace;
        while(teams.size() > 0){
            //O(n) ??
            randomTeamPlace = random.nextInt(0,teams.size());
            String randomTeam = teams.get(randomTeamPlace);

            shuffled.add(randomTeam);
            teams.remove(randomTeam);
        }
        teams = shuffled;
    }

    public void secondShuffleAlgorithm(){
        Random random = new Random();
        int randomTeamPlace;
        int replacement = 0;
        int firstSize = teams.size();
        while(firstSize > replacement){
            //O(n*n) ??
            //yeni bir nesne oluşturulmadı.
            randomTeamPlace = random.nextInt(0,firstSize-replacement);
            String randomTeam = teams.get(randomTeamPlace);

            teams.add(randomTeam);

            for (int i = 0; i < firstSize; i++) {
                if(teams.get(i).equals(randomTeam)){
                    teams.remove(teams.get(i)); //if(teams.get(x).equals("....")
                    replacement++;
                    break;
                }
            }
        }
    }


    public void shuffleTeams(){
        secondShuffleAlgorithm();
    }

    public HashMap<String,String> getMatchedTeams(){
        HashMap<String,String> matchedTeams = new HashMap<>();

        for (int i = 0; i < teams.size()/2; i++) {
            matchedTeams.put(teams.get(i),teams.get(i+1));
        }

        return matchedTeams;
    }

    public void printMatchedTeams(){
        for (int i = 0; i < teams.size(); i+=2) {
            System.out.printf("%d. match  ===>  \"%s\" vs \"%s\"\n",i/2+1,teams.get(i),teams.get(i+1));
        }
    }

    public static ArrayList<String> getSampleList(){
        ArrayList<String> sampleList = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            sampleList.add("Team " + (i+1));
        }
        return sampleList;
    }

    public static void main(String[] args) {
        long before = Clock.systemDefaultZone().millis(); //measure elapsed time



        League league = new League();

        league.teams = League.getSampleList(); //create new reference

        league.shuffleTeams(); //shuffle teams

        league.printMatchedTeams(); //print matched teams



        System.out.printf("\n\n\n");
        long after = Clock.systemDefaultZone().millis();
        System.out.println("Elapsed time : " + (after-before) + " ms");
    }
}


