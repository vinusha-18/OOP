package abstractclass1;

abstract class Course {
    abstract void startCourse();
    abstract void endCourse();

    void getCourseDetails() {
        System.out.println("Course details displayed.");
    }

    void giveCertificate() {
        System.out.println("Certificate awarded.");
    }
}

class ProgrammingCourse extends Course {
    void startCourse() { System.out.println("Starting Programming Course..."); }
    void endCourse() { System.out.println("Ending Programming Course."); }
}

class LanguageCourse extends Course {
    void startCourse() { System.out.println("Starting Language Course..."); }
    void endCourse() { System.out.println("Ending Language Course."); }
}

public class ELearningPlatform {
    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse();
        Course c2 = new LanguageCourse();

        c1.startCourse();
        c1.getCourseDetails();
        c1.endCourse();
        c1.giveCertificate();

        c2.startCourse();
        c2.getCourseDetails();
        c2.endCourse();
        c2.giveCertificate();
    }
}
