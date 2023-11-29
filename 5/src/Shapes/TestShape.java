package Shapes;

public class
TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        //System.out.println(shape1.getRadius());

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1.getRadius());

        System.out.println();

        Shape shape2 = new Rectangle(20.0, 10.0, "black", true);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        System.out.println(shape2.isFilled());
        //System.out.println(shape2.getWidth());
        //System.out.println(shape2.getLength());

        Rectangle rectangle1 = (Rectangle) shape2;
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());

        System.out.println();

        Shape shape3 = new Square(15.0, "white",true);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        System.out.println(shape3.isFilled());
        //System.out.println(shpae3.getSide());

        Square square1 = (Square) shape3;
        System.out.println(square1.getSide());
        System.out.println();
        System.out.println(circle1);
        System.out.println(rectangle1);
        System.out.println(square1);
    }
}
