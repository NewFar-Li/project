package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Systemprocess implements Serializable {
    private Integer sysid;

    private String systitle;

    private String syscontent;

    private Date syscreatetime;

    private Integer sysloginid;

    private String syscreatename;

    private Integer sysstatus;

    private static final long serialVersionUID = 1L;

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public String getSystitle() {
        return systitle;
    }

    public void setSystitle(String systitle) {
        this.systitle = systitle == null ? null : systitle.trim();
    }

    public String getSyscontent() {
        return syscontent;
    }

    public void setSyscontent(String syscontent) {
        this.syscontent = syscontent == null ? null : syscontent.trim();
    }

    public Date getSyscreatetime() {
        return syscreatetime;
    }

    public void setSyscreatetime(Date syscreatetime) {
        this.syscreatetime = syscreatetime;
    }

    public Integer getSysloginid() {
        return sysloginid;
    }

    public void setSysloginid(Integer sysloginid) {
        this.sysloginid = sysloginid;
    }

    public String getSyscreatename() {
        return syscreatename;
    }

    public void setSyscreatename(String syscreatename) {
        this.syscreatename = syscreatename == null ? null : syscreatename.trim();
    }

    public Integer getSysstatus() {
        return sysstatus;
    }

    public void setSysstatus(Integer sysstatus) {
        this.sysstatus = sysstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysid=").append(sysid);
        sb.append(", systitle=").append(systitle);
        sb.append(", syscontent=").append(syscontent);
        sb.append(", syscreatetime=").append(syscreatetime);
        sb.append(", sysloginid=").append(sysloginid);
        sb.append(", syscreatename=").append(syscreatename);
        sb.append(", sysstatus=").append(sysstatus);
        sb.append("]");
        return sb.toString();
    }
}