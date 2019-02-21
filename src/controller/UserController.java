package controller;

import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class UserController {
    private List<User> registered_users = new ArrayList<>();
    private Set<String> registered_login = new HashSet<>();

    public boolean addUser(String login, String password) {
        if (registered_login.contains(login)) {
            System.out.println("Login " + login + " istniej w bazie");
            return false;
        }
        User u = new User(login, password);
        registered_users.add(u);
        registered_login.add(login);
        System.out.println("Zarejestrowano uzytkownika");
        return true;
    }

    public boolean passwordCheck(String newPassword) {
        String template = ".{6,32}";
        String template1 = ".*\\d+.*";
        String template2 = ".*[A-Z]+.*";
        return Pattern.matches(template, newPassword)&& Pattern.matches(template1,newPassword)&&Pattern.matches(template2, newPassword);
    }


    public boolean changePassword(String login, String oldPassword, String newPassword, String newPassword2) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login) && registered_users.get(i).getPassword().equals(oldPassword)) {
                if (newPassword.equals(newPassword2) && !newPassword.equals(oldPassword)) {
                    if (passwordCheck(newPassword)) {
                        registered_users.get(i).setPassword(newPassword);
                        System.out.println("Haslo zostało zmienione");
                        return true;
                    }
                    System.out.println("Nowe hasla sa bledne");
                    return false;
                }
                System.out.println();
                return false;
            }
        }
        System.out.println("nie ma takiego uzytkownika");
        return false;
    }


    public boolean deleteUser(String login_delete) {
        for (int i = 0; i < registered_users.size(); i++) {
            if (registered_users.get(i).getLogin().equals(login_delete)) {
                registered_users.remove(registered_users.get(i));
                registered_login.remove(login_delete);
                System.out.println("Usunieto uzytkownika " + login_delete);
                return true;
            }
        }
        System.out.println("Nie ma takiego uzytkownika: " + login_delete);
        return false;
    }

    public void showUser() {
        registered_users.forEach(user -> System.out.println(user));
    }
}
