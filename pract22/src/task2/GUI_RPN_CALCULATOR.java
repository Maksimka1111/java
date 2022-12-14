package task2;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.EmptyStackException;
import java.util.Stack;

class GUI_RPN_CALCULATOR extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField l;
    String s0, s1, s2;
    GUI_RPN_CALCULATOR()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[])
    {
        f = new JFrame("calculator");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        GUI_RPN_CALCULATOR c = new GUI_RPN_CALCULATOR();
        l = new JTextField(16);
        l.setEditable(false);
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        beq1 = new JButton("=");
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");
        be = new JButton(".");
        JPanel p = new JPanel();
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);
        p.add(l);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(b4);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b0);
        p.add(be);
        p.add(beq1);
        p.add(ba);
        p.add(beq);
        p.setBackground(Color.WHITE);
        f.add(p);
        f.setSize(200, 200);
        f.setVisible(true);
    }
    public static String compute(String expr) throws
            ArithmeticException,
            EmptyStackException {
        Stack<Double> stack = new Stack<>();

        for (String token : expr.split("\\s+")) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default: ;
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        return stack.pop().toString();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.charAt(0)!='=')
        {
            s1+=s.charAt(0);
            s1+=' ';
        }
        if (s.charAt(0) == 'C')
            s1 = "";
        if (s.charAt(0) == '=')
        {
            s2 = s1;
            s1 = compute(s2);
        }
        l.setText(s1);
    }
}