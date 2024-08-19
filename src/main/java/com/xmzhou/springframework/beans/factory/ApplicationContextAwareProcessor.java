package com.xmzhou.springframework.beans.factory;

import com.xmzhou.springframework.beans.BeansException;
import com.xmzhou.springframework.beans.factory.config.BeanPostProcessor;
import com.xmzhou.springframework.context.ApplicationContext;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 21:37
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
