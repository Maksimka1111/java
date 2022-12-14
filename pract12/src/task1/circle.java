package task1;

import java.awt.geom.Ellipse2D;

public class circle extends shape{
    Ellipse2D ellipse2D = new Ellipse2D.Double();
    public Ellipse2D getEllipse2D() {;
        ellipse2D.setFrame(getPostion()[0],getPostion()[1],getPostion()[2],getPostion()[3] );
        return ellipse2D;
    }
}