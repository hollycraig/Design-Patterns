package state;

public class ItemTransitioning implements PackageState {

    @Override
    public PackageState getPreviousState() {
        return new SendingItem();
    }

    @Override
    public PackageState getNextSate() {
        return new ItemDelivered();
    }

    @Override
    public void printState() {
        System.out.println("item transitioning");

    }
}
