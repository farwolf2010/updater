package com.farwolf.updater.control;

import com.farwolf.updater.auto.tables.records.HotupadteRecord;
import com.farwolf.updater.auto.tables.records.VersionRecord;
import com.farwolf.updater.service.HotupdateService;
import com.farwolf.updater.service.VersionService;
import com.farwolf.updater.util.VResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengjiangrong on 18/4/30.
 */
@RestController

public class AppControl {



    @Resource
    HotupdateService hotupdateService;

    @Resource
    VersionService versionService;


    @RequestMapping(value = "/version")
    public VResult versioncheck(String appid,String systype,String vcode,String source) {


        VResult res=new VResult();
        if(appid==null||systype==null||vcode==null)
        {
            res.setFail("参数不正确!");
            return res;
        }
        VersionRecord v=  versionService.selectBy(Integer.parseInt(appid+""), Integer.parseInt(systype+""), Integer.parseInt(vcode+""),source);
        res.addBean("version",v);
        if(v==null)
        {
            res.setFail("已是最新版本!");
            return res;
        }
        res.setSuccess();
        res.setErrorMsg("发现新版本!");
        return res;
    }



    @RequestMapping(value = "/jsversion")
    public VResult jsversioncheck(int appid,int systype,int jsversion,int nativeversion) {

        VResult res=new VResult();
        HotupadteRecord v=  hotupdateService.selectBy( appid,  systype,  jsversion,nativeversion);
        if(v==null)
        {
            res.setFail("已是最新版本!");
            return res;
        }
        res.addBean("version",v);
        res.setSuccess();
        res.setErrorMsg("发现新版本!");
        return res;


    }



}
