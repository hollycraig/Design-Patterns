package factory;

public class Ute implements Vehicle {
    private final String colour;

    public Ute(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "This is a " + colour + " ute.";
    }
}
