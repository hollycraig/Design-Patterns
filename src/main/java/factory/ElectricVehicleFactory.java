package factory;

public class ElectricVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle makeVehicle(int numPassengers, int numWheels, String colour) {
        if ((numPassengers == 4 || numPassengers == 5) && numWheels == 4) {
            System.out.println("You have selected an electric car");
            return new ElectricCar(numPassengers, colour);
        } else if (numPassengers == 2 && numWheels == 2) {
            System.out.println("You have selected an electric scooter");
            return new Scooter(colour);
        } else {
            System.out.println("Invalid input");
        }
        return null;
    }
}
