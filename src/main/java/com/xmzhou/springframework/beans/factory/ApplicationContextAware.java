package com.xmzhou.springframework.beans.factory;

import com.xmzhou.springframework.beans.BeansException;
import com.xmzhou.springframework.context.ApplicationContext;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 21:37
 */
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
