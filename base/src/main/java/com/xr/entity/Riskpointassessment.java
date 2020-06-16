package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Riskpointassessment implements Serializable {
    private Integer riskid;

    private String riskimfomation;

    private String numberonerisks;

    private String numbertworisks;

    private String numberthreerisks;

    private Date riskcreatetime;

    private Integer riskcreateid;

    private String riskcreatename;

    private Integer riskstatus;

    private static final long serialVersionUID = 1L;

    public Integer getRiskid() {
        return riskid;
    }

    public void setRiskid(Integer riskid) {
        this.riskid = riskid;
    }

    public String getRiskimfomation() {
        return riskimfomation;
    }

    public void setRiskimfomation(String riskimfomation) {
        this.riskimfomation = riskimfomation == null ? null : riskimfomation.trim();
    }

    public String getNumberonerisks() {
        return numberonerisks;
    }

    public void setNumberonerisks(String numberonerisks) {
        this.numberonerisks = numberonerisks == null ? null : numberonerisks.trim();
    }

    public String getNumbertworisks() {
        return numbertworisks;
    }

    public void setNumbertworisks(String numbertworisks) {
        this.numbertworisks = numbertworisks == null ? null : numbertworisks.trim();
    }

    public String getNumberthreerisks() {
        return numberthreerisks;
    }

    public void setNumberthreerisks(String numberthreerisks) {
        this.numberthreerisks = numberthreerisks == null ? null : numberthreerisks.trim();
    }

    public Date getRiskcreatetime() {
        return riskcreatetime;
    }

    public void setRiskcreatetime(Date riskcreatetime) {
        this.riskcreatetime = riskcreatetime;
    }

    public Integer getRiskcreateid() {
        return riskcreateid;
    }

    public void setRiskcreateid(Integer riskcreateid) {
        this.riskcreateid = riskcreateid;
    }

    public String getRiskcreatename() {
        return riskcreatename;
    }

    public void setRiskcreatename(String riskcreatename) {
        this.riskcreatename = riskcreatename == null ? null : riskcreatename.trim();
    }

    public Integer getRiskstatus() {
        return riskstatus;
    }

    public void setRiskstatus(Integer riskstatus) {
        this.riskstatus = riskstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskid=").append(riskid);
        sb.append(", riskimfomation=").append(riskimfomation);
        sb.append(", numberonerisks=").append(numberonerisks);
        sb.append(", numbertworisks=").append(numbertworisks);
        sb.append(", numberthreerisks=").append(numberthreerisks);
        sb.append(", riskcreatetime=").append(riskcreatetime);
        sb.append(", riskcreateid=").append(riskcreateid);
        sb.append(", riskcreatename=").append(riskcreatename);
        sb.append(", riskstatus=").append(riskstatus);
        sb.append("]");
        return sb.toString();
    }
}