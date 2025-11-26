public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(AbstractLogger abstractLogger) {
        super(abstractLogger);
    }

    @Override
    public void log(String message, int logLevel) {
        if(logLevel == ERROR){
            System.out.println("ERROR: "+ message);
        }
        else {
            logger.log(message,logLevel);
        }
    }
}
