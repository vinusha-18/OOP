package reflectiondemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface APIDescription {
    String description();
}

// Step 2: Apply Annotation
@APIDescription(description = "This is a sample service class")
class Service {
    @APIDescription(description = "Fetch user details")
    public void getUser() {}
}

// Step 3: Reflection Reader
public class AnnotationReader {
    public static void main(String[] args) {
        Class<Service> cls = Service.class;

        // Class-level annotation
        if (cls.isAnnotationPresent(APIDescription.class)) {
            APIDescription api = cls.getAnnotation(APIDescription.class);
            System.out.println("Class Description: " + api.description());
        }

        // Method-level annotation
        for (Method m : cls.getDeclaredMethods()) {
            if (m.isAnnotationPresent(APIDescription.class)) {
                APIDescription api = m.getAnnotation(APIDescription.class);
                System.out.println("Method " + m.getName() + " -> " + api.description());
            }
        }
    }
}
