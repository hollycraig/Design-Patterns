package command;

public class SwitchOffCommand {
    private final Heater heater;
    public SwitchOffCommand(Heater heater) {
        this.heater = heater;
    }
    public void execute() {
        heater.turnOff();
    }
}
