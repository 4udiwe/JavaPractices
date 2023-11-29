package Move;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, botRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        botRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", botRight=" + botRight +
                '}';
    }
    public void moveUp(){
        topLeft.moveUp();
        botRight.moveUp();
    }
    public void moveDown(){
        topLeft.moveDown();
        botRight.moveDown();
    }
    public void moveRight(){
        topLeft.moveRight();
        botRight.moveRight();
    }
    public void moveLeft(){
        topLeft.moveLeft();
        botRight.moveLeft();
    }
}
