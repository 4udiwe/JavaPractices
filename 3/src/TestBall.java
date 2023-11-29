public class TestBall {
    public static void main(String args[]){
        Ball b1 = new Ball(5.0, 6.0);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        b1.setXY(12.0, 10.0);
        b1.move(5.0, 1.0);
        System.out.println(b1);
    }

}
