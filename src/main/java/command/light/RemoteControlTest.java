package command.light;

public class RemoteControlTest {

    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor door = new GarageDoor();
        GarageDoorCommand doorCommand = new GarageDoorCommand(door);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorCommand);
        remote.buttonWasPressed();


    }
}
