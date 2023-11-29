package task3;

class Table extends Furniture {
    private int length;
    private int width;

    public Table(String type, int price, int length, int width) {
        super(type, price);
        this.length = length;
        this.width = width;
    }
    public void buy(){
        System.out.println("Buying a table...");
    }

    @Override
    public String toString() {
        return "Table{" +
                "length=" + length +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
