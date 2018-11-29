package ResponsebilityChain;

/**
 * 责任链模式
 */
public class Demo {
    public static void main(String[] args){
        AbstractLogger chain = getChain();
        chain.logMessge(AbstractLogger.INFO,"info");
    }

    public static AbstractLogger getChain(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
