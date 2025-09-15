class Person {
    void displayInfo() {
        System.out.println("This is a person");
    }
}


class Student extends Person {
    String studID;

    Student(String id) {
        this.studID = id;
    }

    void displayStudent() {
        System.out.println("Student ID: " +studID);
    }
}

class GraduateStudent extends Student {
    GraduateStudent(String id) {
        super(id);
    }

    void submitThesis() {
        System.out.println("Graduate students submit thesis.");
    }
}
public class Academic_multi {
	public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("123456");
        g.displayInfo();   
        g.displayStudent();
        g.submitThesis();   
    }
}
