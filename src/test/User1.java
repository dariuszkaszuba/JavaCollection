package test;

import java.time.LocalDateTime;

public class User1 {
    private String login;
    private String password;
    private LocalDateTime add_date;

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
        add_date=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return login +" | "+password +" | "+ add_date;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getAdd_date() {
        return add_date;
    }

    public void setAdd_date(LocalDateTime add_date) {
        this.add_date = add_date;
    }
}
