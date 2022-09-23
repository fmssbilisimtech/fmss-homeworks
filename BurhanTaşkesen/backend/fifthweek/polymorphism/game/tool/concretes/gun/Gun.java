package backend.fifthweek.polymorphism.game.tool.concretes.gun;


import backend.fifthweek.polymorphism.game.team.Teams;
import backend.fifthweek.polymorphism.game.tool.abstracts.Tool;

public class Gun extends Tool {
    public Gun(){
        super(50);
    }

    public int getDamage(){
        return super.getDamage();
    }
}
