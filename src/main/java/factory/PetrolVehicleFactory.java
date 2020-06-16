package factory;

public class PetrolVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle makeVehicle(int numPassengers, int numWheels, String colour) {
        if ((numPassengers == 4 || numPassengers == 5) && numWheels == 4) {
            return new Car(numPassengers, colour);
        } else if (numPassengers == 2 && numWheels == 4) {
            System.out.println("You have selected a ute");
            return new Ute(colour);
        } else if (numPassengers == 2 && numWheels == 2) {
            System.out.println("You have selected a motorbike");
            return new Motorbike(colour);
        } else {
            System.out.println("Invalid input");
            return null;
        }
    }
}
