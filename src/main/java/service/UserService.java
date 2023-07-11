package service;

import model.User;

public interface UserService {
    void create(User user);
    User read(int id);
    void update();
    void delete();
}
