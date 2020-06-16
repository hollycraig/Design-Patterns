package bridge;


public class ExampleMainClass {
    public static void main(String[] args) {
        Vehicle vehicle = ExampleMainClass.getAVehicleFromSomewhere();

        vehicle.drive();
    }

    private static Vehicle getAVehicleFromSomewhere() {
        return new Car(new FastSpeed(), new PetrolEngine());
    }
}
