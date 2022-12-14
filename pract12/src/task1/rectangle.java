package task1;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class rectangle extends shape{
    Rectangle2D r = new Rectangle2D.Double();

    public Rectangle2D getR() {
        r.setFrame(getPostion()[0],getPostion()[1],getPostion()[2],getPostion()[3]);
        return r;
    }
}
