package task10;

public class test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(Computer.Asus);
        System.out.println(shop.search(Computer.Asus));
        System.out.println(shop.delete(Computer.Asus));
        shop.add(Computer.DELL);
        System.out.println(shop.search(Computer.Asus));
    }
}
