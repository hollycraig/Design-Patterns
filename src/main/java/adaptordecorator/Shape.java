package adaptordecorator;

public class Shape {

    int location;
    String colour;
    String type = "default type";


    public void setLocation(int location){
        this.location = location;
    }

    public int getLocation(){
        return this.location;
    }

    public void display(){
        System.out.println("I am a " + colour + "default shape");
    }

    public void setColour(String colour){
        this.colour = colour;
    }



}
