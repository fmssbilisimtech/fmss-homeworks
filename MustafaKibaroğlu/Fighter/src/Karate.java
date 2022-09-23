public class Karate extends Fighter {

    private boolean canFight=getCanFight();
    private int stamina = getStamina();
    private int experience = getExperience();
    private int kick;

    public Karate(String name, int experience, int stamina) {
        super(name, experience, stamina);
    }

    public boolean canFight() {
        if (this.stamina <= 0) {
            this.canFight = false;
            setCanFight(this.canFight);
        }
        return this.canFight;
    }

    public int attack() {
        this.kick = (int) (Math.random() * 3);
        this.kick *= this.experience;
        return this.kick;
    }
}