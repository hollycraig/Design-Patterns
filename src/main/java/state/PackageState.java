package state;

public interface PackageState {

    PackageState getPreviousState();

    PackageState getNextSate();

    void printState();
}
