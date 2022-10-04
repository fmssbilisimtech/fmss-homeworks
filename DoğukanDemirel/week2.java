import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class drawApp {
    
    
    
    
    public  static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        ArrayList<String> check_teams = new ArrayList<>();
        Random rand = new Random();
        int teamNumber=0;
        int counter;
        int x=0,y=0;
        String teamNames;
        

        Scanner input = new Scanner(System.in);
        System.out.print("Takım Sayısı Giriniz:");
        teamNumber = input.nextInt();
        
        for(int i = 0; i < teamNumber; i++){
            check_teams.add("-");
        }
        
        
        
        if(teamNumber % 2 ==0){
            while (teamNumber>0)
            {
                System.out.print("Takım Girişi Yapınız:");
                teamNames = input.nextLine();
                teams.add(input.next());
                teamNumber--;

            }
        } else{
            System.out.println("Takım sayısı 2'nin katı olmalıdır!\n");
        }
        System.out.println(teams);
        int team1;
        int team2;
        int cont;
        int cont2;
            counter = teams.size();
            for (int i = 0; i < teams.size() / 2 ; i++) {
               
                
                while(true){
                    team1 = rand.nextInt(counter);
                    
                     if(check_teams.get(team1).equals("+") == false){
                        check_teams.set(team1, "+");
                        break;
                    }
                }  
                while(true){
                   team2 = rand.nextInt(counter);
                    
                     if(check_teams.get(team2).equals("+") == false){
                        check_teams.set(team2, "+");
                        break;
                    }
                }  
                
                 System.out.println("Match: " + teams.get(team1) + "-" + teams.get(team2) + "\n" );
                


            }
        }
    }
