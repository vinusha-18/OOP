package reflectiondemo;

import java.lang.reflect.*;

class Sample {
    private int id;
    public String name;

    public void display() {}
    private void secret() {}
}

public class ReflectionInspector {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("reflectiondemo.Sample");

        System.out.println("Fields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f.getName() + " : " + f.getType());
        }

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName() + " : " + m.getReturnType());
        }

        System.out.println("\nReflection enables runtime introspection, "
                + "allowing inspection and manipulation of classes without knowing them at compile time.");
    }
}
