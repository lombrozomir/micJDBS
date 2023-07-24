package service;

import dao.UserDaoImpl;
import model.Trash;
import model.User;
//бизнес логика
public class UserServiceImpl implements UserService {
    private final UserDaoImpl dao = new UserDaoImpl();

    @Override
    public void create(User user, Trash trash) {
        dao.create(user, trash);
    }

    @Override
    public User read(int id) {
        return dao.read(id);
    }

    @Override
    public void update(User user, Trash trash) {
        dao.update(user,trash);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public void createTable() {
        dao.createTable();
    }

    @Override
    public void deleteTable() {
        dao.deleteTable();
    }
}
