package com.farwolf.updater.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.jooq.Record;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by moss-zc on 2017/5/5.
 *  jackson的 record输出
 * @author yishop term
 * @since 0.1
 */
@Component
public class JooqRecordSerializer extends JsonSerializer<Record> {

    @Override
    public void serialize(Record record, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
//        jsonGenerator.writeObject(record.intoMap());
        jsonGenerator.writeObject(convert(record.intoMap()));

    }


    public Map convert(Map m)
    {
        Object []keys= m.keySet().toArray();
        HashMap res=new HashMap();
        for(Object key:keys)
        {
            res.put(getNewName(key + ""), m.get(key));
        }
        return res;
    }

    public String getNewName(String name)
    {
        if(!name.contains("_"))
            return name;
        String q[]= name.split("_");
        return q[0]+(q[1].charAt(0)+"").toUpperCase()+(q[1].substring(0));
    }



}
