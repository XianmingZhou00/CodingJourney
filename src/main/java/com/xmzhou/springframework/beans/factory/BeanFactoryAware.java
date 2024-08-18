package com.xmzhou.springframework.beans.factory;

import com.xmzhou.springframework.beans.BeansException;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 21:35
 */
public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
