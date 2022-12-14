package task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class t2 {
    static JFrame jFrame = new JFrame();
    static JPanel contents = new JPanel();
    private final static String[] data1 = { "Australia" ,"China"  ,"England","Russia"};
    private final static String[][] dataText = {{"Australia is good"},
            {"China is good"},
            {"England is good"},
            {"Russia is good"}};

    public static void main(String[] args) {
        JList<String> list = new JList<String>(data1);
        JTextArea content = new JTextArea(5, 20);
        // Подключения слушателя
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        // Подключение слушателя мыши
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if ( e.getClickCount() == 2 ) {
                    // Получение элемента
                    int selected = list.locationToIndex(e.getPoint());
                    int i = 0;
                    String txt = "";
                    while (i < dataText[selected].length)
                        txt += dataText[selected][i++] + "\n";
                    content.setText (txt);
                }
            }
        });
        contents.add(new JScrollPane(list));
        contents.add(new JScrollPane(content));
        jFrame.setContentPane(contents);
        jFrame.setSize(450, 180);
        jFrame.setVisible(true);
    }

}
