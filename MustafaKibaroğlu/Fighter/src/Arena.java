public class Arena {
    public static void main(String[] args){

        Boxer b1=new Boxer("Ali",2,11);
        Karate k1=new Karate("Veli",4,12);
        MMA m1=new MMA("Ahmet",2,11);
        Fight f1=new Fight();
        f1.fight(b1,m1);
    }
}