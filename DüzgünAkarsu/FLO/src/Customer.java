import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private int id;
    private Shoes shoes;

    public Customer(String name, String surname) {
        super(name, surname);
        this.id = DefineId.getDefineCustomerId();

    }

    public void setShoes(Shoes s){
        this.shoes = s;
    }

    public int getId() {
        return id;
    }

    public Shoes getShoes() {
        return shoes;
    }
}
