package mocks;

public class MyDependencyImpl implements MyDependency{

    private final String someString;

    public MyDependencyImpl(String someString) {
        this.someString = someString;
    }

    public String getString() {
        return this.someString;
    }
}