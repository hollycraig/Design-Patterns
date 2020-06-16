package visitor;

public class Novel extends Book{
    Novel(String name){
        super(name);
    }

    public String getName(){
        return new String("aaaabbb");
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}