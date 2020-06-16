package chain;

public class AuthorisationLayerChainString implements AuthorisationLayer{

    AuthorisationLayer layer = null;

    @Override
    public boolean authenticate(Authorisation authorisation) {
        if (authorisation.getAuthString().equals("let me in")){
            return true;
        }
        return false;
    }

    @Override
    public AuthorisationLayer setNext(AuthorisationLayer layer) {
        this.layer = layer;
        return layer;
    }
}
