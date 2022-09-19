import EnumPackage.Brand;

import java.util.ArrayList;
import java.util.List;

public class StoreManager {


    public static  List<Shoes> shoesList = new ArrayList<>();

    public static void generate(){
        for (int i = 0; i < 50; i++) {
            GenerateRandomShoes.generateRandomShoes();
        }
    }
    public static void addShoes(Shoes shoes){
        shoesList.add(shoes);
    }




}
