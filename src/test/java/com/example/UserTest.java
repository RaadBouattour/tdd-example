package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    void testValidEmail() {
        User user = new User();
        assertTrue(user.isValidEmail("test@example.com"));
        assertFalse(user.isValidEmail("invalid-email"));
        assertFalse(user.isValidEmail(""));
    }
}
