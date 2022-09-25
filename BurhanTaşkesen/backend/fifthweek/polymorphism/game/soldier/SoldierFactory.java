package backend.fifthweek.polymorphism.game.soldier;

import backend.fifthweek.polymorphism.game.tool.concretes.gun.Gun;
import backend.fifthweek.polymorphism.game.tool.concretes.knife.Knife;
import backend.fifthweek.polymorphism.game.tool.concretes.tank.Tank;

import java.util.Random;

public class SoldierFactory {
    public static Soldier getDefaultSoldier() throws CloneNotSupportedException {
        return (Soldier) Soldier.defaultSoldier.clone();
    }
    //Bir tutam da factory
    public static Soldier getMeleeWeakSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Knife()).setPower(.5);
    }

    public static Soldier getMeleeNormalSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Knife()).setPower(1.0);
    }

    public static Soldier getMeleeStrongSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Knife()).setPower(2.0);
    }

    public static Soldier getRangedWeakSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Gun()).setPower(.5);
    }

    public static Soldier getRangedNormalSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Gun()).setPower(1.0);
    }

    public static Soldier getRangedStrongSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Gun()).setPower(2.0);
    }

    public static Soldier getTankyWeakSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Tank()).setPower(.5);
    }

    public static Soldier getTankyNormalSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Tank()).setPower(1.0);
    }

    public static Soldier getTankyStrongSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Tank()).setPower(2.0);
    }

    public static Soldier getRandomSoldier(Random random){
        try {
            int randomNumber = random.nextInt(1,9);
            switch (randomNumber){
                case 1:
                    return getMeleeWeakSoldier();
                case 2:
                    return getMeleeNormalSoldier();
                case 3:
                    return getMeleeStrongSoldier();
                case 4:
                    return getRangedWeakSoldier();
                case 5:
                    return getRangedNormalSoldier();
                case 6:
                    return getRangedStrongSoldier();
                case 7:
                    return getTankyWeakSoldier();
                case 8:
                    return getTankyNormalSoldier();
                case 9:
                    return getTankyStrongSoldier();
            }
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
