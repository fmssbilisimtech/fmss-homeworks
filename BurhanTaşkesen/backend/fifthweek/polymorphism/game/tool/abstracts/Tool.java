package backend.fifthweek.polymorphism.game.tool.abstracts;

import backend.fifthweek.polymorphism.game.team.Teams;

abstract public class Tool {
    protected int damage;
    protected Tool(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
}
