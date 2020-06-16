package command.light;

public class GarageDoorCommand implements Command{

    GarageDoor door;

    public GarageDoorCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {

    }
}
