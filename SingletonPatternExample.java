// File: SingletonPatternExample.java

class Logger 
{
    // Step 1: Private static instance (eager initialization)
    private static Logger instance = new Logger();

    // Step 2: Private constructor to restrict instantiation
    private Logger()
     {
        System.out.println("Logger instance created.");
     }

    // Step 3: Public method to return the singleton instance
    public static Logger getInstance()
     {
        return instance;
     }

    // Logging method
    public void log(String message) 
    {
        System.out.println("[LOG]: " + message);
    }
}

public class SingletonPatternExample 
{
    public static void main(String[] args) 
    {
        // Access the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the logger to log messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");      

        // Verify both instances are the same
        if (logger1 == logger2)
         {
            System.out.println("Both logger instances are the same (Singleton verified).");
         } 
        else 
        {
            System.out.println("Different instances detected (Singleton failed).");
        }
    }
}

