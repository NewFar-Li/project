package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class SpvBack implements Serializable {
    private Integer sid;

    private String backtype;

    private String backtitle;

    private String backcontent;

    private Integer bid;

    private String backaccessory;

    private Date newtime;

    private Integer eid;

    private Integer did;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getBacktype() {
        return backtype;
    }

    public void setBacktype(String backtype) {
        this.backtype = backtype == null ? null : backtype.trim();
    }

    public String getBacktitle() {
        return backtitle;
    }

    public void setBacktitle(String backtitle) {
        this.backtitle = backtitle == null ? null : backtitle.trim();
    }

    public String getBackcontent() {
        return backcontent;
    }

    public void setBackcontent(String backcontent) {
        this.backcontent = backcontent == null ? null : backcontent.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBackaccessory() {
        return backaccessory;
    }

    public void setBackaccessory(String backaccessory) {
        this.backaccessory = backaccessory == null ? null : backaccessory.trim();
    }

    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", backtype=").append(backtype);
        sb.append(", backtitle=").append(backtitle);
        sb.append(", backcontent=").append(backcontent);
        sb.append(", bid=").append(bid);
        sb.append(", backaccessory=").append(backaccessory);
        sb.append(", newtime=").append(newtime);
        sb.append(", eid=").append(eid);
        sb.append(", did=").append(did);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}