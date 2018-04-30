package com.farwolf.updater.serializer;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.jooq.Record;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by moss-zc on 2017/6/19.
 *  第三方json格式化注册
 * @author yishop term
 * @since 0.1
 */
@Component
public class CustemObjectMapper extends ObjectMapper implements InitializingBean {

    @Resource
    JooqRecordSerializer serializer;


    @Override
    public void afterPropertiesSet() throws Exception {
        SimpleModule customModule = new SimpleModule(Version.unknownVersion());
        customModule.addSerializer(Record.class,serializer);
        registerModule(customModule);
    }
}
