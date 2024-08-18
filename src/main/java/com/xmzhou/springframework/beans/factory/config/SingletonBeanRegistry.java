package com.xmzhou.springframework.beans.factory.config;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/11 18:04
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void destroySingletons();
}
