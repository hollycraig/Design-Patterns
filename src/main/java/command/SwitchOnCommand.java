package command;

/** SwitchOn command */
class SwitchOnCommand implements Command{
    private final Heater heater;
    public SwitchOnCommand(Heater heater) {
        this.heater = heater;
    }
    public void execute() {
        heater.turnOn();
    }
}