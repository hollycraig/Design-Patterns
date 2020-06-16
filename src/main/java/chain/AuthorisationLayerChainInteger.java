package chain;

public class AuthorisationLayerChainInteger implements AuthorisationLayer {

    AuthorisationLayer layer = null;

    @Override
    public boolean authenticate(Authorisation authorisation) {
        if (authorisation.getAuthNumber() == 42){
            return true;
        }
        if (layer != null){
            layer.authenticate(authorisation);
        }
        return false;
    }

    @Override
    public AuthorisationLayer setNext(AuthorisationLayer layer) {
        this.layer = layer;
        return layer;
    }
}
