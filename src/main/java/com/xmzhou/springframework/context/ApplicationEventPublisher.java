package com.xmzhou.springframework.context;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 16:05
 */
public interface ApplicationEventPublisher {
    void publishEvent(ApplicationEvent event);

}
