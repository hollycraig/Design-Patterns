package mediator;

public class ConcretePhone extends Phone{

    public ConcretePhone(AbstractPhoneNetwork mediator, String phoneNumber) {
        super(mediator, phoneNumber);
    }

    @Override
    public void sendSMS(String msg, String phoneNumber) {
        getMediator().sendSMS(msg, phoneNumber);
    }

    @Override
    public void receiveSMS(String msg) {
        System.out.println("Received msg: " + msg);
    }

}
