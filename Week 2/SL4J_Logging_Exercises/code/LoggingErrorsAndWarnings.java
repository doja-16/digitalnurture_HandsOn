import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingErrorsAndWarnings {

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingErrorsAndWarnings.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        // Warning log
        logger.warn("This is a warning. Something might be wrong!");

        try {
            int x = 5 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            logger.error("An error occurred: Division by zero", e);
        }

        logger.info("Application ended.");
    }
}
