package adaptordecorator;

public class XXCircle {
    int location;

    public void setLocation(int location){
        this.location = location;
    }

    public int getLocation(){
        return this.location;
    }

    public void displayIt(){
        System.out.println("I am a circle");
    }

}
