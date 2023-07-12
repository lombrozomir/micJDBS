package service;

import model.Trash;
import model.User;

public interface UserService {
    void create(User user, Trash trash);
    User read(int id);
    void update(User user);
    void delete(int id);
    void createTable();
    void deleteTable();
}
