
public class Main {
    public static void main(String[] args) {

            AbstractLogger abstractLogger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
            abstractLogger.log("hello", 1);
            abstractLogger.log("hello", 2);
            abstractLogger.log("hello", 3);
    }
}