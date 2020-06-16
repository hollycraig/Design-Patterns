package factory;

public class Motorbike implements Vehicle {
    private final String colour;

    public Motorbike(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "This is a " + colour + " motorbike.";
    }
}
