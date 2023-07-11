import service.UserServiceImpl;
public class Main {
    public static void main(String[] args) {
        UserServiceImpl us = new UserServiceImpl();
        //User us1 = new User(34,"fdfdf",32);
        //us.create(us1);
        System.out.println(us.read(4).toString());
    }


}