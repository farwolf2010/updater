package com.farwolf.updater.service;

import antlr.StringUtils;
import com.farwolf.updater.auto.tables.records.VersionRecord;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.springframework.stereotype.Component;

import static com.farwolf.updater.auto.tables.Version.VERSION;

/**
 * Created by zhengjiangrong on 18/4/30.
 */
@Component
public class VersionService extends ServiceBase{


    public VersionRecord selectBy(int appid,int systype,int vcode,String source)
    {
        SelectWhereStep con=dsl.selectFrom(VERSION);
        SelectConditionStep cs=con.where(VERSION.APP_ID.eq(appid))
                .and(VERSION.SYSTEM_TYPE.eq(systype))
                .and(VERSION.VERSION_CODE.greaterThan(vcode));
        if(source!=null&&!"".equals(source))
        {
            cs=cs.and(VERSION.SOURCE.eq(source));
        }

        return  (VersionRecord)cs.orderBy(VERSION.ID.desc()).limit(0,1).fetchOne();
    }


}
