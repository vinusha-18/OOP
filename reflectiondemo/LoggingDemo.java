package reflectiondemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Loggable {
    String message();
}

class AccountService {
    @Loggable(message="Deposit operation executed")
    public void deposit() {
        System.out.println("Depositing money...");
    }
}

public class LoggingDemo {
    public static void main(String[] args) throws Exception {
        for (Method m : AccountService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Loggable.class)) {
                Loggable log = m.getAnnotation(Loggable.class);
                System.out.println("LOG: " + log.message());
                m.invoke(new AccountService());
            }
        }
    }
}
