package com.nobody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/21
 * @Version 1.0
 */
public class User {
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    public void say() {
        LOGGER.debug("我是在 User 类中，使用debug级别打印日志");
    }

    public void cul() {
        try {
            int a = 0;
            int b = 10 / a;
        } catch (Exception e) {
            LOGGER.error("e:", e);
        }
    }
}
