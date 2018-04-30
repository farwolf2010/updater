package com.farwolf.updater.service;

import com.farwolf.updater.auto.tables.Hotupadte;
import com.farwolf.updater.auto.tables.records.HotupadteRecord;
import com.farwolf.updater.auto.tables.records.VersionRecord;
import org.jooq.SelectConditionStep;
import org.jooq.SelectWhereStep;
import org.springframework.stereotype.Component;

import static com.farwolf.updater.auto.tables.Hotupadte.HOTUPADTE;
import static com.farwolf.updater.auto.tables.Version.VERSION;

/**
 * Created by zhengjiangrong on 2018/4/30.
 */
@Component
public class HotupdateService extends ServiceBase {

    public HotupadteRecord selectBy(int appid, int systype,int jsversion,int nativeversion)
    {
       return  dsl.selectFrom(HOTUPADTE)
                .where(HOTUPADTE.SYSTEMTYPE.eq(systype))
                .and(HOTUPADTE.APP_ID.eq(appid))
                .and(HOTUPADTE.NATIVE_VERSION.eq(nativeversion))
                .and(HOTUPADTE.JS_VERSION.greaterThan(jsversion))
                .orderBy(HOTUPADTE.JS_VERSION.desc())
                .limit(0,1)
                .fetchOne();
    }


}
