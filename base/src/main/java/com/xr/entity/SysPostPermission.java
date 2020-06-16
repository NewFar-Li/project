package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class SysPostPermission implements Serializable {
    private Integer id;

    private Integer postid;

    private Integer pid;

    private String stuas;

    private Date createTime;

    private Integer createId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getStuas() {
        return stuas;
    }

    public void setStuas(String stuas) {
        this.stuas = stuas == null ? null : stuas.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", postid=").append(postid);
        sb.append(", pid=").append(pid);
        sb.append(", stuas=").append(stuas);
        sb.append(", createTime=").append(createTime);
        sb.append(", createId=").append(createId);
        sb.append("]");
        return sb.toString();
    }
}