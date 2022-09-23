package firstweek.hw1;

public class DenklemKok {
    public static void kokler(int a,int b,int c){
        double delta =(b*b)-(4*a*c);
        if(delta>0){
            double x1=((-1*b)-Math.sqrt(delta))/(2*a);
            double x2=((-1*b)+Math.sqrt(delta))/(2*a);
            System.out.println("Kökler: "+x1+" ve "+x2);

        }
        if(delta<0){
            System.out.println("kök yok");

        }
        if(delta==0){
            double x=(-1*b)/(2*a);
            System.out.println("Kök: "+x);
        }
    }
}
