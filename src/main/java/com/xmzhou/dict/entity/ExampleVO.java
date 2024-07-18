package com.xmzhou.dict.entity;

import com.xmzhou.dict.annotation.Dict;
import lombok.Data;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/18 20:33
 */
@Data
public class ExampleVO {

    @Dict(dict_key = "status")
    private Integer status;

    private String message;

}
