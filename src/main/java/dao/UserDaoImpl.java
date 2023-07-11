package dao;

import main.java.config.ConnectDB;
import model.User;

import java.sql.*;

// работа с базой данных
public class UserDaoImpl implements UserDao {

    @Override
    public void create(User user) {
        try {
            Connection connection = ConnectDB.connectionToDB();
            String sql = String.format("INSERT INTO users (id, name, age) VALUES(%d, '%s', %d)",
                    user.getId(), user.getName(), user.getAge());

            assert connection != null;

            Statement statement = connection.createStatement();
            statement.execute(sql);

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public User read(int id) {
        try {
            Connection connection = ConnectDB.connectionToDB();

            String sql = String.format("SELECT * FROM users WHERE id = %d", id);
            assert connection != null;

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);


            if (resultSet.next()){
                int UserId = resultSet.getInt("id");
                String UserName = resultSet.getString("name");
                int UserAge = resultSet.getInt("age");

                connection.close();
                return new User(UserId, UserName, UserAge);
            }
            return null;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
