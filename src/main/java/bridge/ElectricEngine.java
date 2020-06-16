package bridge;

public class ElectricEngine implements VehicleEngine {
    @Override
    public String getEngineOutput() {
        return "There is a quiet hum.";
    }
}
