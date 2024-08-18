package com.xmzhou.springframework.beans.factory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 21:36
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}
