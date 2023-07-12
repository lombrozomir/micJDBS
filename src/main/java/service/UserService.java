package service;

import model.User;

public interface UserService {
    void create(User user);
    User read(int id);
    void update(User user);
    void delete(int id);
    void createTable();
    void deleteTable();
}
