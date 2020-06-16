package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class SysStaff implements Serializable {
    private Integer sid;

    private String name;

    private String sex;

    private Integer age;

    private String educationalBackground;

    private String politicalAppearance;

    private String phone;

    private Integer mid;

    private String username;

    private String password;

    private String pid;

    private Date createTime;

    private Integer createId;

    private String staus;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground == null ? null : educationalBackground.trim();
    }

    public String getPoliticalAppearance() {
        return politicalAppearance;
    }

    public void setPoliticalAppearance(String politicalAppearance) {
        this.politicalAppearance = politicalAppearance == null ? null : politicalAppearance.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
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
        sb.append(", sid=").append(sid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", educationalBackground=").append(educationalBackground);
        sb.append(", politicalAppearance=").append(politicalAppearance);
        sb.append(", phone=").append(phone);
        sb.append(", mid=").append(mid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", pid=").append(pid);
        sb.append(", createTime=").append(createTime);
        sb.append(", createId=").append(createId);
        sb.append(", staus=").append(staus);
        sb.append("]");
        return sb.toString();
    }
}