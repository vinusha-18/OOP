class Appliance {
    void turnOn() {
        System.out.println("Appliance is now ON.");
    }

    void turnOff() {
        System.out.println("Appliance is now OFF.");
    }
}


class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating.");
    }
}


class CeilingFan extends Fan {
    void setSpeed(int level) {
        System.out.println("Ceiling fan speed set  " + level);
    }
}
public class Smarthome_multi {
	 public static void main(String[] args) {
	        CeilingFan c = new CeilingFan();
	        c.turnOn();   
	        c.rotate();    
	        c.setSpeed(5); 
	        c.turnOff();   
	    }
}
