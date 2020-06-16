package adaptordecorator;

public class Line implements Shape2{

    String colour = "red";
    public String type = "line";

    public void display(){
        System.out.println("I am a " + colour + "line");
    }

    @Override
    public String getShape() {
        return "line";
    }

}
