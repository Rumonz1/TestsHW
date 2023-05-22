package homework;

import com.sun.jdi.connect.Connector;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.stream.Stream;

public class User {

    public String login;
    public String email;

    public User(String login, String email) {
        if (login != null|| !login.isBlank() || !login.isEmpty()) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Поле логин не может быть пустым");
        }
        if (email == null || email.isEmpty() || email.isBlank()) {
                throw new IllegalArgumentException("Поле eMail не может быть пустым");
            }
        if (email.contains(".") || email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Некорректно введён eMail");
        }
        if (Objects.equals(login, email)) {
            throw new IllegalArgumentException("Поле логин и eMail не могут быть одинаковыми");
        }
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String generateUser() {
        return generateUser(null, null);
    }

    public String generateUser(String login, String email) {
        this.login = login;
        this.email = email;
        if (login == null|| login.isBlank() || login.isEmpty()) {
            return "Пожалуйста введите логин";
        }{
            if (email == null||email.isEmpty() || email.isBlank()) {
                return "Пожалуйста введите email";
            }
            if (email.contains(".") || email.contains("@")) {
                return email;
            }
        }
        return "Логин: " + login + "| Email: " + email;

    }

}
