package com.xmzhou.springframework.beans.factory.support;

import com.xmzhou.springframework.beans.factory.config.BeanDefinition;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/11 19:20
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    boolean containsBeanDefinition(String beanName);
}
