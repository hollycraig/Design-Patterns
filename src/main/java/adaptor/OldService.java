package adaptor;

public class OldService implements Service {
    private boolean toggled = false;

    @Override
    public int getValue() {
        return 42;
    }

    @Override
    public void printDescriptiontoSTDOut() {
        System.out.println("Toggle is currently: " + toggled);

    }

    @Override
    public void toggle() {
        toggled = !toggled;

    }
}
