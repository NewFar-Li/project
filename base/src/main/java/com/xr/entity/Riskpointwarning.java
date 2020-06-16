package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Riskpointwarning implements Serializable {
    private Integer wid;

    private Integer warningid;

    private String wtitle;

    private String wcontent;

    private Date wcreatetime;

    private Integer wloginid;

    private String wcreatename;

    private Integer wstatus;

    private static final long serialVersionUID = 1L;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getWarningid() {
        return warningid;
    }

    public void setWarningid(Integer warningid) {
        this.warningid = warningid;
    }

    public String getWtitle() {
        return wtitle;
    }

    public void setWtitle(String wtitle) {
        this.wtitle = wtitle == null ? null : wtitle.trim();
    }

    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent == null ? null : wcontent.trim();
    }

    public Date getWcreatetime() {
        return wcreatetime;
    }

    public void setWcreatetime(Date wcreatetime) {
        this.wcreatetime = wcreatetime;
    }

    public Integer getWloginid() {
        return wloginid;
    }

    public void setWloginid(Integer wloginid) {
        this.wloginid = wloginid;
    }

    public String getWcreatename() {
        return wcreatename;
    }

    public void setWcreatename(String wcreatename) {
        this.wcreatename = wcreatename == null ? null : wcreatename.trim();
    }

    public Integer getWstatus() {
        return wstatus;
    }

    public void setWstatus(Integer wstatus) {
        this.wstatus = wstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", warningid=").append(warningid);
        sb.append(", wtitle=").append(wtitle);
        sb.append(", wcontent=").append(wcontent);
        sb.append(", wcreatetime=").append(wcreatetime);
        sb.append(", wloginid=").append(wloginid);
        sb.append(", wcreatename=").append(wcreatename);
        sb.append(", wstatus=").append(wstatus);
        sb.append("]");
        return sb.toString();
    }
}