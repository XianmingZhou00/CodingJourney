package com.xmzhou.bean;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/12 22:12
 */
public class OrderService {

    private String uId;

    private UserDao userDao;

    public void queryOrderInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }
}
