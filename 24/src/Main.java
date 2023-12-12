import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        Drink water = new Drink("Water", "Still water", 10);
        Drink redWine = new Drink("Red wine", "Old red wile", 40);
        Drink whiteWine = new Drink("White wine", "Old white wine", 50);
        Drink beer = new Drink("Beer", "Favourite Dora's drink", 30);
        Drink cola = new Drink("Cola", "Sparkling cola", 20);

        Dish potatoes = new Dish("Potatoes", "mmmmm... potatos", 40);
        Dish pelmeni = new Dish("Pelmeni", "50 pelmenei, wow", 100);
        Dish pizza1 = new Dish("Margoritta", "Pizza Margoritta", 60);
        Dish pizza2 = new Dish("Peperoni", "Peperoni pizza", 60);






        OrderManager manager = new OrderManager();
        ArrayList<String> tables = new ArrayList<String>();
        for (int i = 1; i < 8; i++) {
            tables.add(Integer.toString(i));
        }

        System.out.println("Free tables: " + tables);

        //обычные заказы
        Order order1 = new RestarauntOrder();
        Order order2 = new RestarauntOrder();
        Order order3 = new RestarauntOrder();
        order3.add(pelmeni);
        order3.add(pelmeni);
        //интернет заказы
        Order order4 = new InternetOrder();
        Order order5 = new InternetOrder();
        order5.add(water);
        order5.add(water);
        order5.add(cola);

        //добавление заказа и предметов через менеджера
        String order1Table = "1";
        manager.placeOrder(order1Table, order1);
        tables.remove("1");
        manager.addItem(order1Table, redWine);
        manager.addItem(order1Table, whiteWine);
        manager.addItem(order1Table, pizza1);
        manager.addItem(order1Table, pizza1);


        String order2Table = "3";
        tables.remove("3");
        manager.placeOrder(order2Table, order2);
        manager.addItem(order2Table, water);
        manager.addItem(order2Table, cola);
        manager.addItem(order2Table, pizza1);


        String order3Table = "4";
        tables.remove("4");
        manager.placeOrder(order3Table, order3);

        manager.placeOrder("street 1", order4);
        manager.addItem("street 1", beer);
        manager.addItem("street 1", potatoes);

        manager.placeOrder("street 2", order5);
        try {
            manager.placeOrder("street 2", order5);
        }
        catch (OrderAlreadyAddedException e){
            System.out.println(e.getMessage() + "\n");
        }

        System.out.println("Order 1: " + manager.getOrder("1"));
        System.out.println("Order 2: " + manager.getOrder("3"));
        System.out.println("Order 3: " + manager.getOrder("4"));
        System.out.println("Order 4: " + manager.getOrder("street 1"));
        System.out.println("Order 5: " + manager.getOrder("street 2") + "\n");

        System.out.println("Count water in internet orders: " + manager.getAmountOfDishes("Water")+ "\n");

        System.out.println("All internet orders summary is : " + manager.getAllIternetOrdersCost());

        System.out.println("Free tables: " + tables);
    }
}

