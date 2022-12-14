package task1;

public class test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0,0,5,10,50);
        System.out.println(circle.toStr());
        circle.moveUp();
        circle.moveRight();
        System.out.println();
        System.out.print(circle.toStr());
    }
}
