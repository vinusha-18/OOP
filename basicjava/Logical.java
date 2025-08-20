package basicjavaprograms;
import java.util.*;
public class Logical {
	
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	Scanner sc= new Scanner (System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("a (binary): " + toBinary(a));
	System.out.println("b (binary): " + toBinary(b));
	System.out.println(" And operation "+ (a & b) + toBinary(a & b));
	System.out.println(" or operation "+ (a | b) +toBinary(a | b) );
	System.out.println(" xor operation "+ (a ^ b) + toBinary(a ^ b));
	System.out.println(" leftshift operation "+ (a << b) + toBinary(a << b));
	System.out.println(" right operation "+ (a >> b) +toBinary(a >> b));
	sc.close();
	  }

	  private static String toBinary(int i) {
	        String binary = Integer.toBinaryString(i);
	        String padded = String.format("%8s", binary).replace(' ', '0');
	        return "(" + padded + ")";
	  }

	}

