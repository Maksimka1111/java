package task;

import java.io.*;

public class pract32 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Order order = new InternetOrder();
        order.add(new Drink(DrinkTypeEnum.Brandy, 25, 100, "desc", "Good Brandy"));
        order.add(new Dish(500, "dish", "desc2"));
        FileOutputStream outputStream = new FileOutputStream("Pract32_test");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(order);
        objectOutputStream.writeObject(new Drink(DrinkTypeEnum.Brandy, 25, 100, "desc", "Good Brandy"));
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("Pract32_test");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Order items = (Order) objectInputStream.readObject();
        System.out.print("Count of items: ");
        System.out.println(items.itemsQuantity());
        System.out.println(items.itemNames()[0]);
        System.out.println(items.itemNames()[1]);
    }
}
