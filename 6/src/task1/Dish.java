package task1;

abstract class Dish {
    protected String material;
    protected int price;

    public Dish(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public abstract void wash();

    @Override
    public String toString() {
        return "task1.Dish{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}