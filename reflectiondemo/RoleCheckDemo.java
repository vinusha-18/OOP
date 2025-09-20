package reflectiondemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String role();
}

class UserService {
    @RoleAllowed(role="ADMIN")
    public void deleteUser() {
        System.out.println("User deleted!");
    }
}

public class RoleCheckDemo {
    public static void main(String[] args) throws Exception {
        String currentRole = "USER"; // Simulated role

        for (Method m : UserService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed r = m.getAnnotation(RoleAllowed.class);
                if (r.role().equals(currentRole)) {
                    m.invoke(new UserService());
                } else {
                    System.out.println("Access Denied to " + m.getName() + " for role " + currentRole);
                }
            }
        }
    }
}
