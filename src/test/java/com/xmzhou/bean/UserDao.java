package com.xmzhou.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "aa");
        hashMap.put("10002", "bb");
        hashMap.put("10003", "cc");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}