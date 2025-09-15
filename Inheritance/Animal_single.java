package basicjavaprograms;

	class Animal {
	    void eats() {
	        System.out.println("Animal eats food");
	    }
	}

	class Lion extends Animal {
	    void roars() {
	        System.out.println("Lion roars");
	    }
	}
	
	public class Animal_single {
	    public static void main(String[] args) {
	        Lion l= new Lion();
	        l.eats();
	        l.roars();
	    }
	}



