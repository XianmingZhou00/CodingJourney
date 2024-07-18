package com.xmzhou.dict.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xmzhou.dict.annotation.Dict;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/18 21:05
 */
public class DictSerializer extends JsonSerializer<Object> {

    private static final Map<Integer, String> STATUS_MAP;

    static {
        STATUS_MAP = new HashMap<>(4);
        STATUS_MAP.put(1, "正常");
        STATUS_MAP.put(2, "禁用");
    }

    private final Dict dict;

    public DictSerializer(Dict dict) {
        this.dict = dict;
    }

    @Override
    public void serialize(Object value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.defaultSerializeValue(value, jsonGenerator);
        // 获取当前字段名
        String fieldName = jsonGenerator.getOutputContext().getCurrentName();
        // 新增一个字段
        jsonGenerator.writeStringField(fieldName + "Desc", value != null ? getDictValue(dict, value) : null);

    }

    /**
     * 根据dictKey 获取 dictValue
     *
     * @param dict    注解
     * @param value 字典key
     * @return 字典value
     */
    private String getDictValue(Dict dict, Object value) {
        // 根据自己的逻辑做处理，可以查数据库，也可以走缓存
        return STATUS_MAP.get(Integer.parseInt(value.toString()));
    }
}
