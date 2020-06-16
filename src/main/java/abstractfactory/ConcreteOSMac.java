package abstractfactory;

public class ConcreteOSMac extends AbstractOS{
    @Override
    public AbstractIDE makeIDE() {
        return new MacIDE();
    }

    @Override
    public AbstractMalware makeMalware() {
        return new MacMalware();
    }
}
