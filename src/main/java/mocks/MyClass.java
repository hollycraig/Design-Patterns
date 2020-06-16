package mocks;

public class MyClass {
    private MyDependency dependency;

    public MyClass(MyDependency dependency) {
        this.dependency = dependency;
    }

    public String doSomething() {
        String string = this.dependency.getString();
        if (string == null){
            return "was null";
        }
        return string;
    }
}