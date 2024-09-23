package Assign_5;

class Logger {
    // A private static variable to hold the single instance of the Logger class.
    private static Logger instance = null;
    
    // A StringBuilder to store the log messages.
    private StringBuilder logMessages;

    // Private constructor to prevent instantiation from other classes.
    private Logger() {
        logMessages = new StringBuilder();
    }

    // Public static method to provide access to the single instance of the class.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to add a log message.
    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    // Method to get all log messages as a String.
    public String getLog() {
        return logMessages.toString();
    }

    // Method to clear all log messages.
    public void clearLog() {
        logMessages.setLength(0);
    }



    public static void main(String[] args) {
        // Get the instance of Logger.
        Logger logger = Logger.getInstance();

        // Log some messages.
        logger.log("First log message.");
        logger.log("Second log message.");
        
        // Retrieve and print the log messages.
        System.out.println("Log Output:");
        System.out.println(logger.getLog());
        
        // Clear the log and show the empty log.
        logger.clearLog();
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());
    }
}
