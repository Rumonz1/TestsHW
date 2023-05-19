package service;

import homework.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User out = new User();

    @Test
    public void shouldReturnUserWithTwoParameters() {
        String result = out.generateUser();
//        Assertions.assertTrue();
    }

}