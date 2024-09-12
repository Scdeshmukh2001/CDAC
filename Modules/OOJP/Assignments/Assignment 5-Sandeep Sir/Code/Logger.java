package com.example.assignment5;

public class Logger {
	// Static variable to hold the single instance of Logger
    private static Logger instance;
    
    // StringBuilder to store log messages
    private StringBuilder logMessages;

    // Private constructor to prevent instantiation
    private Logger() {
        logMessages = new StringBuilder();
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to add a log message
    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    // Method to get the current log messages
    public String getLog() {
        return logMessages.toString();
    }

    // Method to clear all log messages
    public void clearLog() {
        logMessages.setLength(0);
    }

    public static void main(String[] args) {
        // Example usage of Logger
        Logger logger = Logger.getInstance();
        logger.log("This is the first log message.");
        logger.log("This is the second log message.");
        
        System.out.println("Current Log:\n" + logger.getLog());
        
        logger.clearLog();
        
        System.out.println("Log after clearing:\n" + logger.getLog());
    }
}


