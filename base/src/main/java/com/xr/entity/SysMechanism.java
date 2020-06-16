package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class SysMechanism implements Serializable {
    private Integer mid;

    private String mechanismName;

    private Integer sid;

    private Integer parent;

    private Integer branch;

    private Date createTime;

    private Integer createId;

    private String staus;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMechanismName() {
        return mechanismName;
    }

    public void setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName == null ? null : mechanismName.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus == null ? null : staus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", mechanismName=").append(mechanismName);
        sb.append(", sid=").append(sid);
        sb.append(", parent=").append(parent);
        sb.append(", branch=").append(branch);
        sb.append(", createTime=").append(createTime);
        sb.append(", createId=").append(createId);
        sb.append(", staus=").append(staus);
        sb.append("]");
        return sb.toString();
    }
}