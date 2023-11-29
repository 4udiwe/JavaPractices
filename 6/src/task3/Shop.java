package task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Furniture> furnitureList;

    public Shop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void displayAllFurniture() {
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture);
        }
    }
}
