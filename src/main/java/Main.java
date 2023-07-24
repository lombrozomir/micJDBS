import model.Trash;
import model.User;
import service.ShowcaseServiceImpl;
import service.TrashServiceImpl;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        TrashServiceImpl trashService = new TrashServiceImpl();
        trashService.createTable();

    }


}