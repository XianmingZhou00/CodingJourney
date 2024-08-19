package com.xmzhou.springframework.util;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/13 13:16
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
