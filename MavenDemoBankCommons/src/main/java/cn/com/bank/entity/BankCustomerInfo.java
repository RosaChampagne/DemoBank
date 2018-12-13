package cn.com.bank.entity;

import java.io.Serializable;

public class BankCustomerInfo implements Serializable {
    private Integer cmId;

    private String cmName;

    private String cmPhone;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName == null ? null : cmName.trim();
    }

    public String getCmPhone() {
        return cmPhone;
    }

    public void setCmPhone(String cmPhone) {
        this.cmPhone = cmPhone == null ? null : cmPhone.trim();
    }
}