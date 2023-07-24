package dao;

import config.ConnectDB;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TrashDaoImpl implements TrashDao {
    @Override
    public void create() {

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void createTable() {
        ConnectDB connectDB = new ConnectDB();

        try (BasicDataSource dataSource = connectDB.connectDataSource();
             Connection connection = dataSource.getConnection()) {

            String sql = "CREATE TABLE trash (id INT PRIMARY KEY, UserID int, price int, amountBuy int)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTable() {
        try {
            Connection connection = ConnectDB.connectionToDB();
            assert connection != null;

            String sql = "DROP TABLE trash";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
