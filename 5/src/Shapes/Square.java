package Shapes;

public class Square extends Rectangle{
    public Square(){
        width = length = 0;
        color = "-";
        filled = false;
    }
    public Square(double side){
        width = length = side;
        color = "-";
        filled = false;
    }
    public Square(double side, String color, boolean filled){
        width = length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = length = side;
    }
    public double getArea(){
        return width * length;
    }

    @Override
    public String toString() {
        return "square: side = " + width + ", color = " + color + ", is filled = " + filled;
    }
}
