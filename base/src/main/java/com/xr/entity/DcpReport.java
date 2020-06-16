package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class DcpReport implements Serializable {
    private Integer id;

    private String reporttype;

    private String report;

    private Date newtime;

    private Integer eid;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype == null ? null : reporttype.trim();
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
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
        sb.append(", id=").append(id);
        sb.append(", reporttype=").append(reporttype);
        sb.append(", report=").append(report);
        sb.append(", newtime=").append(newtime);
        sb.append(", eid=").append(eid);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}