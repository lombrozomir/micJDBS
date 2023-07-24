package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectDB {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/test_DB";
    private static final String USERNAME = "postgres";
    private static final String PASS = "07032000";

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
    public BasicDataSource connectDataSource(){
        try {
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName(DRIVER);
            dataSource.setUrl(URL);
            dataSource.setUsername(USERNAME);
            dataSource.setPassword(PASS);

            dataSource.setInitialSize(5);
            dataSource.setMaxTotal(10);

            return dataSource;

        } catch (Exception e) {
            System.out.println("Не удалось загрузить драйвер");
            e.printStackTrace();
            return null;
        }
    }

}

