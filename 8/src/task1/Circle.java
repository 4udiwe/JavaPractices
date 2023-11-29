package task1;

import java.awt.*;

public class Circle extends Shape {
    protected int radius;
    public Circle(int xPos, int yPos, int radius){
        super(xPos, yPos);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(xPos, yPos, radius * 2, radius * 2);
    }
}
