package service;

import dao.TrashDaoImpl;

public class TrashServiceImpl implements TrashService{
    private final TrashDaoImpl trashService = new TrashDaoImpl();
    @Override
    public void create() {
        trashService.create();
    }

    @Override
    public void read() {
        trashService.read();
    }

    @Override
    public void update() {
        trashService.update();
    }

    @Override
    public void delete() {
        trashService.delete();
    }

    @Override
    public void createTable() {
        trashService.createTable();
    }

    @Override
    public void deleteTable() {
        trashService.deleteTable();
    }
}
