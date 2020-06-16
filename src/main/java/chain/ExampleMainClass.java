package chain;

public class ExampleMainClass {

    public static void main(String[] args) {

        AuthorisationLayer chain = new AuthorisationLayerChainInteger();

        AuthorisationLayer tail;

        tail = chain.setNext(new AuthorisationLayerChainString());
        tail = tail.setNext(new AuthorisationLayerChainBoolean());

        Facade facade = new Facade(chain);

        Authorisation authorisation = new Authorisation(42, "", false);
        facade.doSomething(authorisation);
        //
    }
}