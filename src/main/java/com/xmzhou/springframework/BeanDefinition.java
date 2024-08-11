package com.xmzhou.springframework;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/11 17:50
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
