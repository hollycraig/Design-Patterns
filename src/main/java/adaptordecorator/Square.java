package adaptordecorator;

public class Square implements Shape2{

    String colour = "blue";
    public String type = "square";

    public void display(){
        System.out.println("I am a " + colour + "square");
    }

    @Override
    public String getShape() {
        return "square";
    }


}
