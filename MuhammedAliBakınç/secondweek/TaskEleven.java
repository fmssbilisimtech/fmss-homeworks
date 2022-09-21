package secondweek;

import java.util.Random;
import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: İki zar atıldığında zarların çift gelmesi (ikisi de aynı) olasılığını yaklaşık hesaplayan
	basit simülasyon programını yazınız
----------------------------------------------------------------------------------------------------------------------*/

public class TaskEleven {
    public static void main(String[] args) {
        int n = getLength();
        int oran = zarAt(n);

        showResult(n, oran);
    }

    public static int getLength(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tekrar yapacaksınız?: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int zarAt(int n){
        Random random = new Random();
        int cift = 0;

        for(int i = 0; i< n; i++){
            int zar1 = 1 + random.nextInt(6);
            int zar2 = 1 + random.nextInt(6);

            if(zar1 == zar2)
                cift++;
        }

        return cift;
    }

    public static void showResult(int n, int result){
        System.out.printf("%d çift zar atışından %d kez aynı sayılar gelmiştir", n, result);
    }
}
