package task3;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Gif extends JFrame implements ActionListener{
    private ArrayList<BufferedImage> frames = new ArrayList<>();
    private int ThisFrameIndex;
    private Timer timer = new Timer(500, this::actionPerformed);
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Image thisFrame = frames.get(ThisFrameIndex);
        graphics.drawImage(thisFrame,0,0,this);
    }
    public void actionPerformed(ActionEvent e) {
        ThisFrameIndex++;
        if (ThisFrameIndex >= frames.size()) {
            ThisFrameIndex = 0;
        }
        repaint();
    }
    public Gif(){
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        try{
            BufferedImage image0 = ImageIO.read(new File("src/1.jpg"));
            BufferedImage image1 = ImageIO.read(new File("src/2.jpg"));
            BufferedImage image2 = ImageIO.read(new File("src/3.jpg"));
            BufferedImage image3 = ImageIO.read(new File("src/4.jpg"));
            BufferedImage image4 = ImageIO.read(new File("src/5.jpg"));
            frames.add(image0);
            frames.add(image1);
            frames.add(image2);
            frames.add(image3);
            frames.add(image4);
            ThisFrameIndex = 0;
            timer.start();
        }
        catch (IOException e) {
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        Gif animation = new Gif();
        animation.setVisible(true);
    }
}
