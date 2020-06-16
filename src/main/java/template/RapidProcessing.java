package template;

public class RapidProcessing extends OrderProcessTemplate {

    public void startOrder() {
        System.out.println("Starting order");
    }

    public void addItemsToOrder() {
        System.out.println("Adding items to order");
    }

    public void finaliseOrder() {
        System.out.println("Assuming order is fine and sending it straight to warehousing");
    }
}