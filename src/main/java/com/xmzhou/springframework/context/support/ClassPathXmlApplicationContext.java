package com.xmzhou.springframework.context.support;

import com.xmzhou.springframework.beans.BeansException;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 15:31
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    public ClassPathXmlApplicationContext() {
    }

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        refresh();
    }

    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[0];
    }
}
