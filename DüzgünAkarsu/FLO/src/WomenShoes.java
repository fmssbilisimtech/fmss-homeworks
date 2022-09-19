import EnumPackage.Age;
import EnumPackage.Brand;

public class WomenShoes implements Shoes{
    private int number;
    private Age age;
    private double price;
    private Brand brand;
    private int id;

    private Customer customer;

    public WomenShoes(int number, Age age, double price, Brand brand, int id) {
        this.number = number;
        this.age = age;
        this.price = price;
        this.brand = brand;
        this.id = id;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Age getAge() {
        return this.age;
    }

    @Override
    public Brand getBrand() {
        return this.brand;
    }

    @Override
    public Customer setcustomer(Customer customer) {
        this.customer = customer;
        return this.customer;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }


    @Override
    public double getPrice() {
        return this.price;
    }
}
