package state;

public class ItemDelivered implements PackageState {
    @Override
    public PackageState getPreviousState() {
        return null;
    }

    @Override
    public PackageState getNextSate() {
        return null;
    }

    @Override
    public void printState() {

    }
}
