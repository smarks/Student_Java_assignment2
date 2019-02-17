package com.origamisoftware.weekone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * A basic JUnit test for the app class.
 */
public class AppTest {

    @Test
    public void testMessage() {
        String message = "Hello World";
        App app = new App(message);
        assertEquals("Verify the message is set correctly", message, app.getMessage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        App app = new App(null);
        assertNull("Verify the message is set correctly", app.getMessage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2Negative() {
        App app = new App(null);
        assertNull("Verify the message is set correctly", app.getMessage());
    }
}
