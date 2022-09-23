public class Boxer extends Fighter {

    private boolean canFight=getCanFight();
    private int stamina = getStamina();
    private int experience = getExperience();
    private int punch;

    public Boxer(String name, int experience, int stamina) {
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
        this.punch = (int) (Math.random() * 5);
        this.punch *= this.experience;
        return this.punch;
    }
}