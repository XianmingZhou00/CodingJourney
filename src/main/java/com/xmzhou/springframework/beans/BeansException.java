package com.xmzhou.springframework.beans;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/11 19:10
 */
public class BeansException extends RuntimeException {

    public BeansException(){
    }

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
