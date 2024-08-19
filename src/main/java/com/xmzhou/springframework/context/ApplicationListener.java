package com.xmzhou.springframework.context;

import java.util.EventListener;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 15:47
 */
public interface ApplicationListener<E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
