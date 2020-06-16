package proxy;

public class Proxy implements Database{

    Database database;

    public Proxy(Database realDatabase){
        this.database = realDatabase;
    }

    @Override
    public void connectTo(String db) throws Exception {
        if (db.equals("public-db")){
            database.connectTo(db);
        }
        else{
            throw new Exception("not allowed to access");
        }
    }
}
