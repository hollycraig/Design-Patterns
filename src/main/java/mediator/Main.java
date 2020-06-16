package mediator;

public class Main {

    public static void main(String[] args){
        AbstractPhoneNetwork network = new Telstra();

        Phone phone = new ConcretePhone(network, "99672431");

        phone.sendSMS("hello", "99671241");

    }

}
