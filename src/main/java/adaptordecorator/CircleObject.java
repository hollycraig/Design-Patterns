package adaptordecorator;

public class CircleObject extends Shape{
    private XXCircle circle;

    public CircleObject(){
        circle = new XXCircle();
    }

    public void display(){
        circle.displayIt();
    }
}
