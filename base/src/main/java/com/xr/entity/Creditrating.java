package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Creditrating implements Serializable {
    private Integer cid;

    private String reserved1;

    private String reserved2;

    private Date ccreatetime;

    private Integer ccreateid;

    private String ccreatename;

    private Integer cstatus;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    public Date getCcreatetime() {
        return ccreatetime;
    }

    public void setCcreatetime(Date ccreatetime) {
        this.ccreatetime = ccreatetime;
    }

    public Integer getCcreateid() {
        return ccreateid;
    }

    public void setCcreateid(Integer ccreateid) {
        this.ccreateid = ccreateid;
    }

    public String getCcreatename() {
        return ccreatename;
    }

    public void setCcreatename(String ccreatename) {
        this.ccreatename = ccreatename == null ? null : ccreatename.trim();
    }

    public Integer getCstatus() {
        return cstatus;
    }

    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append(", ccreatetime=").append(ccreatetime);
        sb.append(", ccreateid=").append(ccreateid);
        sb.append(", ccreatename=").append(ccreatename);
        sb.append(", cstatus=").append(cstatus);
        sb.append("]");
        return sb.toString();
    }
}