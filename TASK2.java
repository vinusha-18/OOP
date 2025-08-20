package basicjavaprograms;
import java.util.*;
class Sub {
    private String id;
    private String name;

    public Sub(String id,String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getSubName() {
        return name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

class Students {
    private String name;
    private Sub[] enrolledSubs;
    private int count;

    public Students(String name) {
        this.name = name;
        this.enrolledSubs =new Sub[5];
        this.count = 0;
    }

    public void enroll(Sub sub) {
        if (isAlreadyEnrolled(sub)) {
            System.out.println(name + " is already enrolled in " + sub.getSubName());
            return;
        }

        if (count < enrolledSubs.length) {
            enrolledSubs[count++] = sub;
            System.out.println(name + " enrolled in " + sub.getSubName());
        } else {
            System.out.println("Cannot enroll, subject limit reached.");
        }
    }

    private boolean isAlreadyEnrolled(Sub sub) {
        for (int i = 0; i < count; i++) {
            if (enrolledSubs[i].getId().equals(sub.getId())) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("Enrolled by " + name + ":");
        if (count == 0) {
            System.out.println(" - No enrollment.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + enrolledSubs[i]);
        }
    }
}

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sub s1 = new Sub("24SC2006","OOPS");
        Sub s2 = new Sub("24CS2101","OS");
        Sub s3 = new Sub("24AD2103","DBMS");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        Students student = new Students(name);

        while (true) {
            System.out.println("\nCourse Menu");
            System.out.println("1. Enroll in OOPS");
            System.out.println("2. Enroll in OS");
            System.out.println("3. Enroll in DBMS");
            System.out.println("4. View Enrolled Subjects");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    student.enroll(s1);
                    break;
                case 2:
                    student.enroll(s2);
                    break;
                case 3:
                    student.enroll(s3);
                    break;
                case 4:
                    student.display();
                    break;
                case 5:
                    System.out.println("Thank you for enrolling.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}


