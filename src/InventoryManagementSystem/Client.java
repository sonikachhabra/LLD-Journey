package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Item i1 = new Electronics("E1", "Laptop", 500.50, 5, 2);
        Item i2 = new Electronics("E2", "Mobile", 250.00, 10, 1);
        Item i3 = new Electronics("E3", "Television", 700.75, 13, 3);

        Item i4 = new Clothing("C1", "Tshirt", 100.00, 40, "L");
        Item i5 = new Clothing("C2", "Jeans", 400.00, 60, "M");
        Item i6 = new Clothing("C3", "Jacket", 1000.00, 30, "L");

        Item i7 = new Book("B1", "The Alchemist", 150.00, 100, "author1");
        Item i8 = new Book("B2", "Ikigai", 250.00, 500, "author2");

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);
        items.add(i7);
        items.add(i8);

        Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}
