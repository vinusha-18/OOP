package basicjavaprograms;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String a = "Java";
		        String b = "Java";
		        String c = new String("Java");

		        System.out.println(a==b); 
		        System.out.println(a==c); 
		        System.out.println(a.equals(c)); 

		        String[] course = {"My","Course","Java"};
		        for (String courses:course) {
		        	System.out.println(courses);
		        }
		    }
		}

