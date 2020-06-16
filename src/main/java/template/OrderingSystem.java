package template;

public class OrderingSystem {

    private OrderProcessTemplate processStrategy;

    public OrderingSystem(OrderProcessTemplate strategy) {
        this.processStrategy = strategy;
    }

    public void placeAnOrder() {
        processStrategy.processOrder();
    }

}
