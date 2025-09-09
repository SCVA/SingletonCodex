package udmodelos20253.singletoncodex;

/**
 * Representa una conexión a base de datos que utiliza el patrón Singleton.
 */
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private final String host;
    private final String user;
    private final String pass;
    private final String name;
    private final long uniqueIdentificator;

    private DatabaseConnection(String host, String user, String pass, String name) {
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.uniqueIdentificator = System.nanoTime();
    }

    public static synchronized DatabaseConnection getDatabaseConnection(String host, String user, String pass, String name) {
        if (instance == null) {
            instance = new DatabaseConnection(host, user, pass, name);
        }
        return instance;
    }

    public Long getUniqueIdentificator() {
        return uniqueIdentificator;
    }
}
