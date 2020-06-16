package visitor;

public class Visitor{
    public void visit(Novel media){
        System.out.println("Visiting a novel");
    }
    public void visit(Book media){
        System.out.println("Visiting a book");
    }
    public void visit(Media media){
        System.out.println("Visiting a media");
    }
}