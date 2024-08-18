package com.xmzhou.springframework.beans.factory;

import com.xmzhou.springframework.beans.BeansException;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/11 17:51
 */
public interface BeanFactory {

    Object getBean(String beanName);

    Object getBean(String beanName, Object... args);

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
