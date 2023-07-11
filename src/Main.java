import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test_DB";
        String username = "postgres";
        String password = "07032000";

        //create("KolyaPonedelnik", url, username, password);
        MyJDBC.read(url, username, password);


    }


}