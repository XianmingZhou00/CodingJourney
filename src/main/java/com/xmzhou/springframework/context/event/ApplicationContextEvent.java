package com.xmzhou.springframework.context.event;

import com.xmzhou.springframework.context.ApplicationContext;
import com.xmzhou.springframework.context.ApplicationEvent;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 15:43
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
