package bridge;

public class Plane implements Vehicle {
    private final VehicleSpeed speed;
    private final VehicleEngine engine;

    public Plane(VehicleSpeed speed, VehicleEngine engine) {
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Plane is flying.");
        System.out.println(speed.getSpeedOutput());
        System.out.println(engine.getEngineOutput());
    }
}
