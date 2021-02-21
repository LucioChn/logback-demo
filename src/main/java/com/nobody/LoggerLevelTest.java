package com.nobody;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/21
 * @Version 1.0
 */
public class LoggerLevelTest {
    public static void main(String[] args) {

        // 获取一个名为 "com.foo" 的 logger 对象，并且转换为 ch.qos.logback.classic.Logger logger，
        // 这样我们能为它设置级别
        ch.qos.logback.classic.Logger logger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.foo");
        logger.setLevel(Level.INFO);

        // 获取一个名为 "com.boo.Bar" 的 logger 对象，没有设置级别，根据继承关系，继承"com.foo"的 logger 的级别 INFO
        Logger barLogger = LoggerFactory.getLogger("com.foo.Bar");

        // 可以执行，因为 WARN >= INFO
        logger.warn("Low fuel level.");

        // 不能执行，因为 DEBUG < INFO.
        logger.debug("Starting search for nearest gas station.");

        // 根据级别继承关系，可以执行，因为 INFO >= INFO.
        barLogger.info("Located nearest gas station.");

        // 根据级别继承关系，不能执行，因为 DEBUG < INFO.
        barLogger.debug("Exiting gas station search");
    }
}
