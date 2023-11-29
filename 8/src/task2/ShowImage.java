package task2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ShowImage extends JFrame {
    private BufferedImage image;
    public ShowImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
            setSize(image.getWidth(), image.getHeight());
            setTitle("Nissan 180sx");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
        }
        catch (IOException e) {
            System.exit(1);
        }
    }
    public void paint(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
    }
    public static void main(String[] args) {
        ShowImage app = new ShowImage("src/car.jpeg");
        app.setVisible(true);
    }
}