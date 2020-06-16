package factory;

public class Scooter implements Vehicle {
    private final String colour;

    public Scooter(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "This is a " + colour + " scooter.";
    }
}
