import controller.UserController;

public class MainUser {
    public static void main(String[] args) {
        UserController uc= new UserController();
        uc.addUser("darek","kk");
        uc.addUser("xx","xx");
        uc.addUser("yy","xx");
        uc.addUser("darek","kk");
        uc.showUser();
        uc.deleteUser("xx");
        uc.deleteUser("xxsdss");
        uc.showUser();
        uc.changePassword("darek","kk","dddd","dddd");
        uc.showUser();
    }
}
