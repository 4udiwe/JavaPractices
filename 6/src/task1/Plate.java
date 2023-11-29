package task1;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, int price, int diameter) {
        super(material, price);
        this.diameter = diameter;
    }

    @Override
    public void wash() {
        System.out.println("Washing a plate...");
    }

    @Override
    public String toString() {
        return "task1.Plate{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}