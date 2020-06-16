package uow;

public class MainDriver {

    public static void main(String[] args) {
        SlowDatabase database = new SlowDatabase();
        UOWController uow = new UOWController(database);

        Document first = new Document(0, database);
        first.setContents("First document");
        Document second = new Document(1, database);
        second.setContents("Second document");
        Document third = new Document(2, database);
        third.setContents("Third document");
        Document fourth = new Document(3, database);
        fourth.setContents("Fourth document");

        uow.commit();

    }
}