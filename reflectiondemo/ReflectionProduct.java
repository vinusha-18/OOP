package reflectiondemo;

class Product {
    public void showDetails() {
        System.out.println("Product Name: Laptop, Price: $1200");
    }
}

public class ReflectionProduct {
    public static void main(String[] args) {
        try {
            // Load class dynamically
            Class<?> cls = Class.forName("reflectiondemo.Product");

            // Create instance
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Invoke method dynamically
            cls.getMethod("showDetails").invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
