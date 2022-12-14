package task1;

public class MovableCircle implements Movable{
    private static int radius = 0;
    private static MovablePoint center;
    MovableCircle(int X, int Y, int XSpeed, int YSpeed, int Radius) {
        center = new MovablePoint(X,Y,XSpeed,YSpeed);
        radius = Radius;
    }

    public static String toStr() {
        return ("Point x = " + Integer.toString(center.getX()) + "\n" + "Point y = " + Integer.toString(center.getY()) + "\n" +
                "Speed Ox = " + Integer.toString(center.getxSpeed()) + "\n" + "Speed Oy = " + Integer.toString(center.getySpeed()) + "\n"
        + "Radius = " + Integer.toString(radius));
    }

    public static int getRadius() {
        return radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown()
    {
        center.moveDown();
    }
    public void moveRight() {
        center.moveRight();
    }

    public void moveLeft()
    {
        center.moveLeft();
    }
}
