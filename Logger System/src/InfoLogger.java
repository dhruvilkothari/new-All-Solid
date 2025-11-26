public class InfoLogger extends AbstractLogger{
    public InfoLogger(AbstractLogger abstractLogger) {
        super(abstractLogger);
    }

    @Override
    public void log(String message, int logLevel) {
        if(logLevel == INFO){
            System.out.println("INFO: "+ message);
        }
        else {
            logger.log(message,logLevel);
        }
    }
}
