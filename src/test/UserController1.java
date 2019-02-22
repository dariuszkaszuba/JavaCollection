package test;

import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserController1 {
    private List<User> registered_user = new ArrayList<>();
    private Set<String> registered_login = new HashSet<>();

    public boolean addUser(String login, String password) {
        if (login.equals(registered_user)) {
            System.out.println("Podany uzytkownik juz istnieje");
            return false;
        }
        User u = new User(login, password);
        registered_user.add(u);
        registered_login.add(login);
        System.out.println("Zarejestrowano uzytkownika");
        return true;
    }

    public boolean deleteUser(String delete_login) {
        for (int i = 0; i < registered_user.size(); i++) {
            if (registered_user.get(i).getLogin().equals(delete_login)) {
                registered_user.remove(i);
                registered_login.remove(i);
                System.out.println("Usunieto Uzytkownika "+ delete_login);
                return  true;
            }
        }
        System.out.println("Nie ma takiego loginu "+delete_login);
        return  false;
    }

    public void showUsers() {
        registered_user.forEach(user -> System.out.println(user));
    }

}
