package factory;

public class ElectricCar implements Vehicle {
    private final String colour;
    private final int numPassengers;

    public ElectricCar(int numPassengers, String colour) {
        this.numPassengers = numPassengers;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "This is a " + colour + " electric car that can seat " + numPassengers + " passengers.";
    }
}
