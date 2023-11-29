package task3;

abstract class Furniture {
    protected String type;
    protected int price;

    public Furniture(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public abstract String toString();
    public abstract void buy();
}