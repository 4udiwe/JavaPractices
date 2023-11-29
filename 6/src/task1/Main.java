package task1;

public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Plate("Ceramic", 10, 20);
        System.out.println(dish1);
        dish1.wash();
        System.out.println("----------------------");
        Dish dish2 = new Cup("Glass", 5, 250);
        System.out.println(dish2);
        dish2.wash();
    }
}