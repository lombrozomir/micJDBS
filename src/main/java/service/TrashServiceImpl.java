package service;

import dao.TrashDaoImpl;

public class TrashServiceImpl implements TrashService{
    private final TrashDaoImpl trashDao = new TrashDaoImpl();
    @Override
    public void create() {
        trashDao.create();
    }

    @Override
    public void read() {
        trashDao.read();
    }

    @Override
    public void update() {
        trashDao.update();
    }

    @Override
    public void delete() {
        trashDao.delete();
    }

    @Override
    public void createTable() {
        trashDao.createTable();
    }

    @Override
    public void deleteTable() {
        trashDao.deleteTable();
    }
}
