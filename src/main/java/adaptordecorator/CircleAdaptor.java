package adaptordecorator;

public class CircleAdaptor extends XXCircle implements Shape2{

    public String type = "circle";

    public String colour = "yellow";

    public void display(){
        super.displayIt();
    }

    @Override
    public String getShape() {
        return "circle";
    }
}
