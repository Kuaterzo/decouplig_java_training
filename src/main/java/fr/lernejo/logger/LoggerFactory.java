package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        Logger console = new ConsoleLogger();
        Logger logfile = new FileLogger("./fileLogger.log");
        Logger logFiltered = new FilteredLogger(logfile,message -> message.contains("simulation"));
        Logger log = new ContextualLogger(name,
            new CompositeLogger(console,logFiltered)
        );

        return log;
    }

}
