package com.myfund.saveplan.pojo;

import java.util.Date;

public class PubFundKey {
    private String fundcode;

    private Date dealdate;

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode == null ? null : fundcode.trim();
    }

    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }
}