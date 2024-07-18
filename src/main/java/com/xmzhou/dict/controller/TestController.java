package com.xmzhou.dict.controller;

import com.xmzhou.dict.entity.ExampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/18 20:32
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/dict/{status}")
    public ExampleVO getDict(@PathVariable Integer status) {
        ExampleVO vo = new ExampleVO();
        vo.setStatus(status);
        vo.setMessage("message");
        return vo;
    }
}
