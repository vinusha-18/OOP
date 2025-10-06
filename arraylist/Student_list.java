package arraylist;
import java.util.ArrayList;

public class Student_list {

	 public static void main(String[] args) {
	        ArrayList<String> students = new ArrayList<>();
	        students.add("Vinusha");
	        students.add("Sharvani");
	        students.add("Kiran");
	        System.out.println("After adding: " + students);
	        students.add(1, "Pooja");
	        System.out.println("After inserting Pooja: " + students);
	        students.remove("Kiran");
	        System.out.println("After removing Kiran: " + students);
	        System.out.println("Vinusha present? " + students.contains("Vinusha"));
	        System.out.println("Total Students: " + students.size());
	    }
}
