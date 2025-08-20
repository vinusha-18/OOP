package basicjavaprograms;

    class person{
    	String name;
	
	    person(String name) {
	        this.name = name;
	    }
    	void over() {
    		System.out.println("A person");
    	}
    }
	class Admin extends person {
		    Admin(String name) {
		        super(name);
		    }

		    @Override
		    void over() {
		        System.out.println("Admin Name: "+ name );
		    }
		}

	class Stud extends person {
		    Stud(String name) {
		        super(name);
		    }
		    @Override
		    void over() {
		        System.out.println("Student Name: "+ name);
		    }
		}

		class Faculty extends person {
		    Faculty(String name) {
		        super(name);
		    }
		 @Override  
	    void over() {
	        System.out.println("Faculty Name: "+ name);
	    }
	}


	public class Hierarchy {
	    public static void main(String[] args) {
	        person a = new Admin("Sita");
	        person b = new Stud("Ram");
	        person c = new Faculty("Lucky");
	        a.over();
	        b.over();
	        c.over();
	    }
	}