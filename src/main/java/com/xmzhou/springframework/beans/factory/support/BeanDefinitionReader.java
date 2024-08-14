package com.xmzhou.springframework.beans.factory.support;

import com.xmzhou.springframework.beans.BeansException;
import com.xmzhou.springframework.core.io.Resource;
import com.xmzhou.springframework.core.io.ResourceLoader;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/13 13:24
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
