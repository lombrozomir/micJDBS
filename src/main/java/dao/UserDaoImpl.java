package dao;

import config.ConnectDB;
import model.Trash;
import model.User;

import java.sql.*;
import java.util.Collection;

// работа с базой данных
public class UserDaoImpl implements UserDao {

    @Override
    public void create(User user, Trash trash) {
        try {
            Connection connection = ConnectDB.connectionToDB();

            String sql = "INSERT INTO users (id, name, age) VALUES (?, ?, ?)";


            assert connection != null;

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setInt(3, user.getAge());
            preparedStatement.executeUpdate();

            String sql1 = "INSERT INTO trash (id, userID, price, amountBuy) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, trash.getId());
            preparedStatement1.setInt(2, user.getId());
            preparedStatement1.setInt(3, trash.getPrice());
            preparedStatement1.setInt(4, trash.getAmountBuy());
            preparedStatement1.executeUpdate();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public User read(int id) {
        try {
            Connection connection = ConnectDB.connectionToDB();

            String sql = "SELECT * FROM users WHERE id = ?";

            assert connection != null;

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();


            if (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String userName = resultSet.getString("name");
                int userAge = resultSet.getInt("age");

                String sql1 = "SELECT * FROM trash WHERE userID = ?";

                PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
                preparedStatement1.setInt(1, id);
                ResultSet resultSet1 = preparedStatement1.executeQuery();

                if (resultSet1.next()){

                    int trashID = resultSet1.getInt("id");
                    int userID = resultSet1.getInt("userID");
                    int price = resultSet1.getInt("price");
                    int amountBuy = resultSet1.getInt("amountBuy");
                    Trash trash = new Trash(trashID,userID,price,amountBuy);

                    connection.close();
                    return new User(userId, userName, userAge, trash);
                }
                Trash trash = new Trash(0,userId,0,0);
                connection.close();
                return new User(userId, userName, userAge, trash);

            }
            return null;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(User user, Trash trash) {
        try {
            Connection connection = ConnectDB.connectionToDB();

            String sql = "UPDATE users SET age = ?, name = ? WHERE id = ?";

            assert connection != null;

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getAge());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setInt(3, user.getId());
            preparedStatement.executeUpdate();

            String sql1 = "UPDATE trash SET price = ?, amountBuy = ? WHERE userID = ?";

            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1,trash.getPrice());
            preparedStatement1.setInt(2,trash.getAmountBuy());
            preparedStatement1.setInt(3,trash.getUserID());
            preparedStatement1.executeUpdate();


            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = ConnectDB.connectionToDB();

            String sql = "DELETE FROM users WHERE id = ?";

            assert connection != null;

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createTable() {

        try {
            Connection connection = ConnectDB.connectionToDB();

            assert connection != null;

            String sql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), age int)";

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

            String sql = "DROP TABLE users";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
