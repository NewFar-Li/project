package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Letterreport implements Serializable {
    private Integer lid;

    private Integer letterid;

    private Date ltime;

    private String lcomplainantname;

    private Integer ldeptid;

    private Integer lpostid;

    private String lpersonbereported;

    private Integer lpbrdeptid;

    private Integer lpbrpostid;

    private String lcontent;

    private String lsynopsis;

    private String lsupervisioncomments;

    private String lsupervisioncommentstime;

    private String ldisciplinarycomments;

    private Date ldisciplinarytime;

    private String lleaderscomments;

    private Date lleaderstime;

    private String lresult;

    private Date lresulttime;

    private String lsupervisionresutl;

    private Date lsupervisionresulttime;

    private Date lcreatetime;

    private Integer lcreateid;

    private String lcreatename;

    private Integer lstatus;

    private static final long serialVersionUID = 1L;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getLetterid() {
        return letterid;
    }

    public void setLetterid(Integer letterid) {
        this.letterid = letterid;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public String getLcomplainantname() {
        return lcomplainantname;
    }

    public void setLcomplainantname(String lcomplainantname) {
        this.lcomplainantname = lcomplainantname == null ? null : lcomplainantname.trim();
    }

    public Integer getLdeptid() {
        return ldeptid;
    }

    public void setLdeptid(Integer ldeptid) {
        this.ldeptid = ldeptid;
    }

    public Integer getLpostid() {
        return lpostid;
    }

    public void setLpostid(Integer lpostid) {
        this.lpostid = lpostid;
    }

    public String getLpersonbereported() {
        return lpersonbereported;
    }

    public void setLpersonbereported(String lpersonbereported) {
        this.lpersonbereported = lpersonbereported == null ? null : lpersonbereported.trim();
    }

    public Integer getLpbrdeptid() {
        return lpbrdeptid;
    }

    public void setLpbrdeptid(Integer lpbrdeptid) {
        this.lpbrdeptid = lpbrdeptid;
    }

    public Integer getLpbrpostid() {
        return lpbrpostid;
    }

    public void setLpbrpostid(Integer lpbrpostid) {
        this.lpbrpostid = lpbrpostid;
    }

    public String getLcontent() {
        return lcontent;
    }

    public void setLcontent(String lcontent) {
        this.lcontent = lcontent == null ? null : lcontent.trim();
    }

    public String getLsynopsis() {
        return lsynopsis;
    }

    public void setLsynopsis(String lsynopsis) {
        this.lsynopsis = lsynopsis == null ? null : lsynopsis.trim();
    }

    public String getLsupervisioncomments() {
        return lsupervisioncomments;
    }

    public void setLsupervisioncomments(String lsupervisioncomments) {
        this.lsupervisioncomments = lsupervisioncomments == null ? null : lsupervisioncomments.trim();
    }

    public String getLsupervisioncommentstime() {
        return lsupervisioncommentstime;
    }

    public void setLsupervisioncommentstime(String lsupervisioncommentstime) {
        this.lsupervisioncommentstime = lsupervisioncommentstime == null ? null : lsupervisioncommentstime.trim();
    }

    public String getLdisciplinarycomments() {
        return ldisciplinarycomments;
    }

    public void setLdisciplinarycomments(String ldisciplinarycomments) {
        this.ldisciplinarycomments = ldisciplinarycomments == null ? null : ldisciplinarycomments.trim();
    }

    public Date getLdisciplinarytime() {
        return ldisciplinarytime;
    }

    public void setLdisciplinarytime(Date ldisciplinarytime) {
        this.ldisciplinarytime = ldisciplinarytime;
    }

    public String getLleaderscomments() {
        return lleaderscomments;
    }

    public void setLleaderscomments(String lleaderscomments) {
        this.lleaderscomments = lleaderscomments == null ? null : lleaderscomments.trim();
    }

    public Date getLleaderstime() {
        return lleaderstime;
    }

    public void setLleaderstime(Date lleaderstime) {
        this.lleaderstime = lleaderstime;
    }

    public String getLresult() {
        return lresult;
    }

    public void setLresult(String lresult) {
        this.lresult = lresult == null ? null : lresult.trim();
    }

    public Date getLresulttime() {
        return lresulttime;
    }

    public void setLresulttime(Date lresulttime) {
        this.lresulttime = lresulttime;
    }

    public String getLsupervisionresutl() {
        return lsupervisionresutl;
    }

    public void setLsupervisionresutl(String lsupervisionresutl) {
        this.lsupervisionresutl = lsupervisionresutl == null ? null : lsupervisionresutl.trim();
    }

    public Date getLsupervisionresulttime() {
        return lsupervisionresulttime;
    }

    public void setLsupervisionresulttime(Date lsupervisionresulttime) {
        this.lsupervisionresulttime = lsupervisionresulttime;
    }

    public Date getLcreatetime() {
        return lcreatetime;
    }

    public void setLcreatetime(Date lcreatetime) {
        this.lcreatetime = lcreatetime;
    }

    public Integer getLcreateid() {
        return lcreateid;
    }

    public void setLcreateid(Integer lcreateid) {
        this.lcreateid = lcreateid;
    }

    public String getLcreatename() {
        return lcreatename;
    }

    public void setLcreatename(String lcreatename) {
        this.lcreatename = lcreatename == null ? null : lcreatename.trim();
    }

    public Integer getLstatus() {
        return lstatus;
    }

    public void setLstatus(Integer lstatus) {
        this.lstatus = lstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lid=").append(lid);
        sb.append(", letterid=").append(letterid);
        sb.append(", ltime=").append(ltime);
        sb.append(", lcomplainantname=").append(lcomplainantname);
        sb.append(", ldeptid=").append(ldeptid);
        sb.append(", lpostid=").append(lpostid);
        sb.append(", lpersonbereported=").append(lpersonbereported);
        sb.append(", lpbrdeptid=").append(lpbrdeptid);
        sb.append(", lpbrpostid=").append(lpbrpostid);
        sb.append(", lcontent=").append(lcontent);
        sb.append(", lsynopsis=").append(lsynopsis);
        sb.append(", lsupervisioncomments=").append(lsupervisioncomments);
        sb.append(", lsupervisioncommentstime=").append(lsupervisioncommentstime);
        sb.append(", ldisciplinarycomments=").append(ldisciplinarycomments);
        sb.append(", ldisciplinarytime=").append(ldisciplinarytime);
        sb.append(", lleaderscomments=").append(lleaderscomments);
        sb.append(", lleaderstime=").append(lleaderstime);
        sb.append(", lresult=").append(lresult);
        sb.append(", lresulttime=").append(lresulttime);
        sb.append(", lsupervisionresutl=").append(lsupervisionresutl);
        sb.append(", lsupervisionresulttime=").append(lsupervisionresulttime);
        sb.append(", lcreatetime=").append(lcreatetime);
        sb.append(", lcreateid=").append(lcreateid);
        sb.append(", lcreatename=").append(lcreatename);
        sb.append(", lstatus=").append(lstatus);
        sb.append("]");
        return sb.toString();
    }
}