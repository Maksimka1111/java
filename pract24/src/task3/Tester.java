package task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Tester extends JFrame {
    private ICreateDocument factory = new CreateTextDocument();
    private IDocument idocument;
    private JMenuBar menuBar = new JMenuBar();
    private JFileChooser fileChooser = null;
    public Tester()
    {
        super("Menu");
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private JMenu createFileMenu(){
        fileChooser = new JFileChooser();
        JMenu file = new JMenu("File");

        JMenuItem create = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        JTextArea textArea = new JTextArea(10, 50);
        Tester.this.add(textArea);

        file.add(create);
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);

        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idocument = factory.createNew();
                textArea.setText("");
                Tester.this.add(textArea);
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idocument = factory.createOpen();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (fileChooser.showOpenDialog(Tester.this) == JFileChooser.APPROVE_OPTION ) {
                    File f = fileChooser.getSelectedFile();
                    try {
                        FileReader reader = new FileReader(f);
                        int c = 1;
                        String str = "";
                        while(true)
                        {
                            c = reader.read();
                            if (c == -1) break;
                            str+=(char)c;
                        }
                        textArea.setText(str);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (fileChooser.showSaveDialog(Tester.this) == JFileChooser.APPROVE_OPTION )
                {
                    File f = fileChooser.getSelectedFile();
                    try {
                        FileWriter writer = new FileWriter(f);
                        String str = textArea.getText();
                        writer.write(str);
                        writer.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    JOptionPane.showMessageDialog(Tester.this,
                            "File " + fileChooser.getSelectedFile() + " was saved");
                }
            }

        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return file;
    }

    public static void main(String[] args) {
        new Tester();
    }
}

