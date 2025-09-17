package interfaces;
interface Vehicle {
    void start();
    void stop();
    String getFuelType();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with ignition.");
    }

    public void stop() {
        System.out.println("Car stops.");
    }

    public String getFuelType() {
        return "Petrol";
    }
}


class ElectricBike implements Vehicle {
    public void start() {
        System.out.println("Electric bike starts silently.");
    }

    public void stop() {
        System.out.println("Electric bike stops.");
    }

    public String getFuelType() {
        return "Electric";
    }
}



public class Transport_management {
	 public static void main(String[] args) {
	        Vehicle[] vehicles = { new Car(), new ElectricBike() };

	        for (Vehicle v : vehicles) {
	            v.start();
	            System.out.println("Fuel type: " + v.getFuelType());
	            v.stop();
	            System.out.println("------------------");
	        }
	    }
}
