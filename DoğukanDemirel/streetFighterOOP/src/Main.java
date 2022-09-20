import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ryu r = new Ryu();
        Ken k = new Ken();
        Sagat s = new Sagat();
        ChunLi c = new ChunLi();

        Scanner choice = new Scanner(System.in);
        Scanner pressed = new Scanner(System.in);

        System.out.println("Karakterler :");
        System.out.println("------------------");
        System.out.println("Ryu:1\nKen:2\nSagat:3\nChun-Li:4\n");

        System.out.print("Secim Yapiniz:");
        int choiced =  choice.nextInt();
        System.out.println("Tuş Seçimi Yapiniz");
        int press  = pressed.nextInt();
        switch (choiced){
            case 1:
                System.out.println("Ryu Secildi");
                if(press==1)
                    r.heavyKick();
                if (press == 2)
                    r.lowKick();
                if (press == 3)
                    r.normalKick();
                if (press == 4)
                    r.heavyPunch();
                if (press == 5)
                    r.lowPunch();
                if (press == 6)
                    r.normalPunch();

                break;
            case 2:
                System.out.println("Ken Secildi");
                if (press == 1)
                    k.heavyKick();
                if (press == 2)
                    k.lowKick();
                if (press == 3)
                    k.normalKick();
                if (press == 4)
                    k.heavyPunch();
                if (press == 5)
                    k.lowPunch();
                if (press == 6)
                    k.normalPunch();
                break;
            case 3:
                System.out.println("Sagat Secildi");
                if (press == 1)
                    s.heavyKick();
                if (press == 2)
                    s.lowKick();
                if (press == 3)
                    s.normalKick();
                if (press == 4)
                    s.heavyPunch();
                if (press == 5)
                    s.lowPunch();
                if (press == 6)
                    s.normalPunch();
                break;
            case 4:
                System.out.println("ChunLi Secildi");
                if (press == 1)
                    c.heavyKick();
                if (press == 2)
                    c.lowKick();
                if (press == 3)
                    c.normalKick();
                if (press == 4)
                    c.heavyPunch();
                if (press == 5)
                    c.lowPunch();
                if (press == 6)
                    c.normalPunch();
                break;
            default:
                System.out.println("Hatali giris yaptiniz...");
        }

    }


}
