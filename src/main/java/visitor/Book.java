package visitor;

public class Book implements Media{
    private String name;
    Book(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}