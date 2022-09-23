package backend.fifthweek.polymorphism.game.soldier;


import backend.fifthweek.polymorphism.game.team.Teams;
import backend.fifthweek.polymorphism.game.tool.abstracts.Tool;
import backend.fifthweek.polymorphism.game.tool.concretes.gun.Gun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soldier implements Cloneable {
    public static final Soldier defaultSoldier = new Soldier(Teams.TEAMLESS,new Gun(),1.0);

    private Teams team;
    private Tool tool;
    double power;

    private Soldier(){}

    Soldier(Teams team, Tool tool, double power){
        this.team = team;
        this.tool = tool;
        this.power = power;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Soldier setTool(Tool tool) {
        this.tool = tool;
        return this;
    }

    public Soldier setTeam(Teams team) {
        this.team = team;
        return this;
    }

    public Soldier setPower(double power){
        this.power = power;
        return this;
    }

    @Override
    public String toString(){
        Pattern patternColor = Pattern.compile("([^@]*)([\\S]*)");
        Matcher matcherColor = patternColor.matcher(super.toString());
        matcherColor.find();

        return new StringBuilder().append(matcherColor.group(2))
                .append(" adresindeki asker: ")
                .append(this.power)
                .append(" gücünde ve ")
                .append(this.tool.getClass().getSimpleName())
                .append(" aletini kullanıyor.")
                .toString();
    }

    public void attack(){
        Teams target = this.team == Teams.TEAM_A ? Teams.TEAM_B : Teams.TEAM_A;

        System.out.printf("%.1f gücünde %s aleti ile %s takımına saldırıyorum !!\n",this.power,this.tool.getClass().getSimpleName(),target.name());
        int damageDone =  (int) Math.round(this.tool.getDamage() * this.power);
        target.setHealth(target.getHealth() - damageDone);
    }
}