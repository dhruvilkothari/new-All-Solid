public class DebugLogger extends AbstractLogger{
    public DebugLogger(AbstractLogger abstractLogger) {
        super(abstractLogger);
    }

    @Override
    public void log(String message, int logLevel) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: "+ message);
        }
        else {
            logger.log(message,logLevel);
        }
    }
}
