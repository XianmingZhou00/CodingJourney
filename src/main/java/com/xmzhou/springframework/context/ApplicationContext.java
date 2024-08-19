package com.xmzhou.springframework.context;


import com.xmzhou.springframework.beans.factory.HierarchicalBeanFactory;
import com.xmzhou.springframework.beans.factory.ListableBeanFactory;
import com.xmzhou.springframework.core.io.ResourceLoader;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/14 16:40
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {

}
