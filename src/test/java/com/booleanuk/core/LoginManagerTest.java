package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginManagerTest {
    @Test
    public void checkGetEmailWorks() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertEquals("user@test.com", loginManager.getEmail());
    }

    @Test
    public void checkSetEmailWorks() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertEquals("Success", loginManager.setEmail("newuser@test.com"));
        Assertions.assertEquals("newuser@test.com", loginManager.getEmail());
    }

    @Test
    public void checkInvalidEmailIsNotSet() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertEquals("Invalid email address", loginManager.setEmail("newusertest.com"));
        Assertions.assertEquals("user@test.com", loginManager.getEmail());
    }

    @Test
    public void checkGetPasswordWorks() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertEquals("password", loginManager.getPassword());
    }

    @Test
    public void checkSetPasswordWorks() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertEquals("Success", loginManager.setPassword("Sup3rS3cr3t!"));
        Assertions.assertEquals("Sup3rS3cr3t!", loginManager.getPassword());
    }

    @Test
    public void checkInvalidPasswordIsNotSet() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertEquals("Invalid password", loginManager.setPassword("S3cr3t!"));
        Assertions.assertEquals("password", loginManager.getPassword());
    }

    @Test
    public void checkGetLoginStatusWorks() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertFalse(loginManager.getLoginStatus());
    }

    @Test
    public void checkToggleLoginStatusWorks() {
        LoginManager loginManager = new LoginManager("user@test.com", "password");
        Assertions.assertFalse(loginManager.getLoginStatus());
        loginManager.toggleLoginStatus();
        Assertions.assertTrue(loginManager.getLoginStatus());
        loginManager.toggleLoginStatus();
        Assertions.assertFalse(loginManager.getLoginStatus());
    }


}
