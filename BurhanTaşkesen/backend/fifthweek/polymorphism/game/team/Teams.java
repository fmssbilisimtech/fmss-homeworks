package backend.fifthweek.polymorphism.game.team;

import backend.fifthweek.polymorphism.Main;
import backend.fifthweek.polymorphism.game.soldier.Soldier;

import java.util.ArrayList;

public enum Teams{
    //Tekrar amacıyla enum olarak yazıldı.
    TEAM_A,TEAM_B,TEAMLESS;

    private int health;
    private ArrayList<Soldier> army = new ArrayList<>();

    public void addSoldier(Soldier soldier){
        army.add(soldier);
    }

    public void attackWithSoldierByOrder(int order){
        if(order < Main.TEAM_ARMY_SIZE){
            army.get(order).attack();
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
