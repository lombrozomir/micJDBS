package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/test_BD";
    private static final String USERNAME = "postgres";
    private static final String PASS = "22051999";

    public static Connection connectionToDB() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASS);
            Class.forName(DRIVER);
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Не удалось загрузить JDBC-драйвер");
            e.printStackTrace();
            return null;
        }
    }
}

