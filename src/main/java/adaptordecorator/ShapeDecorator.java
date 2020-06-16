package adaptordecorator;

public class ShapeDecorator implements Shape2 {

    Shape2 shape;
    String colour = "A CRAZY COLOUR";

    public ShapeDecorator(Shape2 shape){
        this.shape = shape;

    }

    @Override
    public void display() {
        System.out.println("I am a " + colour + " " + shape.getShape());
    }

    @Override
    public String getShape() {
        return shape.getShape();
    }
}
