package com.xmzhou.springframework.context;

import java.util.EventObject;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 15:39
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
