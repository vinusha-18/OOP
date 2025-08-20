package basicjavaprograms;
import java.util.*;

public class Divisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%3==0 && a%5==0){
			System.out.println("Divisible by both 3 and 5");
		}
		else {
			System.out.println("Not divisible by 3 and 5");
		}
		sc.close();
			

	}

}
