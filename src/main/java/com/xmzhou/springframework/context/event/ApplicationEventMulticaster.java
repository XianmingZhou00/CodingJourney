package com.xmzhou.springframework.context.event;

import com.xmzhou.springframework.context.ApplicationEvent;
import com.xmzhou.springframework.context.ApplicationListener;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 15:45
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
