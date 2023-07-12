import model.User;
import service.TrashServiceImpl;
import service.UserServiceImpl;
public class Main {
    public static void main(String[] args) {

        //UserServiceImpl userService = new UserServiceImpl();
        //User user = new User(4, "rtrgrg", 2226);
        //userService.createTable();
        TrashServiceImpl trashService = new TrashServiceImpl();
        trashService.deleteTable();

    }


}