package task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.math.BigDecimal;
import java.util.concurrent.Flow;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class t3 {
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        JPanel jPanel = new JPanel();
        //jPanel.setLayout();
        JLabel textArea1 = new JLabel("Welcome to SAO");
        textArea1.setFont(new Font("TimesRoman", Font.BOLD, 14));
        JLabel textArea2 = new JLabel("Welcome to UAO");
        textArea2.setFont(new Font("TimesRoman", Font.BOLD, 14));
        JLabel textArea3 = new JLabel("Welcome to CAO");
        textArea3.setFont(new Font("TimesRoman", Font.BOLD, 14));
        JLabel textArea4 = new JLabel("Welcome to ZAO");
        textArea4.setFont(new Font("TimesRoman", Font.BOLD, 14));
        JLabel textArea5 = new JLabel("Welcome to VAO");
        textArea5.setFont(new Font("TimesRoman", Font.BOLD, 14));
        jPanel.add(textArea1,BorderLayout.NORTH);
        jPanel.add(textArea2,BorderLayout.SOUTH);
        jPanel.add(textArea3);
        jPanel.add(textArea4,BorderLayout.WEST);
        jPanel.add(textArea5,BorderLayout.EAST);
        textArea1.setVisible(false);
        textArea2.setVisible(false);
        textArea3.setVisible(false);
        textArea3.setLocation(500,500);
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(180, 90);
        textArea4.setVisible(false);
        textArea5.setVisible(false);
        jPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if (e.getX() < 120 && e.getY() < 500)
                {
                    textArea1.setVisible(false);
                    textArea2.setVisible(false);
                    textArea3.setVisible(false);
                    textArea4.setVisible(true);
                    textArea5.setVisible(false);
                    dialog.add(textArea4);
                    dialog.setVisible(true);
                }
                if (e.getX() > 460 && e.getY() < 500)
                {
                    textArea1.setVisible(false);
                    textArea2.setVisible(false);
                    textArea3.setVisible(false);
                    textArea4.setVisible(false);
                    textArea5.setVisible(true);
                    dialog.add(textArea5);
                    dialog.setVisible(true);
                }
                if (e.getX() < 460 && e.getX()>120 && e.getY() < 500)
                {
                    textArea1.setVisible(false);
                    textArea2.setVisible(false);
                    textArea3.setVisible(true);
                    textArea4.setVisible(false);
                    textArea5.setVisible(false);
                    dialog.add(textArea3);
                    dialog.setVisible(true);
                }
                if (e.getX() > 0 && e.getY() < 60)
                {
                    textArea1.setVisible(true);
                    textArea2.setVisible(false);
                    textArea3.setVisible(false);
                    textArea4.setVisible(false);
                    textArea5.setVisible(false);
                    dialog.add(textArea1);
                    dialog.setVisible(true);
                }
                if (e.getX() > 0 && e.getY() > 500)
                {
                    textArea1.setVisible(false);
                    textArea2.setVisible(true);
                    textArea3.setVisible(false);
                    textArea4.setVisible(false);
                    textArea5.setVisible(false);
                    dialog.add(textArea2);
                    dialog.setVisible(true);
                }
            }
        });
        frame.add(jPanel);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
