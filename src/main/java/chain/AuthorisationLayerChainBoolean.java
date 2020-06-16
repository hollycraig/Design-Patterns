package chain;

public class AuthorisationLayerChainBoolean implements AuthorisationLayer {

    AuthorisationLayer layer = null;

    @Override
    public boolean authenticate(Authorisation authorisation) {
        if (authorisation.isAuthBool()){
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
