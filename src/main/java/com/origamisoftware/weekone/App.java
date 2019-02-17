package com.origamisoftware.weekone;

/**
 * Simple Hello Word App
 */
public class App {

    private String message;

    /**
     * Constructor
     *
     * @param value the message that will be displayed.
     */
    public App(String value) {
        this.message = value;
    }

    /**
     * Get the message to display.
     *
     * @return a String value
     */
    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
           System.out.println("Please provide a single argument to this program - the message to display");
        } else {
            String message = args[0];
            App app = new App("Hello World");
            System.out.println(app.getMessage());
        }
    }
}
