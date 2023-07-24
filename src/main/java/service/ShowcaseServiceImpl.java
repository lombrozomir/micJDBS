package service;

import dao.ShowcaseDaoImpl;

public class ShowcaseServiceImpl implements ShowcaseService {
    private final ShowcaseDaoImpl showcaseDao = new ShowcaseDaoImpl();
    @Override
    public void create() {
        showcaseDao.create();
    }

    @Override
    public void read() {
        showcaseDao.read();
    }

    @Override
    public void update() {
        showcaseDao.update();
    }

    @Override
    public void delete() {
        showcaseDao.delete();
    }

    @Override
    public void createTable() {
        showcaseDao.createTable();
    }

    @Override
    public void deleteTable() {
        showcaseDao.deleteTable();
    }
}
