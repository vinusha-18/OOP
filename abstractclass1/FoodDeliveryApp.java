package abstractclass1;

abstract class FoodOrder {
    abstract double calculateTotal();

    void generateBill() {
        System.out.println("Bill generated successfully.");
    }
}

class RestaurantOrder extends FoodOrder {
    double calculateTotal() {
        System.out.println("Calculating Restaurant Order (GST + Service Charge).");
        return 500.0;
    }
}

class CloudKitchenOrder extends FoodOrder {
    double calculateTotal() {
        System.out.println("Calculating Cloud Kitchen Order (Packaging Fee).");
        return 400.0;
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        FoodOrder order1 = new RestaurantOrder();
        FoodOrder order2 = new CloudKitchenOrder();

        System.out.println("Total: " + order1.calculateTotal());
        order1.generateBill();

        System.out.println("Total: " + order2.calculateTotal());
        order2.generateBill();
    }
}
