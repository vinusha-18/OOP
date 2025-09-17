package interfaces;
interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
}

class SmartLight implements SmartDevice {
    boolean isOn = false;
    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public String getStatus() { return isOn ? "Light ON" : "Light OFF"; }
}

class SmartFan implements SmartDevice {
    boolean isOn = false;
    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public String getStatus() { return isOn ? "Fan ON" : "Fan OFF"; }
}

public class Smarthome {
	 public static void main(String[] args) {
	        SmartDevice[] devices = { new SmartLight(), new SmartFan() };

	        for (SmartDevice d : devices) {
	            d.turnOn();
	            System.out.println(d.getStatus());
	            d.turnOff();
	            System.out.println(d.getStatus());
	            
	        }
	    }
}
