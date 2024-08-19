package com.xmzhou.springframework.beans.factory.config;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/12 21:52
 */
public class BeanReference {
    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
