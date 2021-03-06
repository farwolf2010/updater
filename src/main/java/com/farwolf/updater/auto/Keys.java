/*
 * This file is generated by jOOQ.
*/
package com.farwolf.updater.auto;


import com.farwolf.updater.auto.tables.App;
import com.farwolf.updater.auto.tables.Hotupadte;
import com.farwolf.updater.auto.tables.Version;
import com.farwolf.updater.auto.tables.records.AppRecord;
import com.farwolf.updater.auto.tables.records.HotupadteRecord;
import com.farwolf.updater.auto.tables.records.VersionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>app</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AppRecord, Long> IDENTITY_APP_ = Identities0.IDENTITY_APP_;
    public static final Identity<HotupadteRecord, Long> IDENTITY_HOTUPADTE = Identities0.IDENTITY_HOTUPADTE;
    public static final Identity<VersionRecord, Long> IDENTITY_VERSION = Identities0.IDENTITY_VERSION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AppRecord> KEY_APP_PRIMARY = UniqueKeys0.KEY_APP_PRIMARY;
    public static final UniqueKey<HotupadteRecord> KEY_HOTUPADTE_PRIMARY = UniqueKeys0.KEY_HOTUPADTE_PRIMARY;
    public static final UniqueKey<VersionRecord> KEY_VERSION_PRIMARY = UniqueKeys0.KEY_VERSION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AppRecord, Long> IDENTITY_APP_ = createIdentity(App.APP_, App.APP_.ID);
        public static Identity<HotupadteRecord, Long> IDENTITY_HOTUPADTE = createIdentity(Hotupadte.HOTUPADTE, Hotupadte.HOTUPADTE.ID);
        public static Identity<VersionRecord, Long> IDENTITY_VERSION = createIdentity(Version.VERSION, Version.VERSION.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AppRecord> KEY_APP_PRIMARY = createUniqueKey(App.APP_, "KEY_app_PRIMARY", App.APP_.ID);
        public static final UniqueKey<HotupadteRecord> KEY_HOTUPADTE_PRIMARY = createUniqueKey(Hotupadte.HOTUPADTE, "KEY_hotupadte_PRIMARY", Hotupadte.HOTUPADTE.ID);
        public static final UniqueKey<VersionRecord> KEY_VERSION_PRIMARY = createUniqueKey(Version.VERSION, "KEY_version_PRIMARY", Version.VERSION.ID);
    }
}
