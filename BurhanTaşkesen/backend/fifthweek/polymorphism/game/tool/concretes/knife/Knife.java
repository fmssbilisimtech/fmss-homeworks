package backend.fifthweek.polymorphism.game.tool.concretes.knife;

import backend.fifthweek.polymorphism.game.team.Teams;
import backend.fifthweek.polymorphism.game.tool.abstracts.Tool;

public class Knife extends Tool {
    public Knife(){
        super(10);
    }

    public int getDamage(){
        return super.getDamage();
    }
}
