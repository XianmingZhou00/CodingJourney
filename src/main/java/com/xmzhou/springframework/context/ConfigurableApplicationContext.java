package com.xmzhou.springframework.context;

import com.xmzhou.springframework.beans.BeansException;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/14 16:43
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();

}
