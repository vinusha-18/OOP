package reflectiondemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestCase {}

class CalculatorTest {
    @TestCase
    public void testAddition() {
        System.out.println("Test Addition Passed!");
    }

    @TestCase
    public void testSubtraction() {
        System.out.println("Test Subtraction Passed!");
    }

    public void helperMethod() {} // not a test
}

public class TestFramework {
    public static void main(String[] args) throws Exception {
        for (Method m : CalculatorTest.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(TestCase.class)) {
                m.invoke(new CalculatorTest());
            }
        }
    }
}
