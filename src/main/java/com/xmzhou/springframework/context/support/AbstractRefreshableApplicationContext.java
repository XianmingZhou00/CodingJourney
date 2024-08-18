package com.xmzhou.springframework.context.support;

import com.xmzhou.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.xmzhou.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 15:20
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
