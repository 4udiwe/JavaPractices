package task1;

import java.awt.*;

public class Rectangle extends Shape{
    protected int height;
    protected int length;
    public Rectangle(int xPos, int yPos,int length, int height){
        super(xPos, yPos);
        this.height = height;
        this.length = length;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(xPos, yPos, length, height);
    }
}
