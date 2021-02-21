package com.nobody;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/21
 * @Version 1.0
 */
public class MyApp1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyApp1.class);

    public static void main(String[] args) {
        LOGGER.info("我是在 MyApp1 类中，使用info级别打印日志");
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
//        loggerContext.stop();
        User user = new User();
        user.say();
//        loggerContext.start();
        user.cul();
    }
}
