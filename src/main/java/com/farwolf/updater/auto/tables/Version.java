/*
 * This file is generated by jOOQ.
*/
package com.farwolf.updater.auto.tables;


import com.farwolf.updater.auto.App;
import com.farwolf.updater.auto.Keys;
import com.farwolf.updater.auto.tables.records.VersionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Version extends TableImpl<VersionRecord> {

    private static final long serialVersionUID = -970025142;

    /**
     * The reference instance of <code>app.version</code>
     */
    public static final Version VERSION = new Version();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VersionRecord> getRecordType() {
        return VersionRecord.class;
    }

    /**
     * The column <code>app.version.id</code>.
     */
    public final TableField<VersionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>app.version.name</code>.
     */
    public final TableField<VersionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>app.version.version_name</code>.
     */
    public final TableField<VersionRecord, String> VERSION_NAME = createField("version_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>app.version.version_code</code>.
     */
    public final TableField<VersionRecord, Integer> VERSION_CODE = createField("version_code", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>app.version.system_type</code>.
     */
    public final TableField<VersionRecord, Integer> SYSTEM_TYPE = createField("system_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>app.version.app_id</code>.
     */
    public final TableField<VersionRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>app.version.desc</code>.
     */
    public final TableField<VersionRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>app.version.download_url</code>.
     */
    public final TableField<VersionRecord, String> DOWNLOAD_URL = createField("download_url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>app.version.source</code>.
     */
    public final TableField<VersionRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>app.version.size</code>.
     */
    public final TableField<VersionRecord, String> SIZE = createField("size", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>app.version</code> table reference
     */
    public Version() {
        this("version", null);
    }

    /**
     * Create an aliased <code>app.version</code> table reference
     */
    public Version(String alias) {
        this(alias, VERSION);
    }

    private Version(String alias, Table<VersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Version(String alias, Table<VersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return App.APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VersionRecord, Long> getIdentity() {
        return Keys.IDENTITY_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VersionRecord> getPrimaryKey() {
        return Keys.KEY_VERSION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VersionRecord>> getKeys() {
        return Arrays.<UniqueKey<VersionRecord>>asList(Keys.KEY_VERSION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Version as(String alias) {
        return new Version(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(String name) {
        return new Version(name, null);
    }
}