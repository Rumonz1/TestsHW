package service;

import constants.UserServiceTestConstants;
import homework.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static constants.UserServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User out = new User();


    @Test
    public void shouldReturnUserWithTwoParameters() {
        out.generateUser("LoGiN1337", "loginEmail@skypro.ru");
        Assertions.assertEquals(out.getLogin(), CORRECT_LOGIN);
        Assertions.assertEquals(out.getEmail(), CORRECT_EMAIL);
    }

    @Test
    public void shouldReturnExceptionWhenNoParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new  User(EMPTY_LOGIN, EMPTY_EMAIL));
    }

    @Test
    public void shouldCheckUserEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, INCORRECT_EMAIL));

    }

    @Test
    public void shouldCheckAreNotEqualLoginAndEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User(WRONG_LOGIN, CORRECT_EMAIL));

    }

}