package com.okan.SpringBooteBean.domain;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseModel extends Model {
    @Id
    private long id;

    @Version
    private Long version;

    @WhenCreated
    private Timestamp createdTime;

    @WhenModified
    private Timestamp modifiedTime;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(final Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(final Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
