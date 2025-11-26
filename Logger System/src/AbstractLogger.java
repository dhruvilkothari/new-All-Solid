public  abstract class AbstractLogger {
    public AbstractLogger logger;

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public AbstractLogger(AbstractLogger abstractLogger){
        this.logger = abstractLogger;
    }

    public void log(String message, int logLevel){
        this.logger.log(message,logLevel);
    }
}
