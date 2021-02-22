package com.nobody;

import java.util.logging.Logger;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/22
 * @Version 1.0
 */
public class JDKLog {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("Hello JDK logging info");
        logger.fine("Hello JDK logging fine");
        logger.warning("Hello JDK logging warning");
    }
}
