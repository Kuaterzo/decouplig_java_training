package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        Logger console = new ConsoleLogger();
        Logger logfile = new FileLogger("./fileLogger.log");

        Logger log = new ContextualLogger(
            new CompositeLogger(console,logfile), name
        );

        return log;
    }

}
