package com.xmzhou.dict.config;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.xmzhou.dict.serializer.DictSerializerModifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/7/18 20:59
 */
@Configuration
public class JacksonConfig {

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        SimpleModule simpleModule = new SimpleModule().setSerializerModifier(new DictSerializerModifier());
        builder.modules(simpleModule);
        return builder;
    }
}
