public class Fight {

    private int damage1;
    private int damage2;
    private int stamina1;
    private int stamina2;
    private boolean canFight1;
    private boolean canFight2;
    private String name1;
    private String name2;


    public void fight(Fighter fighter1, Fighter fighter2) {
        while (fighter1.getCanFight() && fighter2.getCanFight()) {

            damage1 = fighter1.attack();
            damage2 = fighter2.attack();
            stamina1 = fighter1.getStamina();
            stamina2 = fighter2.getStamina();
            name1 = fighter1.getName();
            name2 = fighter2.getName();

            stamina2 -= damage1;

            System.out.println(name1 + " damaged " + damage1 + " and " + name2 + "'s stamina=" + stamina2);

            fighter2.setStamina(stamina2);

            if (stamina2 <= 0) {
                System.out.println("Fighter " + name1 + " won!!");
                break;
            }
            stamina1 -= damage2;
            System.out.println(name2 + " damaged " + damage2 + " and " + name1 + "'s stamina=" + stamina1);
            fighter1.setStamina(stamina1);
            if (stamina1 <= 0) {
                System.out.println("Fighter " + name2 + " won!!");
                break;
            }
        }
    }
}