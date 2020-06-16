package template;

public class CarefulProcessing extends OrderProcessTemplate {

    public void startOrder() {
        System.out.println("Starting order");

    }

    public void addItemsToOrder() {
        System.out.println("Adding items to order");
    }

    public void finaliseOrder() {
        System.out.println("Getting final approval from sales before sending order to warehousing");
    }
}
