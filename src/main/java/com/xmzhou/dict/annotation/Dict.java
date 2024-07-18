package com.xmzhou.dict.annotation;

import java.lang.annotation.*;

/**
 * 该注解作用于字段上。根据注解的字段，该类新增一个字段，赋予字典值
 * <p>参考案例：
 * <pre class="code">
 *  public class ExampleVO{
 *     {@code @Dict(dict_key} = "status")
 *      private Integer status;
 * }
 * </pre>
 * <p>反序列化结果：
 * <pre class="code">
 *   {
 *      "status": 1,
 *      "status_desc":"desc"
 *    }
 * </pre>
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Dict {
    String dict_key() default "";
}
