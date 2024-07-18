package com.xmzhou.dict.serializer;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.xmzhou.dict.annotation.Dict;

import java.util.List;

/**
 * 针对 {@link com.xmzhou.dict.annotation.Dict } 注解的属性，序列化时，将属性值替换为字典值
 * <p>
 * Author: Xianming Zhou
 * CreateTime: 2024/7/18 21:02
 */
public class DictSerializerModifier extends BeanSerializerModifier {

    @Override
    public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
        for (BeanPropertyWriter beanPropertyWriter : beanProperties) {
            Dict dict = beanPropertyWriter.getAnnotation(Dict.class);
            if (dict != null) {
                beanPropertyWriter.assignSerializer(new DictSerializer(dict));
            }
        }
        return beanProperties;
    }
}
