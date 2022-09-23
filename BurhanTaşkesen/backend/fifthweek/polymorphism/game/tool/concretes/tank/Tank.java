package backend.fifthweek.polymorphism.game.tool.concretes.tank;

import backend.fifthweek.polymorphism.game.team.Teams;
import backend.fifthweek.polymorphism.game.tool.abstracts.Tool;

public class Tank extends Tool {
    public Tank(){
        super(100);
    }

    public int getDamage(){
        return super.getDamage();
    }
}
