import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class num3 {
    private static JFrame frame = new JFrame();
    private static String[] images = new String[10];
    static BufferedImage buttonIcon;
    static int num = 0;

    public static void main(String[] args) throws IOException {
        images[0] = "C:\\Users\\maksz\\IdeaProjects\\pract5\\frame_0_delay-0.06s-0000.jpg";
        images[1] = "C:\\Users\\maksz\\IdeaProjects\\pract5\\frame_1_delay-0.06s-0000.jpg";
        images[2] = "C:\\Users\\maksz\\IdeaProjects\\pract5\\frame_2_delay-0.06s-0000.jpg";
        images[3] = "C:\\Users\\maksz\\IdeaProjects\\pract5\\frame_3_delay-0.06s-0000.jpg";
        int k = 4;
        File file = new File(images[num]);
        buttonIcon = ImageIO.read(file);
        num++;
        JLabel button = new JLabel(new ImageIcon(buttonIcon));
        frame.setVisible(true);
        frame.setSize(700,700);
        while (true)
        {
            try{
                if (num == k) num = 0;
                frame.add(button);
                buttonIcon = ImageIO.read(new File(images[num]));
                num++;
                button.setIcon(new ImageIcon(buttonIcon));
                Thread.sleep(50);}
            catch (Exception e)
            {
                System.out.println(num);
                e.printStackTrace();
            }
        }
    }
}
