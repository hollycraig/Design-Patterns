package adaptor;

public class NewService {
    public int VALUE = 12;

    private boolean toggled = false;

    public String getDesc(){
        return ("Hey, this is " + toggled);
    }

    public void setToggled(boolean toggled){
        this.toggled = toggled;
    }

    public boolean getToggled(){
        return toggled;
    }

}
