package Move;

public class TestMove {
    public static void main(String[] args) {
        Movable dot = new MovablePoint(0, 0, 2, 4);
        dot.moveRight();
        dot.moveDown();
        System.out.println(dot);

        System.out.println();

        Movable circ = new MovableCircle(5, 6, 2, 2, 4);
        circ.moveUp();
        circ.moveLeft();
        System.out.println(circ);

        System.out.println();

        Movable rect = new MovableRectangle(2, 7, 6, 5, 1, 1);
        rect.moveDown();
        rect.moveLeft();
        System.out.println(rect);

    }
}
