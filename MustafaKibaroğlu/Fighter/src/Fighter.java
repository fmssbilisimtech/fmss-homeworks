public abstract class Fighter {

    private String name;
    private int experience;
    private int stamina;
    private boolean canFight;

    public Fighter(String name, int experience, int stamina) {
        this.name = name;
        this.experience = experience;
        this.stamina = stamina;
        this.canFight=true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCanFight(){
        return this.canFight;
    }

    public void setCanFight(Boolean canFight){
        this.canFight=canFight;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public abstract boolean canFight();

    public abstract int attack();
}