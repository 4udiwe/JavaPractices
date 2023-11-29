package task3;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Chair chair = new Chair("Chair", 50, 4);
        Table table = new Table("Table", 100, 6, 10);
        shop.addFurniture(chair);
        shop.addFurniture(table);


        shop.displayAllFurniture();

        chair.buy();
        table.buy();
    }

}
