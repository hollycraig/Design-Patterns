package chain;

public interface AuthorisationLayer {

    boolean authenticate(Authorisation authorisation);

    AuthorisationLayer setNext(AuthorisationLayer layer);
}
