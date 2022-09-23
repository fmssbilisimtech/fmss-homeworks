package backend.fifthweek.polymorphism;


import backend.fifthweek.polymorphism.game.soldier.SoldierFactory;
import backend.fifthweek.polymorphism.game.team.Teams;

import java.util.Random;

public class Main {
    public static final int TEAM_ARMY_SIZE = 3;
    public static final int TEAM_HEALTH = 1000;
    public static final int MOVE_DELAY = 1000;

    public static void main(String[] args) throws CloneNotSupportedException {
        startGame();

        System.out.println("\nFMSS Bootcamp 2022");
    }

    public static void startGame(){
        initTeamHealts();
        fillTeams();
        startBattle();
    }

    private static void startBattle() {
        Random random = new Random();
        new Thread(){
            @Override
            public void run() {
                Teams a = Teams.TEAM_A; //debug mode
                Teams b = Teams.TEAM_B; //debug mode

                for (boolean moveFirstTeam = true; Teams.TEAM_B.getHealth() > 0 && Teams.TEAM_A.getHealth() > 0; moveFirstTeam = !moveFirstTeam) {
                    Teams whoIsNext = moveFirstTeam ? Teams.TEAM_A : Teams.TEAM_B;
                    int soldierOrder = random.nextInt(TEAM_ARMY_SIZE);
                    whoIsNext.attackWithSoldierByOrder(soldierOrder);

                    try {
                        Thread.sleep(MOVE_DELAY);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.printf("TEAM_A : %d , TEAM_B : %d\n",Teams.TEAM_A.getHealth(),Teams.TEAM_B.getHealth());
                }

                Teams winner = Teams.TEAM_A.getHealth() > 0 ? Teams.TEAM_A : Teams.TEAM_B;
                System.out.printf("\n%s oyunu kazandı !!", winner.name());
            }
        }.start();
    }

    private static void fillTeams() {
        Random random = new Random();

        for (int i = 0; i < Teams.values().length-1; i++) { //Son takım "teamless olduğu için length-1
            for (int j = 0; j < TEAM_ARMY_SIZE; j++) {
                Teams.values()[i].addSoldier(SoldierFactory.getRandomSoldier(random).setTeam(Teams.values()[i]));
            }
        }
    }

    public static void initTeamHealts(){
        for (Teams value : Teams.values()) {
            value.setHealth(TEAM_HEALTH);
        }
    }
}

