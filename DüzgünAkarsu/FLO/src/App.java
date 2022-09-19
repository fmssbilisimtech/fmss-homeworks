import java.util.Scanner;

public class App {
    public static Scanner input;


    public static void main(String[] args) {
        selectProduct();

    }

    private static void selectProduct() {
        input = new Scanner(System.in);

        Person person1 = new Person("ahmet", "yılmaz");
        Customer customer1 = new Customer(person1.getName(), person1.getSurname());

        StoreManager.generate();

        Shoes shoes = null;
        int choose = 0;

        do{
            printProductList();

            System.out.println("enter the 0 for exit");
            System.out.print("Please, enter the product id: ");

            choose = Integer.parseInt(input.next());

            if(choose == 0){
                break;
            }
            shoes = printSelectedProduct(choose);

            System.out.println("Do you want to buy the shoes ( Y / N )");
            String s = input.next().toUpperCase();
            if(s.equals("Y") || s.equals("YES")){
                customer1.setShoes(shoes);
                shoes.setcustomer(customer1);

                System.out.println("Would you like to continue shopping? ( Y / N )");
                String s1 = input.next().toUpperCase();

                if( s1.equals("N") || s1.equals("NO")){
                    choose=0 ;
                }

            }
        }
        while(choose != 0);
    }

    private static void printProductList() {
        for (Shoes s :StoreManager.shoesList) {
            System.out.printf("Brand : %10s  - Price : %s  - Shose Id : %s %n",
                    s.getBrand().name(), s.getPrice(),s.getId());
        }
    }

    private static Shoes printSelectedProduct(int choose) {
        Shoes shoes = null;
        System.out.println("---------- selected product information ---------");
        for (Shoes s :StoreManager.shoesList) {
            if(s.getId() == choose){
                shoes = s;
                System.out.printf("Brand : %10s  - Price : %s  - Shose Id : %s %n",
                        shoes.getBrand().name(), shoes.getPrice(),shoes.getId());
            }
        }
        System.out.println("----------------------------------------------");
        return shoes;
    }
}
