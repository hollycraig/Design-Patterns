package state;

public class OpeningContract implements PackageState {
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
