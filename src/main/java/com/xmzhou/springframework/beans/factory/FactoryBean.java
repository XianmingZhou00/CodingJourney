package com.xmzhou.springframework.beans.factory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 22:02
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    default boolean isSingleton(){
        return true;
    }
}
