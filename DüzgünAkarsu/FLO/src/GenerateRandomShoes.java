import EnumPackage.Age;
import EnumPackage.Brand;

public class GenerateRandomShoes {

    public static void generateRandomShoes(){
        Shoes shoes =null;
        int number =(int) (Math.random()*25)+20;
        int customerId = DefineId.getDefineCustomerId();
        int chooseManOrWomanShoes = (int) (Math.random()*1) +1;

        double price = getRandomPrice();

        Brand brand = getGenerateBrand();
        Age chooseAge = getGenerateAge(price);

        if(chooseManOrWomanShoes == 1){
            shoes = new ManShoes(number, chooseAge,price,brand,customerId);
        }else{
            shoes = new WomenShoes(number, chooseAge ,price,brand,customerId);
        }

        StoreManager.addShoes(shoes);
    }

    private static double getRandomPrice() {
        double price =(Math.random()*900)+100;
        price=(double) ( (int) (price * 100) ) / 100;
        return price;
    }

    private static Brand getGenerateBrand() {
        int brandNumber = (int)(Math.random()*7)+1;
        Brand brand =null;
        for (Brand b : Brand.values()) {
            if(b.getX() == brandNumber){
                brand = b;
            }

        }
        return brand;
    }

    private static Age getGenerateAge(double price) {
        Age chooseAge=null;
        if(price <500){
            chooseAge = Age.CHILD;
        }else{
            chooseAge = Age.ADULT;
        }
        return chooseAge;
    }
}
