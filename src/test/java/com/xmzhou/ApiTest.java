package com.xmzhou;

import com.xmzhou.bean.OrderService;
import com.xmzhou.bean.UserDao;
import com.xmzhou.bean.UserService;
import com.xmzhou.springframework.beans.PropertyValue;
import com.xmzhou.springframework.beans.PropertyValues;
import com.xmzhou.springframework.beans.factory.config.BeanDefinition;
import com.xmzhou.springframework.beans.factory.config.BeanReference;
import com.xmzhou.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/12 21:13
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "xmzhou");
        userService.queryUserInfo();
    }

    @Test
    public void test_BeanFactory2(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(OrderService.class, propertyValues);
        beanFactory.registerBeanDefinition("orderService", beanDefinition);

        // 5. UserService 获取bean
        OrderService orderService = (OrderService) beanFactory.getBean("orderService");
        orderService.queryOrderInfo();
    }
}
