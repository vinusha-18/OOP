package basicjavaprograms;
import java.util.*;

public class Ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("ASCII Value: " + ascii);
    
	
        sc.close();
	}
}

