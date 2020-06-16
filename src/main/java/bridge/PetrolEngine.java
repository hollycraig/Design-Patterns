package bridge;

public class PetrolEngine implements VehicleEngine {
    @Override
    public String getEngineOutput() {
        return "There are petrol fumes spewing out the back.";
    }
}
