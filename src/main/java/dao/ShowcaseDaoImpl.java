package dao;

import config.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ShowcaseDaoImpl implements ShowcaseDao{
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
        try {
            Connection connection = ConnectDB.connectionToDB();

            assert connection != null;

            String sql = "CREATE TABLE showcase (id INT PRIMARY KEY, cpu VARCHAR(50), price int)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTable() {
        try {
            Connection connection = ConnectDB.connectionToDB();
            assert connection != null;

            String sql = "DROP TABLE showcase";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
