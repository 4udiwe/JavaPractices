package task3;

class Chair extends Furniture {
    private int height;

    public Chair(String type, int price, int height) {
        super(type, price);
        this.height = height;
    }
    public void buy(){
        System.out.println("Buying a chair...");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", price=" + price +
                '}';
    }
}

