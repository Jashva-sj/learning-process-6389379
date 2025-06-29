import java.util.logging.Level;
import java.util.logging.Logger;

public class ErrorLoggerExample {

    private static final Logger logger = Logger.getLogger(ErrorLoggerExample.class.getName());

    public static void main(String[] args) {
        ErrorLoggerExample app = new ErrorLoggerExample();

        app.processData(10);     // Normal Case
        app.processData(-5);     // Warning Case
        app.processData(0);      // Error Case
    }

    public void processData(int value) {
        if (value > 0) {
            logger.info("Processing data: Value = " + value);
        } else if (value < 0) {
            logger.warning("Warning: Negative value provided: " + value);
        } else {
            logger.severe("Error: Zero value is not allowed!");
        }
    }
}
