package task1;

import java.awt.*;

public class shape {
    protected static Color color;
    protected static int[] postion = new int[4];

    public void setColor(Color color) {
        shape.color = color;
    }

    public void setPostion(int[] postion) {
        shape.postion = postion;
    }

    public int[] getPostion() {
        return postion;
    }

    public Color getColor() {
        return color;
    }
}
