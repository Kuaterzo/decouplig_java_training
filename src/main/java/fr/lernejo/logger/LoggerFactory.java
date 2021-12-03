package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        Logger logger = new FileLogger("C:\\Users\\Bryan\\decouplig_java_training\\src\\main\\java\\fr\\lernejo\\logger\\fileLogger.log");
        Logger contexLogger = new ContextualLogger(logger,name);

        return contexLogger;
    }

}
