package com.xmzhou.springframework.context.event;

import com.xmzhou.springframework.beans.factory.BeanFactory;
import com.xmzhou.springframework.context.ApplicationEvent;
import com.xmzhou.springframework.context.ApplicationListener;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/19 16:08
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
