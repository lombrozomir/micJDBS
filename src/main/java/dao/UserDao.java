package dao;

import model.Trash;
import model.User;

public interface UserDao {
    void create(User user, Trash trash);
    User read(int id);
    void update(User user);
    void delete(int id);
    void createTable();
    void deleteTable();
}
