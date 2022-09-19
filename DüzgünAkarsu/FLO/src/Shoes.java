import EnumPackage.Age;
import EnumPackage.Brand;


public interface Shoes extends Store{
    int getNumber();
    int getId();
    Age getAge();
    Brand getBrand();


    Customer setcustomer(Customer customer);
    Customer getCustomer();
    double getPrice();
}
