package task1;

class Cup extends Dish {
    private int volume;

    public Cup(String material, int price, int volume) {
        super(material, price);
        this.volume = volume;
    }

    @Override
    public void wash() {
        System.out.println("Washing a cup...");
    }

    @Override
    public String toString() {
        return "task1.Cup{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}