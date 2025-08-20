package basicjavaprograms;
import java.util.*;
	
	class Student{
		String name;
		int Rollno;
		int marks;

			void setter(String name,int Rollno,int marks)
		{
			this.name=name;
			this.Rollno=Rollno;
			this.marks=marks;
			
		}
			
		void getter()
		{
			System.out.println("Name of the Student: " + name);
			System.out.println("Rollno of the Student: " + Rollno);
			System.out.println("Marks of the Student:  " + marks);
			
		}
	}

	public class Details {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Name of Student: ");
		String name=sc.next();
		System.out.println("Rollno: ");
		int Rollno=sc.nextInt();
		System.out.println("Marks of Student: ");
		int marks=sc.nextInt();

		Student st = new Student();
		st.setter(name,Rollno,marks);
		st.getter();
		sc.close();
	}
	}



