public class Game implements Nameable, Priceable{
    private String name;
    private int price;

    public Game(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void getName() {
        System.out.println("The name of the game is " + name);
    }

    @Override
    public void getPrice() {
        System.out.println("The price is " + price + "$");
    }
}