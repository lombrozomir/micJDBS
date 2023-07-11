import java.sql.*;

public class MyJDBC extends ConnectDB{

    public MyJDBC() {

    }

    public static void create(String name) {
        String url = ConnectDB.getUrl();
        String username = ConnectDB.getUsername();
        String password = ConnectDB.getPassword();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO users (name) VALUES(?)";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);

            prepareStatement.setString(1, name);
            int rowsInserted = prepareStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Запись успешно добавлена в таблицу.");
            }

            prepareStatement.close();

        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении записи в таблицу.");
            e.printStackTrace();
        }
    }

    public static void read() {
        String url = ConnectDB.getUrl();
        String username = ConnectDB.getUsername();
        String password = ConnectDB.getPassword();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            String sql = "SELECT * FROM users";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + " " + name);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Ошибка при чтении записи из таблицы.");
            e.printStackTrace();
        }
    }

    public static void delete(String url, String username, String password) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            String sql = "DELETE FROM users WHERE name = 'John'";


        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении записи в таблицу.");
            e.printStackTrace();
        }
    }
}
