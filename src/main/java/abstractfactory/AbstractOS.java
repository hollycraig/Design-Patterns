package abstractfactory;

abstract class AbstractOS {
    public abstract AbstractIDE makeIDE();
    public abstract AbstractMalware makeMalware();
};