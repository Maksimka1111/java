package task3;

import javax.swing.*;
import java.awt.*;

public class t3 {
    static JFrame jFrame = new JFrame();
    static JMenu jMenu = new JMenu();
    public static void main(String[] args) {
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Save");
        JMenuItem correction = new JMenuItem("Correction");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(correction);
        file.addSeparator();
        file.add(exit);
        JMenu file2 = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem insert = new JMenuItem("Insert");
        file2.add(copy);
        file2.add(paste);
        file2.add(insert);
        JMenu file3 = new JMenu("Help");
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(file2);
        menuBar.add(file3);
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        button1.setSize(50,50);
        button2.setSize(50,50);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        JLabel label = new JLabel();
        label.setLayout(new GridLayout(1,2));
        label.add(button1);
        label.add(button2);
        JTextArea jTextArea = new JTextArea("There u can write text");
        jPanel.setLayout(new BorderLayout());
        jPanel.add(menuBar,BorderLayout.NORTH);
        jFrame.setLayout(new GridLayout(3,1));
        jFrame.add(jPanel);
        jFrame.add(label);
        jFrame.add(jTextArea);
        jFrame.setSize(450, 180);
        jFrame.setVisible(true);
    }
}
