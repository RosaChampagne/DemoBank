package cn.com.bank.entity;

import java.io.Serializable;
import java.util.Date;

public class BankOperateLog implements Serializable{
    private Integer opLgId;

    private Integer opId;

    private Date opLgTime;

    private Integer opLogType;

    private Integer opLogResult;

    private String opLogDesc;

    public Integer getOpLgId() {
        return opLgId;
    }

    public void setOpLgId(Integer opLgId) {
        this.opLgId = opLgId;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Date getOpLgTime() {
        return opLgTime;
    }

    public void setOpLgTime(Date opLgTime) {
        this.opLgTime = opLgTime;
    }

    public Integer getOpLogType() {
        return opLogType;
    }

    public void setOpLogType(Integer opLogType) {
        this.opLogType = opLogType;
    }

    public Integer getOpLogResult() {
        return opLogResult;
    }

    public void setOpLogResult(Integer opLogResult) {
        this.opLogResult = opLogResult;
    }

    public String getOpLogDesc() {
        return opLogDesc;
    }

    public void setOpLogDesc(String opLogDesc) {
        this.opLogDesc = opLogDesc == null ? null : opLogDesc.trim();
    }
}