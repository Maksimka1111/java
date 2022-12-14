package task4;

public class Shop implements Priceable {
    double price;
    public Shop(int Price){
        price = Price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
