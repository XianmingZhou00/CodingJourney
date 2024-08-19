package com.xmzhou.springframework.beans.factory;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/18 20:56
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
