package basicjavaprograms;
interface Plan {
    double calculateBill(int units);
}


class DomesticPlan implements Plan {
    private final double rate = 3.50;
    @Override
    public double calculateBill(int units) {
        return units * rate;
    }
}


class CommercialPlan implements Plan {
    private final double rate = 5.75;
    @Override
    public double calculateBill(int units) {
        return units * rate;
    }
}


class IndustrialPlan implements Plan {
    private final double rate = 6.25;
    @Override
    public double calculateBill(int units) {
        return units * rate;
    }
}

class PlanFactory {
    Plan createPlan(String type) {
        if (type.equalsIgnoreCase("domestic")) {
            return new DomesticPlan();
        } else if (type.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        } else if (type.equalsIgnoreCase("industrial")) {
            return new IndustrialPlan();
        } else {
            throw new IllegalArgumentException("Unknown plan type.");
        }
    }
}


public class Power {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();

        Plan domestic = factory.createPlan("domestic");
        Plan commercial = factory.createPlan("commercial");
        Plan industrial = factory.createPlan("industrial");

        System.out.println("Domestic Bill (350 units): ₹" + domestic.calculateBill(350));
        System.out.println("Commercial Bill (1200 units): ₹" + commercial.calculateBill(1200));
        System.out.println("Industrial Bill (7500 units): ₹" + industrial.calculateBill(7500));
    }
}
