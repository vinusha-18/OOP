package basicjavaprograms;

	class Anima {
	    void eat() {
	        System.out.println("Eats food");
	    }
	}

	class Dog extends Anima {
	    void bark() {
	        System.out.println("Dog barks");
	    }
	}

	class Puppy extends Dog {
	    void weep() {
	        System.out.println("Puppy weeps");
	    }
	}

	public class Animal_multi  {
	    public static void main(String[] args) {
	        Puppy pup = new Puppy();
	        pup.eat();   
	        pup.bark();  
	        pup.weep();  
	    }
	}



