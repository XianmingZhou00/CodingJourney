package com.xmzhou.springframework.beans.factory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 20:55
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
