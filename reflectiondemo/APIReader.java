package reflectiondemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface APIInfo {
    String endpoint();
    String method();
}

// Step 2: Apply Annotation
class UserAPI {
    @APIInfo(endpoint="/users", method="GET")
    public void getUsers() {}

    @APIInfo(endpoint="/users", method="POST")
    public void createUser() {}
}

// Step 3: Reflection Reader
public class APIReader {
    public static void main(String[] args) {
        Method[] methods = UserAPI.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(APIInfo.class)) {
                APIInfo info = m.getAnnotation(APIInfo.class);
                System.out.println("Endpoint: " + info.endpoint() + " | Method: " + info.method());
            }
        }
    }
}
