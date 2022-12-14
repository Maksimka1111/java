package task2;

public class test {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0,5,10,5,10,10);
        if (rectangle.checkSpeed()) {
            System.out.println(rectangle.toStr());
            rectangle.moveDown();
            rectangle.moveLeft();
            System.out.println();
            System.out.print(rectangle.toStr());
        }
        else System.out.println("???");
    }
}
