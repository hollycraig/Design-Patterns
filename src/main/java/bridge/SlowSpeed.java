package bridge;

public class SlowSpeed implements VehicleSpeed {
    @Override
    public String getSpeedOutput() {
        return "Going kinda slow.";
    }
}
