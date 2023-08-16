package tests;

import baseEntities.BaseTestHW;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest extends BaseTestHW {
    Logger logger = LogManager.getLogger(LoggerTest.class);

    @Test
    public void loggerTestHW(){
        logger.trace("Trace Message...");
        logger.debug("Debug Message...");
        logger.info("Info Message...");
        logger.warn("Warning Message...");
        logger.error("Error Message...");
        logger.fatal("Fatal Message...");


    }
}