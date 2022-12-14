package task2;

import javax.swing.*;
import java.awt.*;

public class EmployeeView {
    public void printInfo(String name, String post, String salary)
    {
        System.out.println("Employee name: " + name);
        System.out.println("Employee post: " + post);
        System.out.println("Employee salary: " + salary);
    }
    public void printInfoByGUI(String name, String post, String salary)
    {
        JFrame jFrame = new JFrame();
        JTextArea jTextArea = new JTextArea();
        jTextArea.append("Employee name: " + name + "\n");
        jTextArea.append("Employee post: " + post + "\n");
        jTextArea.append("Employee salary: " + salary);
        Font font = new Font("TimesRoman", Font.BOLD, 22);
        jTextArea.setFont(font);
        jFrame.add(jTextArea);
        jFrame.setSize(500,150);
        jFrame.setVisible(true);
    }
}
