import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(15.5, 'r');
        b1.setPos(100.0, 200.0);
        b1.kick();
        b1.kick();
        System.out.println(b1);
    }

}
