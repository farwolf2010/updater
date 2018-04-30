package com.farwolf.updater.service;


import com.farwolf.updater.util.DateUtil;
import org.apache.log4j.Logger;
import org.jooq.impl.DefaultDSLContext;

import javax.annotation.Resource;

/**
 * Created by zhengjiangrong on 17/6/19.
 */
public class ServiceBase {


    public Logger log= Logger.getLogger(ServiceBase.class);

    @Resource
    DefaultDSLContext dsl;


    public void info(String msg)
    {
        log.info(DateUtil.now()+"  "+msg);
    }
}
