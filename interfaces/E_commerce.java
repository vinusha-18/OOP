package interfaces;
interface Payment {
    void process(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
    public void process(double amount) { System.out.println("Credit card payment: " + amount); }
    public void refund(double amount) { System.out.println("Credit card refund: " + amount); }
}

class UPIPayment implements Payment {
    public void process(double amount) { System.out.println("UPI payment: " + amount); }
    public void refund(double amount) { System.out.println("UPI refund: " + amount); }
}
public class E_commerce {
	public static void main(String[] args) {
        Payment[] payments = { new CreditCardPayment(), new UPIPayment() };

        for (Payment p : payments) {
            p.process(100);
            p.refund(50);
           
        }
    }
}
