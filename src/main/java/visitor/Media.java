package visitor;
//Visitor is about granting the ability to 'double dispatch' - which is something we want to do when we need to do things with an object that for some reason or another we don't want that object to be responsible for.

public interface Media {
    public String getName();
    public void accept(Visitor visitor);
}
