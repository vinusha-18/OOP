package arraylist;
import java.util.ArrayList;

public class Product {
	public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(10);
        quantities.add(20);
        quantities.add(15);
        quantities.set(1, 25);
        System.out.println("Product Quantities: " + quantities);
        int total = 0;
        for (int qty : quantities) {
            total += qty;
        }
        System.out.println("Total Quantity: " + total);
        quantities.clear();
        System.out.println("Inventory cleared. Current size: " + quantities.size());
    }
}
