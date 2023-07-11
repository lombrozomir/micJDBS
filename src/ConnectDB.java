public class ConnectDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/test_DB";
    private static final String USERNAME = "postgres";
    private static final String PASS = "07032000";

    public static String getUrl() {
        return URL;
    }

    public static String getUsername() {
        return USERNAME;
    }

    public static String getPassword() {
        return PASS;
    }
}
