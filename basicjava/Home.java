package basicjavaprograms;

	class Appliance {
	    void turnOn() {
	        System.out.println("It is on now");
	    }

	    void turnOff() {
	        System.out.println("It is off now");
	    }
	}

	class Fan extends Appliance {
	    void rotate() {
	        System.out.println("Fan is rotating.");
	    }
	}

	class CeilingFan extends Fan {
	    void setSpeed(int s) {
	        System.out.println("Fan speed is " + s);
	    }
	}


public class Home {
	    public static void main(String[] args) {
	        CeilingFan cf = new CeilingFan();
	        cf.turnOn();    
	        cf.rotate();   
	        cf.setSpeed(5); 
	        cf.turnOff();   
	    }
	}



