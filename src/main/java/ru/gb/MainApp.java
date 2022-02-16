package ru.gb;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.logging.*;

public class MainApp {
    public static final Logger logger =  Logger.getLogger(MainApp.class.getName());
    public static void main(String[] args) throws IOException {
        /*System.out.println("Server started");*/
        LogManager manager = LogManager.getLogManager();
        manager.readConfiguration (new FileInputStream("logging.properties"));
        Filter filter = record -> record.getMessage().startsWith("A");
        logger.info("Server  started");
        logger.log(Level.WARNING, "Achtung");
        Handler fileHandler = new FileHandler("1.log",true);
        Handler consoleHandler= new ConsoleHandler();
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);
        logger.log(Level.WARNING, "Achtung Menschen");

        consoleHandler.setFilter(filter);

    }

}
