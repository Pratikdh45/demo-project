package com.coveros.demo.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public static void main(final String[] args) {
        // Set the logging level to ALL
        logger.setLevel(Level.ALL);

        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
        final LocalDateTime now = LocalDateTime.now();

        // Print log message
        logger.info("Hello, World! The current time is " + dtf.format(now));
    }
}
