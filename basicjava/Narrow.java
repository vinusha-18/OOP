package basicjavaprograms;
import java.util.*;

public class Narrow {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	
	        double doub = sc.nextDouble();
	        int num= (int) doub;
	        System.out.println("After narrowing to int: "+ num);
	        sc.close();
	    }
	
}
