package reflectiondemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotEmpty {}

class Customer {
    @NotEmpty
    String name = "";  // empty to trigger validation
}

public class ValidationDemo {
    public static void main(String[] args) throws Exception {
        Customer c = new Customer();
        for (Field f : Customer.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                String value = (String) f.get(c);
                if (value == null || value.isEmpty()) {
                    System.out.println("Validation Warning: " + f.getName() + " should not be empty!");
                }
            }
        }
    }
}
