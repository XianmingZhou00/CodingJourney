package com.xmzhou.springframework.beans.factory.support;

import com.xmzhou.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/11 19:45
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object... args);
}
