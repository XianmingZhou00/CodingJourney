package com.xmzhou.springframework.beans.factory;

import com.xmzhou.springframework.beans.BeansException;

import java.util.Map;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/14 16:40
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
