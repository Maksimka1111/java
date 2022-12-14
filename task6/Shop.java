package task6;

public class Shop implements Printable {
    String thing;
    double price;
    public Shop(String Thing, double Price)
    {
        thing  = Thing;
        price = Price;
    }

    @Override
    public void print() {
        System.out.println("Thing name: " + thing + "\n" + "Price: " + price);
    }
}
