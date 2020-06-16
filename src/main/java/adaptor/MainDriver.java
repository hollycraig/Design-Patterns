package adaptor;

public class MainDriver {
    public static void main(String[] args){
        Client client = new Client(new OldService());
        client.useService();

        Client client2 = new Client(new NewServiceFixed());
        client2.useService();
    }
}
