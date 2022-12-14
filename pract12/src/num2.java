import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class num2 {
    private static JFrame frame = new JFrame();
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Input way: ");
        String img = s.nextLine();
        BufferedImage image = ImageIO.read(new File(img));
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
