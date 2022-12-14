package task2;

import task1.Movable;
import task1.MovablePoint;

public class MovableRectangle implements Movable {
    private static MovablePoint topLeft;
    private static MovablePoint bottomRight;

    MovableRectangle(int x1,int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public static boolean checkSpeed()
    {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed())
            return true;
        return false;
    }
    public static String toStr() {
        return ("Point x1 = " + Integer.toString(topLeft.getX()) + "\n" + "Point y1 = " + Integer.toString(topLeft.getY()) + "\n" + "Point x2 = " + Integer.toString(bottomRight.getX()) + "\n" + "Point y2 = " + Integer.toString(bottomRight.getY()) + "\n" +
                "Speed Ox = " + Integer.toString(topLeft.getxSpeed()) + "\n" + "Speed Oy = " + Integer.toString(bottomRight.getySpeed()) + "\n"
                );
    }
    public void moveUp() {
        topLeft.moveUp(); bottomRight.moveUp();
    }

    public void moveDown()
    {
        topLeft.moveDown(); bottomRight.moveDown();
    }
    public void moveRight() {
        topLeft.moveRight(); bottomRight.moveRight();
    }

    public void moveLeft()
    {
        topLeft.moveLeft(); bottomRight.moveLeft();
    }
}
