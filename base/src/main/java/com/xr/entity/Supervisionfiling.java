package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Supervisionfiling implements Serializable {
    private Integer sid;

    private Integer sfilingid;

    private String spaperitems;

    private String saccessory;

    private String senforcementmode;

    private String scost;

    private String sundertaker;

    private Integer sundertakerdeptid;

    private String sauditopinion;

    private Date screatetime;

    private Integer screateid;

    private String screatename;

    private Integer sstatus;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSfilingid() {
        return sfilingid;
    }

    public void setSfilingid(Integer sfilingid) {
        this.sfilingid = sfilingid;
    }

    public String getSpaperitems() {
        return spaperitems;
    }

    public void setSpaperitems(String spaperitems) {
        this.spaperitems = spaperitems == null ? null : spaperitems.trim();
    }

    public String getSaccessory() {
        return saccessory;
    }

    public void setSaccessory(String saccessory) {
        this.saccessory = saccessory == null ? null : saccessory.trim();
    }

    public String getSenforcementmode() {
        return senforcementmode;
    }

    public void setSenforcementmode(String senforcementmode) {
        this.senforcementmode = senforcementmode == null ? null : senforcementmode.trim();
    }

    public String getScost() {
        return scost;
    }

    public void setScost(String scost) {
        this.scost = scost == null ? null : scost.trim();
    }

    public String getSundertaker() {
        return sundertaker;
    }

    public void setSundertaker(String sundertaker) {
        this.sundertaker = sundertaker == null ? null : sundertaker.trim();
    }

    public Integer getSundertakerdeptid() {
        return sundertakerdeptid;
    }

    public void setSundertakerdeptid(Integer sundertakerdeptid) {
        this.sundertakerdeptid = sundertakerdeptid;
    }

    public String getSauditopinion() {
        return sauditopinion;
    }

    public void setSauditopinion(String sauditopinion) {
        this.sauditopinion = sauditopinion == null ? null : sauditopinion.trim();
    }

    public Date getScreatetime() {
        return screatetime;
    }

    public void setScreatetime(Date screatetime) {
        this.screatetime = screatetime;
    }

    public Integer getScreateid() {
        return screateid;
    }

    public void setScreateid(Integer screateid) {
        this.screateid = screateid;
    }

    public String getScreatename() {
        return screatename;
    }

    public void setScreatename(String screatename) {
        this.screatename = screatename == null ? null : screatename.trim();
    }

    public Integer getSstatus() {
        return sstatus;
    }

    public void setSstatus(Integer sstatus) {
        this.sstatus = sstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sfilingid=").append(sfilingid);
        sb.append(", spaperitems=").append(spaperitems);
        sb.append(", saccessory=").append(saccessory);
        sb.append(", senforcementmode=").append(senforcementmode);
        sb.append(", scost=").append(scost);
        sb.append(", sundertaker=").append(sundertaker);
        sb.append(", sundertakerdeptid=").append(sundertakerdeptid);
        sb.append(", sauditopinion=").append(sauditopinion);
        sb.append(", screatetime=").append(screatetime);
        sb.append(", screateid=").append(screateid);
        sb.append(", screatename=").append(screatename);
        sb.append(", sstatus=").append(sstatus);
        sb.append("]");
        return sb.toString();
    }
}