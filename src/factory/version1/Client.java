package factory.version1;

public class Client {
    public static void main(String[] args) {
        Database db = null;
        Query q;
        if(db instanceof PostgresDatabase)
            q = new PostgresQuery();
        else if(db instanceof MySQLDatabase)
            q = new MySQLQuery();

    }
}
