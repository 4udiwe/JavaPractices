public class Ball {
    private double size;
    private char color;
    private double posX;
    private double posY;

    public Ball(double size, char color){
        this.size = size;
        this.color = color;
        posX = 0.0;
        posY = 0.0;
    }
    public void setPos(double x, double y){
        posY = y;
        posX = x;
    }
    public void kick(){
        posX += 10;
        posY += 10;
    }
    public String toString(){
        return "Size: " + size + ", color: " + color + ", pos: " + posX + ", " + posY;
    }
}
