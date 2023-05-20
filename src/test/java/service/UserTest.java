package service;

import constants.UserServiceTestConstants;
import homework.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User out = new User();

    @Test
    public void shouldReturnUserWithTwoParameters() {
        String result = out.generateUser();
        Assertions.assertTrue(result.contains(UserServiceTestConstants.CORRECT_LOGIN));
        Assertions.assertTrue(result.contains(UserServiceTestConstants.CORRECT_EMAIL));
    }

    @Test
    public void shouldReturnExceptionWhenNoParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.generateUser(UserServiceTestConstants.EMPTY_LOGIN, UserServiceTestConstants.EMPTY_EMAIL));
    }

    @Test
    public void shouldCheckUserEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.generateUser(UserServiceTestConstants.CORRECT_LOGIN, UserServiceTestConstants.INCORRECT_EMAIL));

    }

    @Test
    public void shouldCheckAreNotEqualLoginAndEmail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.generateUser(UserServiceTestConstants.WRONG_LOGIN, UserServiceTestConstants.CORRECT_EMAIL));

    }

}