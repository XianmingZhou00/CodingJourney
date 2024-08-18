package com.xmzhou.springframework.beans.factory.config;

import com.xmzhou.springframework.beans.BeansException;
import com.xmzhou.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/14 15:56
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
