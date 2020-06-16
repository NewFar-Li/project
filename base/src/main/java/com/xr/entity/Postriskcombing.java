package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Postriskcombing implements Serializable {
    private Integer pid;

    private Integer priskid;

    private Date pyear;

    private Integer pdeptid;

    private Integer pinfomationid;

    private String pproject;

    private String priskpointdescription;

    private String pprobablelvalue;

    private String pcvalue;

    private String pdvalue;

    private String pgrade;

    private String pmeasures;

    private Date pcreatetime;

    private Integer pcreateid;

    private String pcreatename;

    private Integer pstatus;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPriskid() {
        return priskid;
    }

    public void setPriskid(Integer priskid) {
        this.priskid = priskid;
    }

    public Date getPyear() {
        return pyear;
    }

    public void setPyear(Date pyear) {
        this.pyear = pyear;
    }

    public Integer getPdeptid() {
        return pdeptid;
    }

    public void setPdeptid(Integer pdeptid) {
        this.pdeptid = pdeptid;
    }

    public Integer getPinfomationid() {
        return pinfomationid;
    }

    public void setPinfomationid(Integer pinfomationid) {
        this.pinfomationid = pinfomationid;
    }

    public String getPproject() {
        return pproject;
    }

    public void setPproject(String pproject) {
        this.pproject = pproject == null ? null : pproject.trim();
    }

    public String getPriskpointdescription() {
        return priskpointdescription;
    }

    public void setPriskpointdescription(String priskpointdescription) {
        this.priskpointdescription = priskpointdescription == null ? null : priskpointdescription.trim();
    }

    public String getPprobablelvalue() {
        return pprobablelvalue;
    }

    public void setPprobablelvalue(String pprobablelvalue) {
        this.pprobablelvalue = pprobablelvalue == null ? null : pprobablelvalue.trim();
    }

    public String getPcvalue() {
        return pcvalue;
    }

    public void setPcvalue(String pcvalue) {
        this.pcvalue = pcvalue == null ? null : pcvalue.trim();
    }

    public String getPdvalue() {
        return pdvalue;
    }

    public void setPdvalue(String pdvalue) {
        this.pdvalue = pdvalue == null ? null : pdvalue.trim();
    }

    public String getPgrade() {
        return pgrade;
    }

    public void setPgrade(String pgrade) {
        this.pgrade = pgrade == null ? null : pgrade.trim();
    }

    public String getPmeasures() {
        return pmeasures;
    }

    public void setPmeasures(String pmeasures) {
        this.pmeasures = pmeasures == null ? null : pmeasures.trim();
    }

    public Date getPcreatetime() {
        return pcreatetime;
    }

    public void setPcreatetime(Date pcreatetime) {
        this.pcreatetime = pcreatetime;
    }

    public Integer getPcreateid() {
        return pcreateid;
    }

    public void setPcreateid(Integer pcreateid) {
        this.pcreateid = pcreateid;
    }

    public String getPcreatename() {
        return pcreatename;
    }

    public void setPcreatename(String pcreatename) {
        this.pcreatename = pcreatename == null ? null : pcreatename.trim();
    }

    public Integer getPstatus() {
        return pstatus;
    }

    public void setPstatus(Integer pstatus) {
        this.pstatus = pstatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", priskid=").append(priskid);
        sb.append(", pyear=").append(pyear);
        sb.append(", pdeptid=").append(pdeptid);
        sb.append(", pinfomationid=").append(pinfomationid);
        sb.append(", pproject=").append(pproject);
        sb.append(", priskpointdescription=").append(priskpointdescription);
        sb.append(", pprobablelvalue=").append(pprobablelvalue);
        sb.append(", pcvalue=").append(pcvalue);
        sb.append(", pdvalue=").append(pdvalue);
        sb.append(", pgrade=").append(pgrade);
        sb.append(", pmeasures=").append(pmeasures);
        sb.append(", pcreatetime=").append(pcreatetime);
        sb.append(", pcreateid=").append(pcreateid);
        sb.append(", pcreatename=").append(pcreatename);
        sb.append(", pstatus=").append(pstatus);
        sb.append("]");
        return sb.toString();
    }
}