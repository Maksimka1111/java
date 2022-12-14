package task1;

import java.util.Random;
import javax.swing.*;
import java.awt.*;

import static java.lang.Math.abs;

public class num1 {
    static JFrame frame = new JFrame();
    public static void main(String[] args) {
        frame.setLayout(new GridLayout(5,4));
        for(int i = 0; i<20;i ++)
            frame.add(new MyComponent());
        frame.pack();
        frame.setVisible(true);

    }
}
class MyComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        Random r = new Random();
        int shape = abs(r.nextInt() % 2);
        int[] p = new int[4];
        p[0] = 70;
        p[1] = 10;
        p[2] = 120;
        p[3] = 120;
        if (shape == 0) {
            circle s = new circle();
            s.setPostion(p);
            s.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(s.getColor());
            g2.draw(s.getEllipse2D());
            g2.fill(s.getEllipse2D());
        }
        if (shape == 1) {
            rectangle s = new rectangle();
            s.setPostion(p);
            s.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(s.getColor());
            g2.draw(s.getR());
            g2.fill(s.getR());
        }
    }
}