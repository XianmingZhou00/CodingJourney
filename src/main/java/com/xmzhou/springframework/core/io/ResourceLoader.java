package com.xmzhou.springframework.core.io;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/13 13:20
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}

