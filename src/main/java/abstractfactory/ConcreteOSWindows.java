package abstractfactory;

public class ConcreteOSWindows extends AbstractOS {
    @Override
    public AbstractIDE makeIDE() {
        return new WindowsIDE();
    }

    @Override
    public AbstractMalware makeMalware() {
        return new WindowsMalware();
    }
}
