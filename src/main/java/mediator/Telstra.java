package mediator;

import java.util.HashMap;
import java.util.Map;

public class Telstra implements AbstractPhoneNetwork {

    Map<String, Phone> phones = new HashMap<>();

    public void RegisterPhone(Phone phone, String number){
        phones.put(number,phone);
    }

    @Override
    public void sendSMS(String msg, String number) {
        phones.get(number).receiveSMS(msg);
    }


}
