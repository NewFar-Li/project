package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Riskevaluate implements Serializable {
    private Integer id;

    private String dispositiontitile;

    private String dispositioncontent;

    private Date createdate;

    private Integer departmentid;

    private Integer positionid;

    private Integer risklevelid;

    private String disposeresult;

    private Integer loginid;

    private String createname;

    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDispositiontitile() {
        return dispositiontitile;
    }

    public void setDispositiontitile(String dispositiontitile) {
        this.dispositiontitile = dispositiontitile == null ? null : dispositiontitile.trim();
    }

    public String getDispositioncontent() {
        return dispositioncontent;
    }

    public void setDispositioncontent(String dispositioncontent) {
        this.dispositioncontent = dispositioncontent == null ? null : dispositioncontent.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Integer getRisklevelid() {
        return risklevelid;
    }

    public void setRisklevelid(Integer risklevelid) {
        this.risklevelid = risklevelid;
    }

    public String getDisposeresult() {
        return disposeresult;
    }

    public void setDisposeresult(String disposeresult) {
        this.disposeresult = disposeresult == null ? null : disposeresult.trim();
    }

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dispositiontitile=").append(dispositiontitile);
        sb.append(", dispositioncontent=").append(dispositioncontent);
        sb.append(", createdate=").append(createdate);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", positionid=").append(positionid);
        sb.append(", risklevelid=").append(risklevelid);
        sb.append(", disposeresult=").append(disposeresult);
        sb.append(", loginid=").append(loginid);
        sb.append(", createname=").append(createname);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}