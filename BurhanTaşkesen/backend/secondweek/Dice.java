package backend.secondweek;

import java.util.Random;

public class Dice {
    public int value;

    public static double matchSimulation(int n){//11
        Dice first = new Dice();
        Dice second = new Dice();

        Random random = new Random();
        double counter = 0.0;
        for (int i = 0; i < n; i++) {
            first.value = random.nextInt(1,7);
            second.value = random.nextInt(1,7);
            if (first.value == second.value)
                counter++;
        }

        return counter/n;
    }

    public static void main(String[] args) {
        System.out.println(matchSimulation(100));
    }
}
