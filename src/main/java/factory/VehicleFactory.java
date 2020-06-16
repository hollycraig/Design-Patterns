package factory;

public interface VehicleFactory {
    Vehicle makeVehicle(int numPassengers, int numWheels, String colour);
}
