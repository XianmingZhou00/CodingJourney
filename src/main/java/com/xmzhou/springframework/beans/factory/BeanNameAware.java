package com.xmzhou.springframework.beans.factory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 21:36
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);
}
