package service;

import dao.UserDaoImpl;
import model.User;
//бизнес логика
public class UserServiceImpl implements UserService {
    private final UserDaoImpl dao = new UserDaoImpl();
    @Override
    public void create(User user) {
        dao.create(user);
    }

    @Override
    public User read(int id) {
        return dao.read(id);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
