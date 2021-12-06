package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{


    private Logger delegateLoggger;
    private String callerClass;
    private DateTimeFormatter formatter;

    public ContextualLogger(String name, Logger delegate) {

        this.delegateLoggger = delegate;
        this.callerClass = name;
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    }

    @Override
    public void log(String message) {
        delegateLoggger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
        System.out.print(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);

    }

}
