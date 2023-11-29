public class Car implements Nameable, Priceable{
    private String model;
    private int price;
    Car(String name, int price){
        this.model = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public void getName() {
        System.out.println("The model is " + model);
    }
    @Override
    public void getPrice() {
        System.out.println("The price is " + price + "$");
    }
}
