package command;

public class MainDriver {

    public static void Main(String[] args){
        Heater heater = new Heater();
        Invoker invoker = new Invoker();
        invoker.register("on", new SwitchOnCommand(heater));
        doStuff(invoker);
    }

    public static void doStuff(Invoker invoker){
        invoker.execute("on");
    }
}
