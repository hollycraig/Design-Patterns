package command;

import java.util.HashMap;

public class Invoker {

    private final HashMap<String, Command> commandHashMap = new HashMap<>();

    public void register(String commandName, Command command){
        commandHashMap.put(commandName, command);
    }

    public void execute(String commandName){
        Command command = commandHashMap.get(commandName);
        if (command == null){
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }
}
