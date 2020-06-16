package template;

public abstract class OrderProcessTemplate {
    abstract void startOrder();

    abstract void addItemsToOrder();

    abstract void finaliseOrder();

    void processOrder(){
        startOrder();
        addItemsToOrder();
        finaliseOrder();
    }
}
