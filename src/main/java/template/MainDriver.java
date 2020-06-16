package template;

public class MainDriver {
    public static void main(String[] args) {
        OrderingSystem system = new OrderingSystem(new RapidProcessing());
        system.placeAnOrder();
        system = new OrderingSystem(new CarefulProcessing());
        system.placeAnOrder();
    }
}
