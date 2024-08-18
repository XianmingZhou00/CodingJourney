package com.xmzhou.springframework.context.support;

import com.xmzhou.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.xmzhou.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 15:23
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
