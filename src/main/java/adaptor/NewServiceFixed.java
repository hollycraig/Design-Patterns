package adaptor;

public class NewServiceFixed implements Service {

    NewService service;

    public NewServiceFixed(){
        service = new NewService();
    }

    @Override
    public int getValue() {
        return service.VALUE;
    }

    @Override
    public void printDescriptiontoSTDOut() {
        System.out.println("Toggle is currently: " + service.getToggled());

    }

    @Override
    public void toggle() {
        if (service.getToggled() == false){
            service.setToggled(true);
        }
        else{
            service.setToggled(false);
        }

    }
}
