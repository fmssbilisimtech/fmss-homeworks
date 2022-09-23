package backend.secondweek;

public class NumberUtil {
    public static int getDigitNums(int x){
        //Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren getDigitsCount isimli
        //	metodu NumberUtil isimli bir sınıfın içerisinde yazınız ve klavyeden alınan değerlerle çağırarak test ediniz


//        //birinci alternatif
//        if(x < 0){
//            x*=-1;
//        }else if(x == 0){
//            return 1;
//        }
//
//
//
//        while (x>0){
//            x/=10;
//            counter++;
//        }
//        return counter;


        if(x < 0)
            x*=-1;

        int counter = 0;
        do {
            counter++;
        }while ((x/=10)>0);

        return counter;
    }//1

    public static int getReverse(int x){
        //Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren getReverse isimli metodu
        //	yazınız ve test ediniz. Örneğin -123 sayısı için metot -321 sayısını döndürecektir
        //	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321

        if(x<0)
            x*=-1;

        int tmp = 0;

        while (x>0){
            tmp = (tmp*10) + x%10;
            x/=10;
        }

        return tmp;
    }//2

    public static int pow(int base, int exp){
        //Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren
        //	pow isimli metodu yazınız.
        //	Açıklamalar:
        //	- Math sınıfının pow metodu kullanılmayacaktır
        //	- Metot b nin negatif değerleri için 1 değerini döndürecektir
        //	- Metot NumberUtil sınıfı içerisinde yazılacaktır


        int result = 1;

        if(exp < 0)
            return result;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;


//        //alternatif
//        int result = 1;
//
//        if(exp <= 0)
//            return result;
//
//        if(exp == 1){
//            return base;
//        }else {
//            return base * pow(base,exp-1);
//        }
    }//3

    public static boolean isArmstrong(int x){
        //Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden
        //	isArmstrong metodunu yazınız ve test ediniz.
        //	Açıklamalar:
        //	- Bir sayının her basamağının basamak sayıncı kuvvetleri toplamı sayının kendisine eşitse bu sayıya Armstrong
        //	sayısı denir
        //	153 -> 1 + 125 + 27 = 153
        //	- Sayı negatif ise false döndürebilirsiniz

        if(x<0)
            return false;

        int sum = 0;
        int originalNum = x;
        int digitNum = NumberUtil.getDigitNums(x);

        while (x > 0){
            sum += NumberUtil.pow(x%10,digitNum);
            x /= 10;
        }

        return sum == originalNum ? true : false;
    }//4

    public static int factorial(int x){
        //Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyelini döndüren factorial isimli
        //	metodu yazınız ve test ediniz.
        //	Açıklamalar:
        //	- Metot negatif sayılar için -1 değerini döndürecektir
        //	- Faktoriyel tanımı:
        //		0!= 1
        //		1!=1
        //		2!=1*2
        //		...
        //		n!=1 * 2 * ...* (n - 1) * n
        //	- Sınır taşması gözardı edilecektir




//          //alternatif
//        if(x < 0)
//            return -1;
//        if (x == 1)
//            return 1;
//
//        return x * factorial(x-1);

        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }//5






    public static void main(String[] args) {
        int num = 1904;

        System.out.printf("Number : " + num + "\n\n");

        System.out.printf("Number of digits : %d\n",NumberUtil.getDigitNums(num)); //1

        System.out.printf("Reverse number : %d\n",NumberUtil.getReverse(num)); //2

        System.out.printf("Pow number,exp : %d\n",NumberUtil.pow(num,2)); //3

        System.out.printf("is number Armstrong ? : %b\n",NumberUtil.isArmstrong(num)); //4

        System.out.printf("Number factorial : %d\n",NumberUtil.factorial(num)); //5

    }
}
