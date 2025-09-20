package abstractclass1;

abstract class TransportBooking {
    abstract double calculateFare(int distance);

    void bookTicket() {
        System.out.println("Ticket booked successfully.");
    }
}

class BusBooking extends TransportBooking {
    double calculateFare(int distance) {
        return distance * 5; // ₹5 per km
    }
}

class TrainBooking extends TransportBooking {
    double calculateFare(int distance) {
        return distance * 3; // ₹3 per km
    }
}

class FlightBooking extends TransportBooking {
    double calculateFare(int distance) {
        return distance * 10 + 500; // base + per km
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        TransportBooking bus = new BusBooking();
        TransportBooking train = new TrainBooking();
        TransportBooking flight = new FlightBooking();

        bus.bookTicket();
        System.out.println("Bus Fare: " + bus.calculateFare(50));

        train.bookTicket();
        System.out.println("Train Fare: " + train.calculateFare(100));

        flight.bookTicket();
        System.out.println("Flight Fare: " + flight.calculateFare(200));
    }
}
