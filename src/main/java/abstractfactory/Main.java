package abstractfactory;

public class Main {
    public static void main(String[] args){
        AbstractOS mac = new ConcreteOSMac();
        AbstractMalware malware = mac.makeMalware();
        AbstractIDE ide = mac.makeIDE();
    }
}
