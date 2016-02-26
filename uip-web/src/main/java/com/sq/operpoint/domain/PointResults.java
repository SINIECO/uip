package com.sq.operpoint.domain;

/**
 * 数据库查询测点监测通讯情况实体类
 * Created by ywj on 2016/1/27.
 */
public class PointResults{

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private Long id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    private String status;
    private String values;

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    private String sourceCode;
    private String targetCode;
    private String pointName;
    private int sysId;

}
