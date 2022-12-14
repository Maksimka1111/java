package task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class t4 {
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        JMenu file = new JMenu("Color");
        JMenuItem open = new JMenuItem("Blue");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        JMenuItem correction = new JMenuItem("Red");
        correction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        JMenuItem exit = new JMenuItem("Black");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });
        file.add(open);
        file.add(correction);
        file.add(exit);
        JMenu file2 = new JMenu("Font");
        JMenuItem font1 = new JMenuItem("Times New Roman");
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            }
        });
        JMenuItem copy = new JMenuItem("Ms Sans Serif");
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(Font.SERIF, Font.BOLD, 14));
            }
        });
        JMenuItem paste = new JMenuItem("CourierNew");
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier new", Font.BOLD, 14));
            }
        });
        file2.add(font1);
        file2.add(copy);
        file2.add(paste);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(file2);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(menuBar,BorderLayout.NORTH);
        frame.setLayout(new GridLayout(2,1));
        frame.add(panel);
        frame.add(textArea);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
