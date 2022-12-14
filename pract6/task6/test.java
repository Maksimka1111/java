package task6;

public class test {
    public static void main(String[] args) {
        Book book = new Book("Crime and Punishment", "Dostoevskiy");
        Shop shop = new Shop("Televizor", 100);
        book.print();
        System.out.println();
        shop.print();
    }
}
