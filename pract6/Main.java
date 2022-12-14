import task6.Book;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        stringBuilder.append(13);
        StringBuffer b = new StringBuffer();
        b.append(1);
        b.append(2);
        b.append(3);
        int a = 1;
        int g = 3;
        stringBuilder.append(b,a,g);
        stringBuilder.delete(stringBuilder.length() - (g-a),stringBuilder.length());
        System.out.println(stringBuilder.toString());
    }
}