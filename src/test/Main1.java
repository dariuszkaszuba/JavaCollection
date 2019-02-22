package test;

public class Main1 {
    public static void main(String[] args) {
        UserController1 uc = new UserController1();
        uc.addUser("Dariusz","xx");
        uc.addUser("cc","rrr");
        uc.showUsers();
        uc.deleteUser("cc");
        uc.deleteUser("A");
        uc.showUsers();
    }
}
