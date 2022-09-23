public class MMA extends Fighter {

    private boolean canFight=getCanFight();
    private int stamina = getStamina();
    private int experience = getExperience();
    private int kick;
    private int punch;
    private int damage;
    private int number;

    public MMA(String name, int experience, int stamina) {
        super(name, experience, stamina);
    }

    public boolean canFight() {
        if (this.stamina <= 0) {
            this.canFight = false;
            setCanFight(canFight);
        }
        return this.canFight;
    }

    public int attack() {

        this.number = (int) (Math.random() * 2 + 1);

        switch (this.number) {
            case 1:
                this.kick = (int) (Math.random() * 3);
                this.kick *= this.experience;
                this.damage = this.kick;
                break;

            case 2:
                this.punch = (int) (Math.random() * 5);
                this.punch *= this.experience;
                this.damage = this.punch;
                break;
        }
        return this.damage;
    }
}