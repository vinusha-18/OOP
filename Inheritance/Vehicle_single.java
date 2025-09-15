class Vehicle {
    void move() {
        System.out.println("The vehicle is moving");
    }
}


class Car extends Vehicle {
    void fuelType() {
        System.out.println("This car uses petrol or diesel");
    }
}
public class Vehicle_single {
	 public static void main(String[] args) {
	        Car c = new Car();
	        c.move();      
	        c.fuelType();  
	    }
	
}
