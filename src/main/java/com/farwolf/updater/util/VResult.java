package com.farwolf.updater.util;

import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.tools.json.JSONObject;
import org.jooq.util.derby.sys.Sys;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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






    public static void main(String arg[])
    {
        ThreadPoolExecutor ex=new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        ex.getQueue().add(new Runnable() {
            @Override
            public void run() {
                System.out.println("1111");
            }
        });
        ex.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("ok");
            }
        });
        ex.shutdown();




    }





}
