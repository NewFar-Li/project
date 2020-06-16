package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Processrick implements Serializable {
    private Integer proid;

    private Integer processid;

    private String proname;

    private Date proyear;

    private String proinfomation;

    private String proaccessory;

    private Date procreatetime;

    private Integer procreateid;

    private String procreatename;

    private Integer prostatus;

    private static final long serialVersionUID = 1L;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public Date getProyear() {
        return proyear;
    }

    public void setProyear(Date proyear) {
        this.proyear = proyear;
    }

    public String getProinfomation() {
        return proinfomation;
    }

    public void setProinfomation(String proinfomation) {
        this.proinfomation = proinfomation == null ? null : proinfomation.trim();
    }

    public String getProaccessory() {
        return proaccessory;
    }

    public void setProaccessory(String proaccessory) {
        this.proaccessory = proaccessory == null ? null : proaccessory.trim();
    }

    public Date getProcreatetime() {
        return procreatetime;
    }

    public void setProcreatetime(Date procreatetime) {
        this.procreatetime = procreatetime;
    }

    public Integer getProcreateid() {
        return procreateid;
    }

    public void setProcreateid(Integer procreateid) {
        this.procreateid = procreateid;
    }

    public String getProcreatename() {
        return procreatename;
    }

    public void setProcreatename(String procreatename) {
        this.procreatename = procreatename == null ? null : procreatename.trim();
    }

    public Integer getProstatus() {
        return prostatus;
    }

    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proid=").append(proid);
        sb.append(", processid=").append(processid);
        sb.append(", proname=").append(proname);
        sb.append(", proyear=").append(proyear);
        sb.append(", proinfomation=").append(proinfomation);
        sb.append(", proaccessory=").append(proaccessory);
        sb.append(", procreatetime=").append(procreatetime);
        sb.append(", procreateid=").append(procreateid);
        sb.append(", procreatename=").append(procreatename);
        sb.append(", prostatus=").append(prostatus);
        sb.append("]");
        return sb.toString();
    }
}