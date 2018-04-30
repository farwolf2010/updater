package com.farwolf.updater.util;

import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tools.json.JSONObject;

import java.util.List;

/**
 * Created by zhengjiangrong on 17/5/27.
 */
public class VResult extends JSONObject {



    public VResult()
    {
        setSuccess();
    }

    public void setErrorCode(int errorCode)
    {

        put("error",errorCode);
    }


    public void setErrorMsg(String msg)
    {

        put("msg",msg);
    }


    public void setFail(int code,String msg)
    {
        this.setErrorCode(code);
        this.setErrorMsg(msg);
    }

    public void setFail(String msg)
    {
        setFail(1,msg);
    }


    public void setSuccess()
    {
        setErrorCode(0);
        setErrorMsg("成功");
    }

    public void addBean(String key,Object v)
    {
        put(key,v);
    }

    public void addBean(String key ,UpdatableRecordImpl bean)
    {
        addBean(key, bean.intoMap());
    }

    public void addList(List l)
    {
        put("list",l);
    }











}
