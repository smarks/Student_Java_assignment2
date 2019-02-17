package com.origamisoftware.weekone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
