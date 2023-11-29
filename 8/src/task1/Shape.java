package task1;

import java.awt.*;
import java.lang.*;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int xPos, yPos;

    public Shape(int xPos, int yPos) {
        Random random = new Random();
        this.color = new Color(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256));
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public abstract void draw(Graphics graphics);
}