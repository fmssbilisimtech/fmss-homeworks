package secondweek;

import java.util.Scanner;

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız:
	Açıklamalar:
	- Kullanıcı adı ve şifre 3 kez denenebilecektir
	- 3 kez deneme sırasında doğru giriş yapılırsa "Giriş Başarılı", 3 kez deneme de yanlış olursa
	"Giriş Başarısız. Deneme hakkınız bitti" mesajı verilecektir.
	- Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacacktır
----------------------------------------------------------------------------------------------------------------------*/

public class TaskTen {
    public static void main(String[] args) {
        String username = "alibknc";
        String password = "123abc";
        boolean result = getUserInfo(username, password);
        showResult(result);
    }

    public static boolean getUserInfo(String username, String password){
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 4; i++){
            System.out.print("Kullanıcı adınızı giriniz: ");
            String un = sc.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            String pass = sc.nextLine();

            if(un.equals(username) && pass.equals(password))
                return true;

            System.out.printf("Geçersiz bilgi girildi. Deneme hakkınız: %d%n", 3 - i);
        }

        return false;
    }

    public static void showResult(boolean result){
        if(result)
            System.out.print("Giriş Başarılı!");
        else
            System.out.print("Giriş Başarısız. Deneme hakkınız bitti.");
    }
}
