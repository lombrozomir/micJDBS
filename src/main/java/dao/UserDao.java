package dao;

import model.User;

public interface UserDao {
    void create(User user);
    User read(int id);
    void update();
    void delete();
}
