public class Main {
    public Main(){
        Car supra = new Car("Toyota Surpa A80", 150000);
        Car rx = new Car("Mazda RX-7", 180000);
        Game cyberpank = new Game("Cyberpank 2077", 40);
        Game wicher = new Game("The Wicher 3: Wild Hunt", 30);
        System.out.println(supra.toString());
        supra.getName();//Nameable
        supra.getPrice();//Priceable
        System.out.println(rx.toString());
        rx.getName();//Nameable
        rx.getPrice();//Priceable
        System.out.println(cyberpank.toString());
        cyberpank.getName();//Nameable
        cyberpank.getPrice();//Priceable
        System.out.println(wicher.toString());
        wicher.getName();//Nameable
        wicher.getPrice();//Priceable
    }



    public static void main(String[] args) {
        new Main();
    }
}
