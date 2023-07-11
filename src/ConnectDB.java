public class ConnectDB {
    private static final String url = "jdbc:postgresql://localhost:5432/test_DB";
    private static final String username = "postgres";
    private static final String password = "07032000";

    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
