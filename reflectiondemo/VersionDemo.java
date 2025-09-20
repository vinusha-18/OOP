package reflectiondemo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Version {
    String number();
}

@Version(number="1.2")
class ReportGenerator {}

public class VersionDemo {
    public static void main(String[] args) {
        Version v = ReportGenerator.class.getAnnotation(Version.class);
        if (v != null) {
            System.out.println("ReportGenerator Version: " + v.number());
        }
    }
}
