package com.xmzhou.bean;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/12 21:13
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
