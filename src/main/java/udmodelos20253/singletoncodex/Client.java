package udmodelos20253.singletoncodex;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getDatabaseConnection("localhost", "root", "root", "test");
        DatabaseConnection db2 = DatabaseConnection.getDatabaseConnection("localhost", "root", "root", "test");

        System.out.println("Identificador instancia 1: " + db1.getUniqueIdentificator());
        System.out.println("Identificador instancia 2: " + db2.getUniqueIdentificator());
        System.out.println("Misma instancia: " + (db1 == db2));
    }
}
