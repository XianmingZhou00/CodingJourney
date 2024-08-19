package com.xmzhou.springframework.context.event;

import com.xmzhou.springframework.context.ApplicationEvent;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 15:44
 */
public class ContextClosedEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
