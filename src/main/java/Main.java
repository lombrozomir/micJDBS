import model.Trash;
import model.User;
import service.TrashServiceImpl;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        Trash trash = new Trash(1,2,566,766);
        User user = new User(2, "Huy", 11, trash);
        userService.create(user,trash);

    }


}