package com.nobody;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/20
 * @Version 1.0
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hello Logback!");

        Logger logger1 = LoggerFactory.getLogger("com.nobody.Main");
        logger1.info("Hello Logback!");

        System.out.println(logger.getName());
        System.out.println(logger1.getName());

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);

        Logger rootLogger = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        System.out.println(rootLogger.getName());

    }
}
