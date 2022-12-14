package task12;

public class test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder2 undoStringBuilder = new StringBuilder2(stringBuilder);
        undoStringBuilder.append(100);
        System.out.println(undoStringBuilder.toString());
        undoStringBuilder.undo();
        undoStringBuilder.append("zdraste");
        System.out.print(undoStringBuilder.toString());
    }
}
