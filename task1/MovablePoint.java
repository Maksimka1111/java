package task1;

public class MovablePoint implements Movable {
    private int x = 0, y = 0, xSpeed = 0, ySpeed = 0;

    public MovablePoint(int X, int Y, int XSpeed, int YSpeed) {
        x = X;
        y = Y;
        xSpeed = XSpeed;
        ySpeed = YSpeed;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public String toStr() {
        return ("Point x = " + Integer.toString(x) + "\n" + "Point y = " + Integer.toString(y) + "\n" +
                "Speed Ox = " + Integer.toString(xSpeed) + "\n" + "Speed Oy = " + Integer.toString(ySpeed) + "\n");
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown()
    {
        y-=ySpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }

    public void moveLeft()
    {
        x-=xSpeed;
    }
}
