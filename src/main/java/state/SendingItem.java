package state;

public class SendingItem implements PackageState {
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
