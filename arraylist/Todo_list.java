package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class Todo_list {
	public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Finish homework");
        toDoList.add("Buy groceries");
        toDoList.add("Call friend");
        System.out.println("First Task: " + toDoList.get(0));
        toDoList.remove("Buy groceries");
        Collections.sort(toDoList);
        System.out.println("Sorted To-Do List: " + toDoList);
        if (toDoList.isEmpty()) {
            System.out.println("No pending tasks!");
        } else {
            System.out.println("You still have work to do!");
        }
    }
}
