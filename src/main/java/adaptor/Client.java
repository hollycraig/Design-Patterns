package adaptor;

public class Client {

    private Service service;
    public Client(Service service){
        this.service = service;
    }

    public void useService(){
        service.toggle();
        service.printDescriptiontoSTDOut();
        System.out.println(service.getValue());
    }
}
