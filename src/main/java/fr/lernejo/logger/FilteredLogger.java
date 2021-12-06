package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger{

    private Logger loggerDelegate;
    private Predicate<String> condition;


    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        //TODO assign arguments to fields

        this.loggerDelegate = delegate;
        this.condition = condition;

    }

    @Override
    public void log(String message) {

            if(condition.test(message) == true){

                loggerDelegate.log(message);

        }
    }
}
