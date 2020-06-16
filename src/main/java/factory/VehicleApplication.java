package factory;

import java.util.ArrayList;
import java.util.List;

public class VehicleApplication {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static boolean electricity;

    public static void main(String[] args) {
        initMenu();
    }

    private static void initMenu() {
        int selection;

        do {
            selection = ViewUtils.displayMenu("Please select an option",
                    new String[]{
                            "Petrol",
                            "Electricity",
                    },
                    "Please enter a selection");

            switch (selection) {
                case 1:
                    electricity = false;
                    mainMenu();
                    break;
                case 2:
                    electricity = true;
                    mainMenu();
                    break;
                default:
                    // Can't get here
            }
        } while (-1 == selection);
    }

    private static void mainMenu() {
        int selection;

        do {
            selection = ViewUtils.displayMenu("Please select an option",
                    new String[]{
                            "Make a vehicle",
                            "List all vehicles",
                            "Quit",
                    },
                    "Please enter a selection");

            switch (selection) {
                case 1:
                    create();
                    selection = -1;
                    break;
                case 2:
                    listVehicles();
                    selection = -1;
                    break;
                case 3:
                    return;
                default:
                    // Can't get here
            }
        } while (-1 == selection);
    }

    private static void listVehicles() {
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }

    private static void create() {
        int numPassengers = ViewUtils.getInt("How many passengers including the driver should your vehicle fit?");
        int numWheels = ViewUtils.getInt("How many wheels should your vehicle have?");
        String colour = ViewUtils.getString("What colour should your vehicle be?");

        addVehicle(numPassengers, numWheels, colour);
    }
    private static ElectricVehicleFactory electric = new ElectricVehicleFactory();
    private static PetrolVehicleFactory petrol = new PetrolVehicleFactory();
    private static void addVehicle(int numPassengers, int numWheels, String colour) {
        if (electricity) {
            electric.makeVehicle(numPassengers, numWheels, colour);
        } else {
            petrol.makeVehicle(numPassengers, numWheels, colour);
        }
    }
}
