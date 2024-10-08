package com.xmzhou.springframework.beans.factory;

import com.xmzhou.springframework.beans.BeansException;
import com.xmzhou.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.xmzhou.springframework.beans.factory.config.BeanDefinition;
import com.xmzhou.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/14 16:02
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}
